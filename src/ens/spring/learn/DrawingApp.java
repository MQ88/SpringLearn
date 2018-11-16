package ens.spring.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	
	public static void main(String[] args) {
		
		// BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("resources/spring.xml"));
		
		/* DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		  BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		     reader.loadBeanDefinitions(new FileSystemResource("resources/spring.xml"));*/
		 
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("spring.xml");
		 
		
	     Shapes triangle=(Shapes)beanFactory.getBean("Triangle");
	     Shapes rectangle=(Shapes)beanFactory.getBean("Rectangle");
	     
	     
	
	     triangle.draw();
	     System.out.println(triangle.toString());
	     rectangle.draw();
	}
}
