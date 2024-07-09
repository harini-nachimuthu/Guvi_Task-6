package Ques_3;

public class Main_class {
	public static void main(String[] args) {
		Circle c1=new Circle();
		Circle c2=new Circle(8);
		Circle c3=new Circle();
		Circle c4=new Circle(8);
		System.out.println("No argument : "+ c1.getradius());
		System.out.println("No argument : "+ c1.circumference());
		System.out.println("----------------------");
		System.out.println("Argument : "+ c2.getradius());
		System.out.println("Argument : "+ c2.circumference());
		System.out.println("----------------------");
		System.out.println("No argument : "+ c3.getradius());
		System.out.println("No argument : "+ c3.area());
		System.out.println("----------------------");
		System.out.println("Argument : "+ c4.getradius());
		System.out.println("Argument : "+ c4.area());
	}

}
