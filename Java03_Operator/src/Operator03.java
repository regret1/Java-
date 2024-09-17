
public class Operator03 {
	public static void main(String[] args) {
		new Operator03().opTest2();
	}
	
	//삼항연산자
	//항목이 3개 : (조건식)? 참일때: 거짓일때;
	public void opTest1() {
		int num = -1;
		
		String res = (num>0)?"양수다.":(num==0)?"0이다":"음수다";
		System.out.println(res);
	}
	
	public void opTest2() {
		int num=12;
		
		System.out.println("num: " + num);
		
		num = num+3;
		System.out.println("3 증가 후 num: " + num);
		
		num +=3;
		System.out.println("num에 +=3 실행 : " + num);
	}
}
