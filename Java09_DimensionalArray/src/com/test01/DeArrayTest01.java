package com.test01;

public class DeArrayTest01 {
	public void test1() {
		//2차원 배열 선언
		
		//선언을 하게 되면 stack에 레퍼런스 변수가 생성
		int[][] iarr1;
		int iarr[][];
		int[] iarr2[];
		
		//할당
		iarr = new int[3][5]; //정변 배열 (모든 행마다 동일한 크기의 배열)
		
		//배열의 레퍼런스를 보관하는 배열은 반드시 크기를 지정.
		iarr2 = new int[3][]; 
		//배열의 레퍼런스를 보관하는 배열에 각각 배열을 생성후 할당하여 주소를 대입.
		iarr2[0] = new int[5];
		iarr2[1] = new int[3];
		iarr2[2] = new int[9];
		
		for(int i=0;i<iarr2.length;i++) {
			for(int j=0;j<iarr2[i].length;j++) {
				System.out.print(iarr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public void test2() {
		//2차원 배열에 값 대입
		int[][] iarr = new int[3][5];
	
		int value = 1;
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr[i].length;j++) {
				iarr[i][j] = value++;
			}
		}
		
		printArray(iarr);
	
	
	}
	
	public void test3() {
		int[][] iarr = {{1,2,3},{4,5,6},{7,8,9}};
		printArray(iarr);
	}
	
	
	public void printArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
