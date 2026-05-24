package com.anshuman.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anshuman.learnspringframework.game.GameRunner;
import com.anshuman.learnspringframework.game.GamingConsole;
import com.anshuman.learnspringframework.game.PacMan;

@Configuration
public class GamigConfiguration {
	@Bean
	//we should use pacMan game
	public GamingConsole game() {
		var game  = new PacMan();
		return game;
	}
	@Bean
	
	//wiering into GameRunnner method
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner  = new GameRunner(game);
		return gameRunner;
	}
	
}
