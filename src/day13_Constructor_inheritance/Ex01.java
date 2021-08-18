package day13_Constructor_inheritance;

class Constructor01{
	public Constructor01(String s) {
		System.out.println(s+": 생성자 실행");
	}
	public Constructor01() {
		System.out.println("default 생성자 실행");
	}
	public void test(String s) {
		System.out.println(s + ": test 실행");
	}
	public void test() {
		System.out.println("기본 테스트");
	}
}



public class Ex01 {
	public static void main(String[] args) {
		Constructor01 con = new Constructor01("생성자");
		Constructor01 con1 = new Constructor01();
		
		con.test("테스트");
		con.test();
	}
	
}
