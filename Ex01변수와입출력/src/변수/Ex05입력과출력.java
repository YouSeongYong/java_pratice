package 변수;

import java.util.Scanner;

public class Ex05입력과출력 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("이름 : ");
		String s = scan.next();
		System.out.println("나이 : ");
		int num= scan.nextInt();
//		System.out.println("이름은 "+s+" 이고 나이는 "+num+"입니다.");
//		System.out.printf("이름은  %s이고 나이는  %d 입니다",s,num);

	}

}
