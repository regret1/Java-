package com.test01.chap03_field.test02;

public class InitField {
	private String name = "아이폰";
	private int price = 1000000;
	private static String brand = "애플";
	
	//초기화블럭;
	{//인스턴스 초기화 블럭
		name="갤럭시";
		price = 1500000;
		brand = "삼성";
	}
	
	static {//static 초기화 블럭
		//name="폴드"; static 초기화 블럭에서는 non-static필드 초기화 못한다.
		brand="samsung";
	}
	
	
	
	public InitField() {}
	//4. 매개변수 있는 생성자
	
	public InitField(String name, int price, String brand) {
		this.name = name;//객체의 필드 name에 매개변수로 전달받은 name값을 저장.
		this.price = price;
		InitField.brand = brand;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	public static String getBrand() {
		return brand;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static void setBrand(String brand) {
		InitField.brand = brand;
	}
	public void info() {
		System.out.println(name + "," + price +"," + brand);
	}
}
