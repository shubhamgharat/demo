package com.encap;

public class SetStudentData {

	
	
	StudentVO setStudentData() {
		StudentVO svo=new StudentVO();
		svo.setSid(100);
		svo.setName("Shubhs");
		svo.setAge(20);
		svo.setGender("Male");
		svo.setCity("Alibag");
		return svo;
	}
	
}
