package org.shirlene.java;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//for desktop applications-destroy the spring lifecycle
		context.registerShutdownHook();
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		
		

	}
		
}
