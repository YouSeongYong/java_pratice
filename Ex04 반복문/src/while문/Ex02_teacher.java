package while문;

import java.util.Scanner;

public class Ex02_teacher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력한 값을 저장할 변수
		int num = 0; //// 초기값 -1 안댐

		// 이전까지 입력한 값의 합을 저장할 변수
		int sum = 0;

		while (num != -1) {//반복을 할조건
			sum = sum + num;// sum+=num;
			num = sc.nextInt();
		}
		System.out.println("합 : " + sum);
		
		while(true) {
			sum = sum + num;// sum+=num;
			num = sc.nextInt();
			if(num==-1) {
				break;
			}
			
		}
	}

}
