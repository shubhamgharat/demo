package com.lti;

public class DemoZ {

	public static void main(String[] args) {
		int x=100;
		long y=x;
		
		x=(int)y;
		
		char ch='A';
		int k=ch;
		
		char ch2=(char)k;
		
		System.out.println(ch2);
		System.out.println(k);
		System.out.println(y);

	}

}
