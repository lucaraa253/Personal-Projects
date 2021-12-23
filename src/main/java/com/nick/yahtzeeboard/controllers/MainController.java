package com.nick.yahtzeeboard.controllers;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.nick.yahtzeeboard.models.Player;
import com.nick.yahtzeeboard.services.PlayerService;


@Controller
public class MainController {
    
    @Autowired
    private PlayerService playerServ;


    
    @GetMapping("/")
    public String index(@ModelAttribute("player")Player player,Model model) {
    	List<Player> players = playerServ.allPlayers();
    	model.addAttribute("players", players);
        return "index.jsp";
    }
    @GetMapping("/{id}/yahtzee")
    public String playerNew(@PathVariable("id") Long id,Model model, Player player) {
    	player = playerServ.findPlayer(id);
    	if(player.getDiceOneStatus() == null) {
    		player.setDiceOneStatus(false);
    	}
    	if(player.getDiceTwoStatus() == null) {
    		player.setDiceTwoStatus(false);
    	}
    	if(player.getDiceThreeStatus() == null) {
    		player.setDiceThreeStatus(false);
    	}
    	if(player.getDiceFourStatus() == null) {
    		player.setDiceFourStatus(false);
    	}
    	if(player.getDiceFiveStatus() == null) {
    		player.setDiceFiveStatus(false);
    	}
    	int dice1 = player.getDiceOne();
    	int dice2 = player.getDiceTwo();
    	int dice3 = player.getDiceThree();
    	int dice4 = player.getDiceFour();
    	int dice5 = player.getDiceFive();
    	player.setDiceOneOne(dice1);
    	player.setDiceTwoTwo(dice2);
    	player.setDiceThreeThree(dice3);
    	player.setDiceFourFour(dice4);
    	player.setDiceFiveFive(dice5);

    	if(player.getRoll() >= 5) {
    		player.setRoll(0);
    		player.setDiceOneOne(0);
        	player.setDiceTwoTwo(0);
        	player.setDiceThreeThree(0);
        	player.setDiceFourFour(0);
        	player.setDiceFiveFive(0);
    	}
    	
    	player.setLowerTotal(player.getOnesVal() + player.getTwosVal() + player.getThreesVal() + player.getFoursVal() + player.getFivesVal() + player.getSixesVal());
    	if(player.getLowerTotal() >= 63) {
    		player.setUpperTotal(player.getUpperTotal() + 35);
    	}else {
    		player.setUpperTotal(player.getLowerTotal());
    	}
    	
        model.addAttribute("player", player);
        playerServ.updatePlayer(player);
        return "play.jsp";
        
    }
    
    @RequestMapping(value="/{id}/rollDice", method=RequestMethod.GET)
    public String rollDice(@PathVariable("id") Long id, Player player) {
    		player = playerServ.findPlayer(id);
    		if(player.getRoll() == 0) {
        		player.setRoll(player.getRoll() + 1);
        		player.setDiceOneOne(0);
        
        		player.setDiceTwoTwo(0);

        		player.setDiceThreeThree(0);

        		player.setDiceFourFour(0);


        		player.setDiceFiveFive(0);
        		}
    		if(player.getRoll() > 0) {
    		player.setRoll(player.getRoll() + 1);
    		player.setDiceOne();
    
    		player.setDiceTwo();

    		player.setDiceThree();

    		player.setDiceFour();


    		player.setDiceFive();
    		}
    		
//    	if(player.getDiceOneStatus() == false) {
//    		player.setDiceOne();
//    	}
//    	if(player.getDiceTwoStatus() == false) {
//    		player.setDiceTwo();
//    	}
//    	if(player.getDiceThreeStatus() == false) {
//    		player.setDiceThree();
//    	}
//    	if(player.getDiceFourStatus() == false) {
//    		player.setDiceFour();
//    	}
//    	if(player.getDiceFiveStatus() == false) {
//    		player.setDiceFive();
//    	}


        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }

    @RequestMapping(value="/{id}/holdDiceOne", method=RequestMethod.GET)
    public String holdDice1(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	Player player1 = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	if(player.getDiceOneStatus() == false) {
    		player.setDiceOneStatus(true);
    		
        	player.setDiceOne();
        	
    	}else {
    		player.setDiceOneStatus(false);
    	}
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/holdDiceTwo", method=RequestMethod.GET)
    public String holdDice2(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	Player player1 = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	if(player.getDiceTwoStatus() == false) {
    		player.setDiceTwoStatus(true);
    		
        	player.setDiceTwo();
        	
    	}else {
    		player.setDiceTwoStatus(false);
    	}
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/holdDiceThree", method=RequestMethod.GET)
    public String holdDice3(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	Player player1 = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	if(player.getDiceThreeStatus() == false) {
    		player.setDiceThreeStatus(true);
    		
        	player.setDiceThree();
        	
    	}else {
    		player.setDiceThreeStatus(false);
    	}
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/holdDiceFour", method=RequestMethod.GET)
    public String holdDice4(@PathVariable("id") Long id,  Player player) {
    	player = playerServ.findPlayer(id);
    	if(player.getDiceFourStatus() == false) {
    		player.setDiceFourStatus(true);
    		
        	player.setDiceFour();
        	
    	}else {
    		player.setDiceFourStatus(false);
    	}
    	
    	
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/holdDiceFive", method=RequestMethod.GET)
    public String holdDice5(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	player = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	if(player.getDiceFiveStatus() == false) {
    		player.setDiceFiveStatus(true);
    		
        	player.setDiceFive();
        	
    	}else {
    		player.setDiceFiveStatus(false);
    	}
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/saveScore1", method=RequestMethod.GET)
    public String saveScore1(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	player = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	int total = 0;
    	if(player.getDiceOne() == 1) {
    		total += 1;
    	}
    	if(player.getDiceTwo() == 1) {
    		total += 1;
    	}
    	if(player.getDiceThree() == 1) {
    		total += 1;
    	}
    	if(player.getDiceFour() == 1) {
    		total += 1;
    	}
    	if(player.getDiceFive() == 1) {
    		total += 1;
    	}

    	player.setOnesVal(total);
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/saveScore2", method=RequestMethod.GET)
    public String saveScore2(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	player = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	int total = 0;
    	if(player.getDiceOne() == 2) {
    		total += 2;
    	}
    	if(player.getDiceTwo() == 2) {
    		total += 2;
    	}
    	if(player.getDiceThree() == 2) {
    		total += 2;
    	}
    	if(player.getDiceFour() == 2) {
    		total += 2;
    	}
    	if(player.getDiceFive() == 2) {
    		total += 2;
    	}

    	player.setTwosVal(total);
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/saveScore3", method=RequestMethod.GET)
    public String saveScore3(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	player = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	int total = 0;
    	if(player.getDiceOne() == 3) {
    		total += 3;
    	}
    	if(player.getDiceTwo() == 3) {
    		total += 3;
    	}
    	if(player.getDiceThree() == 3) {
    		total += 3;
    	}
    	if(player.getDiceFour() == 3) {
    		total += 3;
    	}
    	if(player.getDiceFive() == 3) {
    		total += 3;
    	}

    	player.setThreesVal(total);
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/saveScore4", method=RequestMethod.GET)
    public String saveScore4(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	player = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	int total = 0;
    	if(player.getDiceOne() == 4) {
    		total += 4;
    	}
    	if(player.getDiceTwo() == 4) {
    		total += 4;
    	}
    	if(player.getDiceThree() == 4) {
    		total += 4;
    	}
    	if(player.getDiceFour() == 4) {
    		total += 4;
    	}
    	if(player.getDiceFive() == 4) {
    		total += 4;
    	}

    	player.setFoursVal(total);
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/saveScore5", method=RequestMethod.GET)
    public String saveScore5(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	player = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	int total = 0;
    	if(player.getDiceOne() == 5) {
    		total += 5;
    	}
    	if(player.getDiceTwo() == 5) {
    		total += 5;
    	}
    	if(player.getDiceThree() == 5) {
    		total += 5;
    	}
    	if(player.getDiceFour() == 5) {
    		total += 5;
    	}
    	if(player.getDiceFive() == 5) {
    		total += 5;
    	}

    	player.setFivesVal(total);
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/saveScore6", method=RequestMethod.GET)
    public String saveScore6(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	player = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	int total = 0;
    	if(player.getDiceOne() == 6) {
    		total += 6;
    	}
    	if(player.getDiceTwo() == 6) {
    		total += 6;
    	}
    	if(player.getDiceThree() == 6) {
    		total += 6;
    	}
    	if(player.getDiceFour() == 6) {
    		total += 6;
    	}
    	if(player.getDiceFive() == 6) {
    		total += 6;
    	}

    	player.setSixesVal(total);
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }
    @RequestMapping(value="/{id}/reset", method=RequestMethod.GET)
    public String resetGame(@PathVariable("id") Long id, @ModelAttribute("player") Player player, BindingResult result,Model model) {
//    	player = playerServ.findPlayer(id);
    	player = playerServ.findPlayer(id);
    	player.setDiceOneOne(0);
    	player.setDiceTwoTwo(0);
    	player.setDiceThreeThree(0);
    	player.setDiceFourFour(0);
    	player.setDiceFiveFive(0);
    	player.setOnesVal(0);
    	player.setTwosVal(0);
    	player.setThreesVal(0);
    	player.setFoursVal(0);
    	player.setFivesVal(0);
    	player.setSixesVal(0);
    	player.setUpperTotal(0);
    	player.setLowerTotal(0);
    	player.setRoll(0);
    	
        playerServ.updatePlayer(player);
//        model.addAttribute("player", player1);
            return "redirect:/" + id + "/yahtzee";
        }

    
//    @GetMapping("/player/new")
//    public String newIdea(HttpSession sesh,@ModelAttribute("idea") Player player, Model model) {
//    	
//    	return "NewFile.jsp";
//    	}
//    }
//    @PostMapping("/newPlayer")
//    public String newPlayer(@ModelAttribute("newPlayer") Player player,Model model, BindingResult result) {
//        Player player = playerServ.createPlayer();
//		model.addAttribute("player", player);
//
//        return "redirect:/";
//        }
//    }
    
//    @GetMapping("/play")
//    public String playTheGame(Model model, Player player, Long id) {
//    	Long id = (long) 1;
//    	Player player = playerServ.setId(1);
//    	model.addAttribute("player", player);
//        return "play.jsp";
//    }
    

   
 


//    @RequestMapping(value="/rollDice", method=RequestMethod.PUT)
//    public String rollDice(@Valid @ModelAttribute("player")Player player,Model model, BindingResult result) {
//    	
//
//        return "redirect:/index.jsp";
//        }
//    }

};