package org.student1;
//upcasting program - pgm for getting parent class details only
public class dog extends Inheritance{
	public void display() {
		System.out.println("my name is doggy: " );}
		public void eat() {
			System.out.println("i eat dog food");
	}


			public static void main(String[] args)
				{
					Inheritance lab=new dog();
					// without using extend 
					//Inheritance lab=new Inheritance(); creating obj
					lab.eat();
					lab.bark();
				}
					
				}
		
	


