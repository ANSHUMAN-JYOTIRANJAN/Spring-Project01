package com.anshuman.learnspringframework;

import com.anshuman.learnspringframework.game.GameRunner;
import com.anshuman.learnspringframework.game.MarioGame;
import com.anshuman.learnspringframework.game.PacMan;
import com.anshuman.learnspringframework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacMan();// 1: Object Creation
		var gameRunner = new GameRunner(game); //2: Object Creation + wiring of Dependencies
		//Gamne is Dependencies of game Runner
		gameRunner.run();
	}

}
