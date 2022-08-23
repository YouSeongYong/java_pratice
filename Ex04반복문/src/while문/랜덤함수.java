package while문;

import java.util.Random;
import java.util.Scanner;

public class 랜덤함수 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		boolean sw = true;// 사용자가 정답을 맞췃을 때 >true(새로운문제로)
							// 사용자가 오답을 작성했을때 >false(기존 문제 그대로)
		int num1 = 0;// 첫번째 랜덤값 저장 변수
		int num2 = 0;// 두번째 랜덤값을 저장할 변수

		int o = 0;// 맞춘개수 저장 변수 while문 안에쓰면 문법적으로는 맞지만 앞에int 변수선언때문에
		int x = 0;// 틀린개수 저장 변수 반복될때마다 초기화됨 누적 안댐

		while (true) {

			if (sw == true) {
				num1 = rd.nextInt(10) + 1;
				num2 = rd.nextInt(10) + 1;
			}

			System.out.printf("%d + %d = ", num1, num2);

			int input = sc.nextInt(); // 사용자가 입력한답

			if (input == num1 + num2) {// 정답을 입력한경우 true인 경우
				System.out.println("Success!");
				sw = true;
				o++;
			} else {// 오답을 입력한경우
				System.out.println("Fail");
				sw = false;
				x++;
			}
			System.out.print("계속 하시겠습니까?");
			String answer = sc.next();
			if (answer.equals("N") || answer.equals("n")) {
				System.out.println("프로그램 종료!");
				break;
			} else if (answer.equals("Y") || answer.equals("y")) {
				continue;// 현재줄 아래에 있는 실행문장은 무시하고 조건확인부분으로 바로이동

			}
		}
		System.out.println("맞춘개수 : " + o);
		System.out.println("틀린개수 : " + x);
	}

}
