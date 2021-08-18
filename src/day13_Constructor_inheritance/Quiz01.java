package day13_Constructor_inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class login {
	String id;
	String pw;
	Scanner scan = new Scanner(System.in);

	public int Login(String id, String pw) {
		if (this.id != null && this.pw != null) {
			System.out.print("id 입력 : ");
			id = scan.next();
			System.out.print("pw 입력 : ");
			pw = scan.next();
			if (this.id.equals(id) && this.pw.equals(pw)) {
				System.out.println("로그인 성공");
				return 1;
			} else {
				System.out.println("로그인 실패");
				return 0;
			}
		} else {
			System.out.println("회원가입 하세요");
		}
		return 0;

	}

	public void sign() {
		System.out.print("id 입력 : ");
		id = scan.next();
		System.out.print("pw 입력 : ");
		pw = scan.next();
		System.out.println("가입 성공");
	}
}

class win7 extends login {
	public void windows() {
		int to = Login(id, pw);
		if (to == 1) {
			System.out.println("윈도우 켜짐");
		} else {

			System.out.println("윈도우 실행 안됨");
		}

	}

}

class Time extends win7 {
	public void sec() {
		for (int i = 0; i < 10; i++) {
			SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");
			Date time = new Date();
			String time1 = format2.format(time);
			System.out.println(time1);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class Quiz01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Time w = new Time();
		
		w.sec();
		while (true) {
			System.out.println("1. 로그인 2. 회원가입");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				w.windows();
				break;
			case 2:
				w.sign();
				break;
			}
		}

	}
}
