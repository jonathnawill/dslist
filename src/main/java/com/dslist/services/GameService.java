package com.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dslist.dto.GameMinDTO;
import com.dslist.entities.Game;
import com.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;

	public List<GameMinDTO> findAll() {
		List<Game> result = repository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
