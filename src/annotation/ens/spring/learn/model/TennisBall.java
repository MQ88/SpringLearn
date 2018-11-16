package annotation.ens.spring.learn.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tennis")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS)
public class TennisBall extends Ball {
	
	public TennisBall()
	{
		System.out.println("TennisBall");
	}
	
	
	@Override
	public void bounce() {
		System.out.print("TennisBall bounce");
		
	}

}
