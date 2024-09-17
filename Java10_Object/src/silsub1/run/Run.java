package silsub1.run;

import silsub1.model.vo.Member;

public class Run {
    public static void main(String[] args) {
        Member u1 = new Member();
        
        u1.setMemberId("user01");
        u1.setMemberPwd("password123");
        u1.setMemberName("John Doe");
        u1.setAge(30);
        u1.setGender('M');
        u1.setPhone("010-1234-5678");
        u1.setEmail("johndoe@example.com");

        // getter 메소드를 이용해 값 출력
        System.out.println("Member ID: " + u1.getMemberId());
        System.out.println("Password: " + u1.getMemberPwd());
        System.out.println("Name: " + u1.getMemberName());
        System.out.println("Age: " + u1.getAge());
        System.out.println("Gender: " + u1.getGender());
        System.out.println("Phone: " + u1.getPhone());
        System.out.println("Email: " + u1.getEmail());
        u1.info();
    }
}