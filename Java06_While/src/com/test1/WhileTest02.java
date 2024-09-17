package com.test1;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
			testDoWhile2();
	}
	
	public static void testDoWhile1() {
		int i = 1;
		
		do { 
			System.out.println(i);
			i++;
		}while(i<=10); 
			System.out.println("do while 종료 후 i:" + i);
		
	}
	
	public static void testDoWhile2() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.print("문자열 입력 : ");
			str = sc.next();
			System.out.print("str : " + str + '\n');
			if(str.equals("exit")) {
				System.out.println("종료");
				break;
			}
		}while(true);
	}
	
	
	
}
