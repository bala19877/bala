package org.student1;

public class poly {
	public void area() {
		System.out.println("find area of shapes");
	}
	public void area(int r) {
		System.out.println("circle area is "+3.14*r*r);
	}
	public void area(double l,double h) {
		System.out.println(" area of triangle is "+0.5*l*h);
	}
	public void area(int l,int h) {
		System.out.println(" area of rectangle is "+l*h);
	}
	public static void main(String[] args)
	{
		poly shape=new poly();
		shape.area();
		shape.area(10);
		shape.area(6.5,7.2);
		shape.area(5,3);
	}
}
