package com.encap;

public class ConstuctorDemo {
	int x,y,z;
	
	public ConstuctorDemo() {
		x=10;
		y=20;
	}
	
	public ConstuctorDemo(int x1,int y1) {
		x=x1;
		y=y1;
	}
	
	void add()
	{
		z=x+y;
	}
	void display() {
		System.out.println(z);
	}

	public static void main(String[] args) {
		ConstuctorDemo c=new ConstuctorDemo();
		c.add();
		c.display();
		ConstuctorDemo c1=new ConstuctorDemo(20,25);
		c1.add();
		c1.display();

	}

}
