package annotation.ens.spring.learn.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("basket")
public class BasketBall extends Ball {

	@Override
	public void bounce() {
		System.out.print("BasketBall bounce");
		
	}

}
