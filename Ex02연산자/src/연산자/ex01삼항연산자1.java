package 연산자;

import java.util.Scanner;

public class ex01삼항연산자1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();

//		System.out.print(num1%2==1?num1+" 는(은) 홀수입니다. ":num1+" 는(은) 짝수입니다.");
		String result = (num1 % 2 == 0) ? "짝수" : "홀수";
//		System.out.println(result);
		System.out.printf("%d는(은) %s입니다.", num1, result);

	}

}
