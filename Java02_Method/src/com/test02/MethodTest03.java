package com.test02;

import com.test01.MethodTest01;
	public class MethodTest03 extends MethodTest01{
		public static void main(String[] args) {
			//static 메소드 실행: class.method();
			MethodTest01.publicMethod();
			MethodTest01.protectedMethod();
//			MethodTest01.defaultMethod();
	//		MethodTest01.privateMethod();
	}
}
