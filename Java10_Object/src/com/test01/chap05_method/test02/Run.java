package com.test01.chap05_method.test02;

public class Run {
	public static void main (String[] args) {
		NonStaticMethodTest test = new NonStaticMethodTest();
		
		test.method1();
		
		String res = test.method2();
		System.out.println(res);
		System.out.println(test.method2());
		
		//메소드 실행시 전달하는 인자값의 타입과 순서와 갯수를 메소드의 매개변수와 일치하게 작성
		test.method3(10, 20);
		
		int result = test.method4(20, 20);
		
		
		
	}
}
