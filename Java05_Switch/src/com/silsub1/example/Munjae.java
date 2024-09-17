package com.silsub1.example;

import java.util.Scanner;

public class Munjae {
	Scanner sc = new Scanner(System.in);
	public void test1() {
		//국, 영, 수 세 과목(int)의 점수를 키보드로 입력받고,
		//합계와 평균을 계산하고,
		//세 과목의 점수와 평균을 가지고 합격 여부 처리함
		//합격의 조건 : 세 과목의 점수가 각각 40점이상이고,
		//			평균이 60점 이상이면 합격, 
		//			아니면 불합격 처리함
		//합격인 경우에는 과목별 점수와 합계, 평균을 출력하고,
		//불합격인 경우는 "불합격" 출력함
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		if(kor>=40&&eng>=40&&math>40) {
			if((kor+eng+math)/3>=60) {
				System.out.print("국어: "+kor+" 수학: " +  math + "영어: " + eng + "합계: "+kor+math+eng + "평균: " + (eng+math+kor)/3);
			}else {
				System.out.print("불합격");
			}
		}else {
			System.out.print("불합격");
		}
		
	}
	
	public void test2() {
		System.out.println("***초기메뉴*** \n 1.입력 \n 2.수정 \n 3.조회 \n 4.삭제 \n 7.종료 \n 메뉴번호 입력:");
		int no = sc.nextInt();
		switch(no) {
		case 1:
			System.out.println("입력 메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.println("수정 메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("조회 메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴가 선택되었습니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다.");
			break;
		}
	}
	public void test4() {
		
		int no = sc.nextInt();
		String str = "";
		if(no>0) {
			if(no%2==0) {
				str = "짝수다";
			}else {
				str = "홀수다";
			}
		}
		System.out.println(str);
	}
	
	public void inputTest() {
		String name = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		if(name != null && name.length()>0 && age>0 && height>0) {
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
			System.out.println("키: " + height);
		}
	}
	
	public void test6() {
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		if(no1>0&&no2>0) {
			System.out.println("첫번째 정수: " +no1 + "\n두번째 정수: "+no2+"\n"+no1+" + "+no2+" = "+(no1+no2)+"\n"+no1+" - "+no2+" = "+(no1-no2)+
					"\n"+no1+" * "+no2+" = "+no1*no2+
					"\n"+no1+" / "+no2+" = "+no1/no2
					+"\n"+no1+" % "+no2+" = "+no1%no2);
		}
	}
	
	
	
	
}
