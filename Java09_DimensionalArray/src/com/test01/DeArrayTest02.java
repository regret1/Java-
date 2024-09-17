package com.test01;

public class DeArrayTest02 {
	public void test1() {
		int[][] iarr = new int[8][9];
		
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr[i].length;j++) {
				iarr[i][j] = (i+2)*(j+1); 
			}
		}
		
		new DeArrayTest01().printArray(iarr);
		
		
	}
	
	public void test2() {
		//5x5 2차원 배열 생성
		//생성한 2차원 배열에 값을 대입
		/*
		 1 5 10
		 2 6 11      
		 3 7 12        
		 4 8 13         
		 5 9 14 ... 25          
		
		 
		 */
		int[][] iarr = new int[5][5];
		int value =1;
		for(int i=0;i<iarr.length;i++) {
			for(int j=0;j<iarr.length;j++) {
//				iarr[j][i] = (j+1)+(i*iarr.length);
				iarr[j][i] = value++;
			}
		}
		new DeArrayTest01().printArray(iarr);
		
	}
	
	
	
}
