package com.test01.chap03_field.test01;

public class kindsOfVariable {
	
	//클래스 영역에 작성하는 변수 필드
	//필드 == 멤버변수== 전역변수
	private int globalNum;
	
	public void testMethod(int num) {
		//메소드 영역에 작성하는 변수 지역변수
		//메소드의 괄호 안에 선언하는 변수 매개변수, 매개 변수도 일종의 지역변수
		int localNum;
		
		System.out.println(num);
		//지역변수는 선언 외에 사용 하기 위해서는 반드시 초기화가 되어야 한다.
//		System.out.println(localNum);
		System.out.println(globalNum);
	}
	
	public void testMethod() {
		System.out.println(globalNum);
	}
	
	
}
