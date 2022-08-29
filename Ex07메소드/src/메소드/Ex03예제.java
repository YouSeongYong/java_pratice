package 메소드;

import java.util.Scanner;

public class Ex03예제 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 정수 :");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 :");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력 (+,-,*,/) : ");
		String op = sc.next();
		System.out.println(cal(num1, num2, op));

	}// 변수이름 상관없음 순서대로 들어가기때문

	public static int cal(int a, int b, String op) {

		if (op.equals("*")) {
			return a * b;

		} else if (op.equals("+")) {
			return a + b;
		} else if (op.equals("-")) {
			int result = a > b ? a - b : b - a;
			return a - b;
		} else if (op.equals("/")) {
			return a / b;
		} else
			return 0;

	}

}
