package com.inherit.par01_inheritTest.berfore.model.vo;

import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Desktop d = new Desktop();
		
		SmartPhone s = new SmartPhone();
		
		Television t = new Television();
		
		 Desktop d2 = new Desktop("삼성", "01", "s-0123", "갤럭시북", "i9", 500, 32, "window11", 200000, new Date(), true);
		d.printInfo();
		d2.printInfo();
		s.printInfo();
		t.printInfo();
	}
}
