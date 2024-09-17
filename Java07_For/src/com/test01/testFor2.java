package com.test01;

import java.util.Scanner;

public class testFor2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		testFor4();
	}
	
	public static void testFor1() {
		//중첩 반복문
		for(int i =0; i<3; i++) {
			for(int j = 0 ; j<5;j++) {
			System.out.println("i="+i+", j = " + j);
		}}
	}
	
	public static void testFor2() {
		for(int i = 1 ; i<=9; i++) {
			System.out.println("====== "+i+"단 ======");
			for ( int j=1 ; j<=9 ; j++) {
				System.out.println(i +  "*" + j +"="+ i * j);
			}
			System.out.println("\n");
		}
	}
	
	public static void testFor3() {
		
		System.out.println("출력할 줄 수:");
		int row = sc.nextInt();
		for(int i=1; i<=row;i++) {
			System.out.print(i+".");
			for(int j=0; j<5;j++){
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	public static void testFor4() {
		System.out.println("줄 수 입력:");
		int row = sc.nextInt();
		System.out.println("칸 수 입력:");
		int col = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==j) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
