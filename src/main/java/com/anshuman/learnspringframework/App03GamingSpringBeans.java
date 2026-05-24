package com.anshuman.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anshuman.learnspringframework.game.GameRunner;
import com.anshuman.learnspringframework.game.GamingConsole;
import com.anshuman.learnspringframework.game.MarioGame;
import com.anshuman.learnspringframework.game.PacMan;
import com.anshuman.learnspringframework.game.SuperContraGame;
import com.anshuman.learnspringframework.helloworld.HelloWorldConfiguration;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		
		try(var context = new AnnotationConfigApplicationContext(GamigConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		}
		
	}

}
