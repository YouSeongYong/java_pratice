package while문;

import java.util.Scanner;

public class Ex02_pra4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		while (true) {
//			System.out.print("아이디 : ");
//			String id = sc.next();
//			System.out.print("비밀번호 : ");
//			int pw = sc.nextInt();
//			if (!id.equals("smhrd") && pw != 1234) {
//				System.out.println("로그인 실패");
//			} else if (id.equals("smhrd") && pw == 1234) {
//				System.out.println("로그인 성공!!");
//				break;
//						}
//	}
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			int pw = sc.nextInt();
			if (!id.equals("smhrd") && pw != 1234) {
				System.out.println("로그인 실패");
			} else if (id.equals("smhrd") && pw == 1234) {
				System.out.println("로그인 성공!!");
				break;
	}

}
	}
}
