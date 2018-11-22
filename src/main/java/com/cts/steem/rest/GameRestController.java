package com.cts.steem.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.steem.SteemException;
import com.cts.steem.bean.Game;
import com.cts.steem.service.GameService;

@RestController
@RequestMapping("/rest/game")
public class GameRestController {
	private GameService gameService;
	
	@Autowired
	public void setGameService(GameService gameService) {
		this.gameService = gameService;
	}

	@GetMapping("/list")
	public List<Game> getAllGames() throws SteemException{
		return gameService.getGame();
	}
	
	@GetMapping("/show/{gameId}")
	public Game showGame(@PathVariable int gameId) throws SteemException	{
		return  gameService.getGameById(gameId);
	}
}