package 배열;

import java.util.Scanner;

public class Ex02로그인배열2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] id = new String[3];
		int[] pw = new int[3];

		while (true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			int answer = sc.nextInt();
			
			if (answer == 1) {
				System.out.println("===회원가입===");
				System.out.print("id 입력 : ");
				String name = sc.next();
				System.out.print("pw 입력 : ");
				int pass = sc.nextInt();
				for (int i = 0; i < id.length; i++) {
					if (id[i] == null) {
						id[i] = name;
						pw[i] = pass;
						System.out.println("가입성공");
						break;
					}

				}

			} else if (answer == 2) {
				System.out.println("===로그인===");
				System.out.println("id 입력 :");
				String name = sc.next();
				System.out.println("pw 입력 : ");
				int pass = sc.nextInt();

				int success = 0;
				for(int i=0;i<id.length;i++) {
					if(id[i].equals(name)&&pw[i]==pass) {
						success++;
						break;
					}
				}
				if(success==1) {
					System.out.println("로그인 성공!!!");
			}else {System.out.println("로그인 실패");
				
				
//				 else if (answer == 3) {
//					System.out.println("프로그램을 종료합니다.");
//					break;
				}
			}
			
			

		}
	}
}