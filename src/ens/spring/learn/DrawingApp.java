package ens.spring.learn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	
	public static void main(String[] args) {
		
		 BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("resources/spring.xml"));
		
		/* DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		  BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		     reader.loadBeanDefinitions(new FileSystemResource("resources/spring.xml"));*/
		 
		//ApplicationContext beanFactory=new ClassPathXmlApplicationContext("spring.xml");
		 
		
	     Triangle t=(Triangle)beanFactory.getBean("Triangle");
	     t.a=20;
	     Triangle t1=(Triangle)beanFactory.getBean("Triangle");
	
	t.draw();
	t1.draw();
	}
}
