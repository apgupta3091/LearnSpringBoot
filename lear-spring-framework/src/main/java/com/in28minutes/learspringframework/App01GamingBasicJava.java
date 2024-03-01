package com.in28minutes.learspringframework;

import com.in28minutes.learspringframework.game.GameRunner;
import com.in28minutes.learspringframework.game.MarioGame;
import com.in28minutes.learspringframework.game.PackmanGame;
import com.in28minutes.learspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PackmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
