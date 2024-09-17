package com.test01;

import java.util.Scanner;

public class IfTest01 {
	public void testIf() {
		//단독 if문
		//조건식의 결과가 참(true)이면 {}안에 있는 코드 실행
		
		int num = 4;
		
		if (num%2==0) {
			System.out.println("num의 값은 짝수입니다.");
		}
		//짝수가 아닌 조건을 확인
		if(num%2!=0) {
			System.out.println("num의 값은 홀수입니다.");
		}
		
		System.out.println("종료");
	}
	
	public void testIfElse() {
		//if else 문
		//조건이 참인 경우와 거짓인 경우에 수행하는 명령어를 따로 작성
		//else에는 조건식 사용 불가
		int num = 5;
		if (num%2==0) {
			System.out.println("num의 값은 짝수입니다.");
		}else {
			System.out.println("num의 값은 홀수입니다.");
		}
	}
	public void testIfElse02() {
		//50보다 큰 수인지
		//50보다 작은 수인지 확인하고
		//50보다 크다/ 50보다 작다 라고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0보다 큰 정수 입력: ");
		int no = sc.nextInt();
		if(no>50) {
			if (no%2==0) {
			System.out.println("50보다 크고 짝수");
			}else {
				System.out.println("50보다 큰 홀수");
			}
		}else{
			System.out.println("50보다 작다");
		}
	}
	
	public void testIfElse03() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int no = sc.nextInt();
		if(no>=0) {
			if(no==0) {
				System.out.println("0입니다.");
			}else {
				System.out.println("양수입니다.");
			}
		}else {
			System.out.println("음수입니다.");
		}
	}
}
