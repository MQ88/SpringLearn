package ens.spring.learn.core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Game {


	@Autowired
	private Ball ball;

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	
	public void playball()
	{
		ball.bounce();
	}
	
	
}
