package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//else if 구문 . 다중 조건을 줄수 있다.
	//else에 if(조건)더하여 여러가지 조건을 줄수 있다
	public void testElseIf01() {
		int i =10;
		int j = 20;
		
		if(i==j) {
			System.out.println("i와 j가 같습니다.");
		}else if(i>j) {
			System.out.println("i가 j보다 큽니다");
		}else if(i<j) {
			System.out.println("i가 j보다 작습니다");
		}
	}
	
	public void testElseIf02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int point = sc.nextInt();
		char grade;
		
		if(point>=90) {
			grade = 'A';
		}else if(point>=80) {
			grade = 'B';
		}else if(point>=70) {
			grade = 'C';
		}else if(point>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.printf("시험 점수는 %d이고 시험 성적은 %c입니다. ",point,grade );
	}
}
