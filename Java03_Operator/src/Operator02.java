import java.util.Scanner;

public class Operator02 {
	public static void main(String[] args) {
		new Operator02().opTest3();
		
	}
	
	
	
	public void opTest1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1+num2) );
		System.out.println("num1 - num2 = " + (num1-num2) );
		System.out.println("num1 * num2 = " + (num1*num2) );
		System.out.println("num1 / num2 = " + (num1/num2) );
		System.out.println("num1 % num2 = " + (num1%num2) );
	}
	
	public void opTest2() {
		//비교 연산자
		int no1 = 10 , no2 = 20;
		
		System.out.println(no1 != no2);
		System.out.println(no1 <= no2);
		System.out.println(no1 > no2);
		
		
		System.out.println("-----------------");
		
		//no2가 10 이상이고 30 이하인지 확인
		//10 <=no2 <=30 ==> 자바에서는 사용 불가능한 문법
		System.out.println("no2가 10~30사이인지 확인: " + (10<=no2&&no2<=30));
	}
	
	public void opTest3() {
		//&&,||
		//스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		//문자 하나 입력 받아 대문자인지 확인 -> ch >= 'A' && ch <='Z'
		System.out.print("문자 하나 입력: " );
		char ch = sc.next().charAt(0);
		
		System.out.println("영어 대문자인지 확인: "+ (ch>='A' && ch<='Z'));
		
		System.out.print("계속 하시려면 y/Y를 입력하세요: " );
		ch = sc.next().charAt(0);
		
		System.out.println("영어 y인지 확인:" + (ch=='y'|| ch=='Y'));
		
		
	}
}
