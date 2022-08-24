package while문;

import java.util.Scanner;

public class Ex01_1 {

	public static void main(String[] args) {

		// 사용자가 키보드로 숫자 입력
		// 10보다 작은숫자를 입력할 때에만 입력
		// 10보다 같거나 큰숫자 입력하는 순간 그만 입력

		Scanner sc = new Scanner(System.in);

		int num =sc.nextInt();
//		if(num<10) {
//			int num2=sc.nextInt();
//			if(num2<10)
//				{int num3= sc.nextInt();
//			if(num3<10) {
//				
//			}
//		
//	}
//		}

		while (num < 10) {
			num = sc.nextInt();
		}
	}
}
