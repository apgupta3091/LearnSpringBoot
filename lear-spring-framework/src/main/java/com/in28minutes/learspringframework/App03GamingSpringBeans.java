package com.in28minutes.learspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learspringframework.game.GameRunner;
import com.in28minutes.learspringframework.game.GamingConsole;
import com.in28minutes.learspringframework.game.MarioGame;
import com.in28minutes.learspringframework.game.PackmanGame;
import com.in28minutes.learspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)) {
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}

	}

}
