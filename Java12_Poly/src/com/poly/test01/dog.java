package com.poly.test01;

public class dog extends Animal {
	
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	@Override
	public void eat(String ani) {
		System.out.println(ani);
	}
	
	
}
