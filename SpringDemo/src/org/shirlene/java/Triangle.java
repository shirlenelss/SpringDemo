package org.shirlene.java;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, 
InitializingBean, DisposableBean{
	
	private String type;
	private int height;
	private List<Point> points;
	private ApplicationContext context = null;
	private String beanName;
	
	public Triangle(String type) {
		this.type = type;
	}

	
	public Triangle(String type, int height, List<Point>pointInput) {
		this.type = type;
		this.height = height;
		this.points = pointInput;
		
	}
	
	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		String pointLists = "";
		for (Point a: points){
			pointLists += (pointLists.length() ==0 ? "":" , ") + a.toString();
		}
		
		System.out.println("Bean's name "+ this.beanName + "\n " + 
					getType() + " triangle created at height "+ 
					getHeight() + "\n " +
					"@ " + pointLists);
		System.out.println("childPoints: " + context.getBean("childPoints").toString());
		
	}


	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}


	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}


	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init called for Triangle");
		
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean Destroy called for Triangle beans");
		
	}
	

}
