package com.encap;

public class ConsChaining {

	public ConsChaining() {
		this(10);
		System.out.println("Default");
	}
	
	public ConsChaining(int a,int b) {
		
		System.out.println("2 parameters- "+a+" "+b);
	}
	
	public ConsChaining(int a) {
		this(10,20);
		System.out.println("1 parameter- "+a);
	}
	public static void main(String[] args) {
		

		ConsChaining x=new ConsChaining();
	}

}
