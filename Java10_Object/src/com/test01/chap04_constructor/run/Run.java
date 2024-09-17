package com.test01.chap04_constructor.run;

import java.util.Date;

import com.test01.chap04_constructor.model.User;

public class Run {
	public static void main(String[] args) {
		
		//기본생성자 이용하여 객체 생성
		User u1 = new User();
		u1.info();
		
		u1.setUserId("cj");
		u1.info();
		
		User u2 = new User("user01", "pass01", "이창진");
		u2.info();
		
		User u3 = new User("user02","pass02","김창진",new Date());
		u3.info();
		
	}
}
