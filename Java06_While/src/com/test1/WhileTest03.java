package com.test1;

public class WhileTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 1~100까지의 숫자를 역순으로 출력.
		prn01();
		
		//2. 1~100까지의 숫자 중 2의 배수만 출력.
		prn02();
		
		//3. 1~100까지의 숫자 중, 7의 배수의 갯수와 총 합을 출력
		prn03();
	}
	public static void prn01() {
		int num = 100;
		while(num>0) {
			System.out.println(num);
			num--;
		}
	}
	public static void prn02() {
		int num = 1;
		while(num<=100) {
			if(num%2 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}
	public static void prn03() {
		int num = 1;
		int sum = 0;
		int res = 0;
		while(num<=100) {
			if(num%7==0) {
				res +=1;
				sum +=num;
			}
			num++;
		}
		System.out.println("7의 배수의 갯수 : " + res + " 7의 배수의 총합 : " + sum);
		
	}
	
	
	
	
	
}
