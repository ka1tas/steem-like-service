package com.cts.steem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.steem.SteemException;

import com.cts.steem.bean.Game;
import com.cts.steem.repository.GameRepository;

@Service
public class GameService {
	
	private GameRepository gameRepository;

	@Autowired
	public void setGameRepository(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	
	@Transactional
	public List<Game> getGame() throws SteemException {
	
		return gameRepository.fetchAllGameDetails();
	}
	
	@Transactional
	public Game getGameById(int gameId) throws SteemException {
		return gameRepository.fetchGameDetails(gameId);
	}
	
	


	@Transactional
	public List<Game> getGames() {

		return (List<Game>) gameRepository.findAll();

	}



}
