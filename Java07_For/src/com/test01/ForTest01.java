package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testFor5();
	}

	public static void testFor1() {
		//반복하며 출력문 실행
		for(int i=0;i<10;i++) {
			System.out.println("i = "+i);
		}
	}
	
	public static void testFor2() {
		//반복하며 출력문 실행
		//1~10의 숫자를 역순으로 출력
		for(int i=10;i>0;i--) {
			System.out.println("i = " + i);
		}
		
		//초기식과 증감식은 1개 이상 작성 가능.
		for (int i=0,j=10; i<10 && j>0 ; i++,j--) {
			System.out.println("i : " + i + ", j : "+ j);
		}
		
		for (char ch ='a' ; ch<='z'; ch++) {
			System.out.println(ch);
		}
		int i  = 1;
		for (;;) {
			System.out.print(i);
			i++;
			if(i==10) {
				break;
			}
		}
	}
	
	public static void testFor4() {
		//정수를 하나 입력받아 그 수가 양수일 때만 그 수의 구구단을 출력
		//양수가 아니면 "1~9사이의 양수를 입력하세요" 출력
		System.out.println("숫자를 입력하세요: ");
		int num = new Scanner(System.in).nextInt();
			if(num>0&&num<10) {
				for (int i=1;i<10;i++) {
					System.out.println(num+ " * " + i + " = " + i*num);
				}
			}else {
				System.out.println("1~9사이의 양수를 입력하세요: ");
		}
	
}
	public static void testFor5() {
		//1~100사이의 임의의 난수를 하나 구한 다음
		//1~난수 까지의 합계를 구하고 출력
		int ran = (int)(Math.random()*100)+1;
		int sum = 0;
		for(int i=1;i<=ran;i++) {
			sum +=i;
		}
		System.out.println(ran+","+  sum);
	}
	
}
