package ens.spring.learn.core.annotations;

import org.springframework.stereotype.Component;

@Component
public class Ball {

	private int size;
	
	
	public Ball(int size) {
		super();
		this.size = size;
	}

	public void bounce()
	{
		System.out.println("bouncing ball");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
