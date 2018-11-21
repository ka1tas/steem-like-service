package com.cts.steem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.steem.bean.Game;
import com.cts.steem.bean.ShowStoreView;
import com.cts.steem.bean.User;
import com.cts.steem.service.GameService;
import com.cts.steem.service.UserService;

@RestController
public class LoginRestController {
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	


	/*	@PostMapping("/rest/authenticate")
	ResponseEntity<AuthenticationStatus> authenticate(@RequestBody User user) {
		System.out.println("inside authenticate");
		System.out.println(user);
		String password = user.getPassword();
		String actualPassword = null;

		AuthenticationStatus status = new AuthenticationStatus();
		status.setAuthenticated(false);

		User actualUser = userService.getUser(user.getUserName());
		if (actualUser != null) {
			actualPassword = actualUser.getPassword();
		}
		status.setAuthenticated(password.equals(actualPassword));

		return new ResponseEntity<AuthenticationStatus>(status, HttpStatus.OK);

	}
		*/
	
	
	
	
	private GameService gameService;

	@Autowired
	public void setGameService(GameService gameService) {

		this.gameService = gameService;
	}

	
	
	

	@PostMapping("/rest/authenticate")
	public ShowStoreView authenticate (@RequestBody User user){

		ShowStoreView showstore = new ShowStoreView();
		System.out.println("inside authenticate");
		System.out.println(user);
		String password = user.getPassword();
		String actualPassword = null;

		User actualUser = userService.getUser(user.getUserName());
		if (actualUser != null) {
			actualPassword = actualUser.getPassword();
		}
		
		if(password.equals(actualPassword)){
			
		User user1= userService.getUser(user.getUserName());
		List<Game> games = gameService.getGames();
		
		
		showstore.setUser(user1);
		showstore.setGame(games);
			
			
		}
		
		
		return showstore;
		
	
	}

	

}