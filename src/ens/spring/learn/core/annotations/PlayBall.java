package ens.spring.learn.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class PlayBall {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(BallComponentScan.class);
	//	ApplicationContext ac1=new AnnotationConfigApplicationContext(PlayBall.class);
//		AnnotationConfigApplicationContext()

		Ball b=ac.getBean(Ball.class);
		b.bounce();
		
	}

}
