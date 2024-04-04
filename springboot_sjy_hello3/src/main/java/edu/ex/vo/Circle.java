package edu.ex.vo;

public class Circle {
	private double radius;
	
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	public double getradius() {
		return radius;
	}
	public void setradius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}	
}
