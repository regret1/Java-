package com.test01.chap01_encapsulation;

public class Main {
	public static void main(String[] args) {
		// 준비
		// 클래스명 변수명 = new 클래스명();
		Account ac = new Account();
		Account b = new Account();
		
		
		
		ac.in(1000);
		//잔액조회
		ac.display();
		
		//ac.balance -= 50;
		
		ac.out(50);
		ac.display();
		
		
		
		
		
	}
}
