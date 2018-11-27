package com.cts.steem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.steem.bean.Game;
import com.cts.steem.bean.ShowStoreView;
import com.cts.steem.bean.User;
import com.cts.steem.service.GameService;
import com.cts.steem.service.UserService;

@RestController
@RequestMapping("/rest/store")
public class StoreRestController {
	
	
	

	
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
		
	private GameService gameService;

	@Autowired
	public void setGameService(GameService gameService) {

		this.gameService = gameService;
	}

	
	
	
	@GetMapping("/show")
	public List<Game> showGame (){
		List<Game> games = gameService.getGames();
		System.out.println(games);
		return games;	
	
	}

	
	

	@GetMapping("/showplus")
	public ShowStoreView showStore (int userId){

		ShowStoreView showstore = new ShowStoreView();
		
		User user1= userService.getUser(userId);
		List<Game> games = gameService.getGames();
		
		showstore.setUser(user1);
		showstore.setGame(games);
			
		return showstore;
	}

	
	
	@GetMapping("/showgame")
	public Game showGame (int gameId){

		Game game = gameService.getGame(gameId);
	
		return game;
	}

	

}
