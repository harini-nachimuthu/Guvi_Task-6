package Ques_3;

public class Circle {
	double radius;
	public Circle(){
		this.radius=2.3;
	}
	//constructor with no argument
	public Circle (double radius) {
		this.radius=radius;
	}
	//getter method
	public double getradius() {
		return radius;
	}
	//setter method
	public void setradius(double radius) {
		this.radius=radius;
	}
	//instance method
	public double circumference() {
		return 2*Math.PI*radius;
	}
	public double area() {
		return Math.PI*radius*radius;
	}
	

}
