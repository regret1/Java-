package com.test01;

import java.util.Scanner;

public class ArrayTest01 {
	public void testArray1() {
		//배열 사용 이유 : 배열 사용 하지 않으면 변수 여러개 사용해야 한다.
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = 0;
		
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=i*10;
		}
		
	}
	
	public void testArray2() {
		//배열의 선언
		//자료형[] 변수명;
		//자료형 변수명[];
		
		//선언은 stack영역에 배열의 주소를 보관할 수 있는 공간을 만드는 것.
		int[] iarr;
		char carr[];
		
		//선언과 동시에 할당
		iarr = new int[5];
		carr = new char[10];
		
		System.out.println("iarr: " + iarr);
		System.out.println("carr: " + carr);
		
		//해쉬코드
		System.out.println("iarr의 hashcode: "+ iarr.hashCode());
		System.out.println("carr의 hashcode: "+ carr.hashCode());
		
		//배열의 길이
		System.out.println("iarr의 길이: " +iarr.length);
		System.out.println("carr의 길이: " +carr.length);
		
		System.out.print("배열의 길이를 입력: ");
		int size = new Scanner(System.in).nextInt();
		double[] darr = new double[size];
		
		System.out.println("darr의 hashcode: "+darr.hashCode());
		System.out.println("darr의 길이: "+darr.length);
		
		//한번 지정한 배열의 크기는 변경 못한다.
		darr = new double[30];//배열의 사이즈 변경이 아닌, 새로운 배열을 생성하여 주소값을 덮어 씌운거다.
		
		System.out.println("수정 후 darr의 hashcode: "+darr.hashCode());
		System.out.println("수정 후 darr의 길이: "+darr.length);
		
		//한번 할당된 배열은 내가 지울 수 없다
		//래퍼런스변수 (주소값 저장하는 변수)를 null을 넣어 더이상 참조 하지 않게 처리 가능.
		//일정 시간이 지난 후 배열은 삭제된다. GC(가비지컬렉터)가 삭제
		darr = null;
		
		System.out.println("삭제 후 darr의 길이: " +darr.length);
		
	}
	
	public void testArray3() {
		//기본적으로 배열을 선언하고 할당하면 지정된 초기값으로 초기화 된다.
		//int의 기본값으로 0초기화
		int[] iarr = new int[5];
//		
//		System.out.println(iarr[0]);
//		System.out.println(iarr[1]);
//		System.out.println(iarr[2]);
//		System.out.println(iarr[3]);
//		System.out.println(iarr[4]);
		for(int i = 0; i<iarr.length;i++) {
			System.out.println(iarr[i]);
		}
		
		String[] sarr = {"aplle","banana","orange"};
	
	
	
	
	
	
	}
	
}
