package com.encap;

public class SStaticDemo {
	static int x=100;
	static int y;
	void display() {
		System.out.println(x);
		x++;
	}
	
	static void Disp()
    {
        int d=100;
        x=900;
        y=200;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SStaticDemo s1=new SStaticDemo();
		SStaticDemo s2=new SStaticDemo();
		SStaticDemo s3=new SStaticDemo();
		s1.display();
		s2.display();
		s3.display();

	}

}
