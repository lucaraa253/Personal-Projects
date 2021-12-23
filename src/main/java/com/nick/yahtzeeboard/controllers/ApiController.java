package com.nick.yahtzeeboard.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nick.yahtzeeboard.models.Player;
import com.nick.yahtzeeboard.services.PlayerService;

@RestController
public class ApiController {
    private final PlayerService playerService;
    public ApiController(PlayerService playerService){
        this.playerService = playerService;
    }
//    Different routes because one is a post and one is a get request

    
    @RequestMapping(value="/api/players", method=RequestMethod.POST)
    public Player create(@RequestParam(value="diceOne") Integer diceOne,
    					@RequestParam(value="diceTwo") Integer diceTwo,
    					@RequestParam(value="diceThree") Integer diceThree,
    					@RequestParam(value="diceFour") Integer diceFour,
    					@RequestParam(value="diceFive") Integer diceFive,
    					@RequestParam(value="onesVal") Integer onesVal,
    					@RequestParam(value="twosVal") Integer twosVal,
    					@RequestParam(value="threesVal") Integer   threesVal,
    					@RequestParam(value="foursVal") Integer foursVal,
    					@RequestParam(value="fivesVal") Integer fivesVal,
    					@RequestParam(value="sixesVal") Integer sixesVal,
    					@RequestParam(value="upperTotal") Integer upperTotal,
    					@RequestParam(value="lowerTotal") Integer lowerTotal,
    					@RequestParam(value="roll") Integer roll,
    					@RequestParam(value="round") Integer round,
    					@RequestParam(value="diceOneStatus") Boolean diceOneStatus,
    					@RequestParam(value="diceTwoStatus") Boolean diceTwoStatus,
    					@RequestParam(value="diceThreeStatus") Boolean diceThreeStatus,
    					@RequestParam(value="diceFourStatus") Boolean diceFourStatus,
    					@RequestParam(value="diceFiveStatus") Boolean diceFiveStatus)
    					
{
    	Player player = new Player(diceOne, diceTwo, diceThree, diceFour,diceFive, onesVal, twosVal, threesVal, foursVal, fivesVal, sixesVal, upperTotal, lowerTotal, roll, round, diceOneStatus, diceTwoStatus, diceThreeStatus, diceFourStatus, diceFiveStatus);
        return playerService.createPlayer(player);
    };
    @RequestMapping(value="/api/players/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	playerService.deletePlayer(id);
    };
    

}

