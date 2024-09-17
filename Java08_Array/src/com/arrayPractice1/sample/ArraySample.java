package com.arrayPractice1.sample;

public class ArraySample {
	public void test1() {
		int[] iarr = new int[10];
		int sum = 0;
		for(int i=0;i<iarr.length;i++) {
			iarr[i] = (int) (Math.random()*100) + 1;
			System.out.println(iarr[i] );
			sum +=iarr[i];
		}
		System.out.print(iarr);
	}
}
