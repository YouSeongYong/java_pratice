import java.util.Scanner;

public class 정수판단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);

			}
		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		}

		// 삼항연산자 활용
//		int num3 = sc.nextInt();
//		int num4 = sc.nextInt();
//		// 삼항연산자 사용 num3/num4중 더 큰숫자 big 더 작은 숫자 small
//		int big = (num3 < num4) ? num4 : num3;
//		int small = (num3 < num4) ? num3 : num4;
//
//		for (int i = small; i <= big; i++) {
//			System.out.println(i);
	}

}
