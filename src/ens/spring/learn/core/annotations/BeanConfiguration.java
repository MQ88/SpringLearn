package ens.spring.learn.core.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public Ball ball()
	{
		return new Ball();
	}
}
