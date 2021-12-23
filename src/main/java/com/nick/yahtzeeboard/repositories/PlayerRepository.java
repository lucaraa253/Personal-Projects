package com.nick.yahtzeeboard.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.nick.yahtzeeboard.models.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {
	List<Player> findAll();
}
