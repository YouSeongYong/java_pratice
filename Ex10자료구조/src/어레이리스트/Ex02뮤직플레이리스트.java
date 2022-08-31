package 어레이리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02뮤직플레이리스트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 스캐너 next ex) 노래 제목 < 노래만 가져옴
		// nextline
		ArrayList<String> al = new ArrayList<>();
		
		while(true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료>> ");
			int n = sc.nextInt();
			if (n == 1) {
				System.out.println("=======현재 재생 목록 =======");
				if (al.size() > 0) {
				
				System.out.println("재생 목록이 없습니다.\n==========================");
			}

			System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
			n = sc.nextInt();
				if (n == 1) {
					System.out.print("추가 할 노래 입력 : ");
					String name = sc.next();
					al.add(name);
					System.out.println("추가가 완료되었습니다.");
				} else {
					System.out.println("추가 할 노래 입력 : ");
					String name = sc.next();
					System.out.println("추가할 위치 입력 >> ");
					
					int m1=sc.nextInt();
					al.add(m1,name);
					System.out.println("추가가 완료되었습니다.");
				}
				double a = al.size();
				System.out.println(a);
			}

		}
	}
}
