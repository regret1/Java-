package com.poly.test05;

import java.util.Scanner;

public class MTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형 선택[1:원 2:사각형]");
		
		int no = sc.nextInt();
		
		Area ar = null;
		
		switch(no) {
		case 1:
			ar = new Circle();
			break;
		case 2:
			ar = new Square();
			break;
		}
		
		ar.make();
		ar.print();
	}
}
