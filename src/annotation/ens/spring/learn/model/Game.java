package annotation.ens.spring.learn.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Game {

	
	private Ball basketBall;

	public Ball getBall() {
		return basketBall;
	}

	
	@Autowired
	@Qualifier("tennis")
	public void setBall(Ball ball) {
		this.basketBall = ball;
	}
	
	public void playGame()
	{
		basketBall.bounce();
	}
	
}
