package 배열;

import java.util.Scanner;

public class Ex02채점프로그램teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 실제 답을 저장하고 있는 배열
		int[] answer = { 1, 4, 3, 2, 1 };
		// 사용자가 입력한 답을 저장하는 배열
		int[] input = new int[5];

		for (int i = 0; i < input.length; i++) {
			System.out.print(i + 1 + "번 답 >>");
			input[i] = sc.nextInt();
		}
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");

		}
		int sum = 0; // 총합을 저장할 변수
		System.out.println();
		// 답을 비교하는 반복문
		// for(int i=0;i<5)5라는 값이 들어가는게 중요 input answer 똑같읜까
		for (int i = 0; i < input.length; i++) {
			if (answer[i] == input[i]) {
				System.out.print("o");
				sum+=20;
			} else {
				System.out.print("x");
			}
		}
		System.out.println("\n총합 : "+sum);
	}

}
