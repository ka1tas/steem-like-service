package com.cts.steem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.steem.bean.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

	Game findById( int gameId);

}
