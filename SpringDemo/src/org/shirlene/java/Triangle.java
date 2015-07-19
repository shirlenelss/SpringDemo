package org.shirlene.java;

import java.util.List;

public class Triangle {
	
	private String type;
	private int height;
	private List<Point> points;
	
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
			pointLists += a.toString();
		}
		
		System.out.println(getType() + " triangle created at height "+ 
					getHeight() + 
					"@ " + pointLists);
		
	}


	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}
	

}
