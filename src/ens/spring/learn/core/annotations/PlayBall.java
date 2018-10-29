package ens.spring.learn.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ens.spring.learn.core.annotations")
public class PlayBall {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(PlayBall.class);

		Ball b=ac.getBean(Ball.class);
		b.bounce();
		
	}

}
