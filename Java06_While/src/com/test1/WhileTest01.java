package com.test1;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileTest01.testWhile4();
	}
	
	
	public static void testWhile1() {
		int i =1;
		
		while (i<=10) {
			System.out.println(i+"번째 반복문 수행 중...");
			
			
			i++;
		}
	}
	
	public static void testWhile2() {
		//문자열을 입력받아 인덱스별로 문자 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요: ");
		String str = sc.next();
		
		int i = 0;
		while(i<str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}
	}


	public static void testWhile3() {
		System.out.print("정수 하나 입력: ");
		int num = new Scanner(System.in).nextInt();
		int i=1;
		int sum = 0;
		while (i<=num) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		
		
		
	}
	
	public static void testWhile4() {
		int num=0;
		//키보드로 4를 입력 받을 때 까지 반복.
		// 4가 입력되면 while문 종료.
		while(true) {
			System.out.println("숫자를 입력하세요: ");
			num = new Scanner(System.in).nextInt();
			if(num == 4) {
				System.out.println("종료");
				break;
			}
		}
		
		
	}
	
	
	
}
