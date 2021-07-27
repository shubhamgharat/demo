package com.encap;

public class Ovrload {

	public int max(int a,int b) {
		return a>b?a:b;
	}
	public double max(double a,double b) {
		return a>b?a:b;
	}
	public static void main(String[] args) {
		Ovrload ov=new Ovrload();
		System.out.println(ov.max(10,30));
		System.out.println(ov.max(2.7,8.5));

	}

}
