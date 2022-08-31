package 어레이리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02뮤직플레이어teacher메소드 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<>();

		while (true) {
			System.out.println("[1]노래 추가 [2]노래 삭제 [3] 종료");
			int menu = sc.nextInt();
			if (menu == 1) {// 노래 추가
				printlist(musiclist);
				System.out.println("[1]마지막 위치 추가 [2]원하는 위치 추가 >>");
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("추가할 노래 입력");
					sc.nextLine();// <<엔터키가 있어서 엔터 처리하고 밑에 값 입력
					String name = sc.nextLine();
					musiclist.add(name);
//					muscilist.add(sc.next()); 도 가능
				} else {// 2
					System.out.println("추가할 노래 입력");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("추가할 위치 입력: ");
					int index = sc.nextInt();
					musiclist.add(index - 1, name);
				}
				System.out.println("추가가 완료되었습니다!");
			} else if (menu == 2) {// 노래삭제
				boolean listEmpty = printlist(musiclist);
				

				if (!listEmpty) {// 비어있지 않으면 삭제기능 수행
					System.out.println("[1]선택 삭제 [2] 전체삭제 >> ");
					int choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("삭제할 노래 선택 : ");
						int delM = sc.nextInt();
						musiclist.remove(delM);
					} else {// 2
						musiclist.clear();
					}
					System.out.println("삭제 완료! ");
				}
			} else {// 3 >종료
				System.out.println("프로그램 종료!");
				break;
			}
		}

	}

	// musiclist 출력 메서드 만들기
	// 메인 메소드에서 만드는 메소드들은 스태틱 붙히기
	public static boolean printlist(ArrayList<String> al) {

		// musiclist 비어있는지 않은지 저장할변수
		boolean isEmptylist = false;
		// 현재 재생목록 출력
		System.out.println("===현재 재생 목록===");
		// isEmpty() > boolean값 ( 값이 없으면 tru 있으면 false
		if (al.isEmpty()) {// 재생 목록이 비어있으면
			System.out.println("재생목록이 없습니다.");
			isEmptylist = true;
		} else {// 재생목록이 비어있지않으면
			int n = 1;
			for (String s : al) {
				System.out.println(n++ + " . " + s);
				// n++ 가능
			}
		}
		System.out.println("=================");
		return isEmptylist;
	}

}
