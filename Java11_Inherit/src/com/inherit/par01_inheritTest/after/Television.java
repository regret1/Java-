package com.inherit.par01_inheritTest.after;

import java.util.Date;

public class Television extends Product{
	//Product클래스를 상속받아 구현.
	//이때 product 의 멤버(필드,메소드) 자신의것처럼 사용 가능하다.
	private int inch;
	
	public Television() {
		super();
	}

	public Television(String brand, String productNumber, String productCode, String productName, int price, Date date,
			int inch) {
		super(brand, productNumber, productCode, productName, price, date);
		this.inch = inch;
		
		System.out.println("procunt를 상속받은 television 클래스 생성자 호출 완료ㅣ...");
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String printInfo() {
		//부모의 필드가 private인 경우 자식 클래스에서 직접 접근 불가능
//		return super.getBrand()+", " + super.getProductNumber();
		
		return super.printInfo() + ", " + this.inch;
	}
	
	
}
