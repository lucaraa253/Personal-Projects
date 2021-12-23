package com.nick.yahtzeeboard.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nick.yahtzeeboard.models.Player;
import com.nick.yahtzeeboard.repositories.PlayerRepository;





@Service
public class PlayerService {
	private final PlayerRepository playerRepository;
	
	
	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	// returns all the books
		public List<Player> allPlayers() {
			return playerRepository.findAll();
		}

	//  Create
		// creates a book
		public Player createPlayer(Player e) {
			return playerRepository.save(e);
		}

	//  Read one
		// retrieves a book
		public Player findPlayer(Long id) {
			Optional<Player> optionalPlayer = playerRepository.findById(id);
			if (optionalPlayer.isPresent()) {
				return optionalPlayer.get();
			} else {
				return null;
			}
		}

		public void deletePlayer(Long id) {
			playerRepository.deleteById(id);
		}



		public Player updatePlayer(Player idea) {
			return playerRepository.save(idea);

		}
}

