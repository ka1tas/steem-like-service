package com.cts.steem.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.steem.bean.Game;

@Repository
public interface GameRepository extends JpaRepository<Game,Integer>{
	List<Game> fetchAllGameDetails();
	Game fetchGameDetails(@Param("gameId") int gameId);
	Game findById(int id);
	//Game fetchGameDetails(int gameId);
}
