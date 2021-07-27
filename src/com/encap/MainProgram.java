package com.encap;

public class MainProgram {

	public static void main(String[] args) {
		StudentVO svo=null;
		SetStudentData set=new SetStudentData();
		svo=set.setStudentData();
		DisplayStudent ds=new DisplayStudent();
		ds.displayData(svo);

	}

}
