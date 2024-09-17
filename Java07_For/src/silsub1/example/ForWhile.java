package silsub1.example;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);
	
	public void printStar1(){
		System.out.print("정수 하나 입력: ");
		int no = sc.nextInt();
		
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=i;j++) {
				if(i==j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void printStar2() {
		System.out.print("정수 입력 : ");
		int no = sc.nextInt();
		
		if(no>0) {
			for(int i=1;i<=no;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}else if(no<0) {
			for(int i=(-no);i>0;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}else {
			System.out.print("출력 기능이 없습니다.");
		}
		
		
	}
	public void countInputCharacter() {
		System.out.print("문자열 입력: ");
		String str = sc.next();
		System.out.print("문자 입력");
		String ch = sc.next();
		int cnt = 0;
		if (ch.length() != 1) {
	        System.out.println("한 글자만 입력해야 합니다.");
	        return;
	    }
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>'A'&&str.charAt(i)<'z') {
				if(str.charAt(i)==ch.charAt(0)) {
					cnt += 1;
				}
			}else {System.out.print("영문자가 아닙니다");
			break;
			}
		}
		System.out.println("포함된 갯수: " +cnt);
	}
	
	
	
}
