package annotation.ens.spring.learn.runner;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotation.ens.spring.learn.config.GameConfig;
import annotation.ens.spring.learn.model.Game;

public class PlayGame {

	public static void main(String[] args) {
		
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(GameConfig.class);
		
		Game g1=ac.getBean(Game.class);
		Game g2=ac.getBean(Game.class);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g1.getBall());
		System.out.println(g2.getBall());
		g1.playGame();
      ((ConfigurableApplicationContext)ac).close();
	}

}
