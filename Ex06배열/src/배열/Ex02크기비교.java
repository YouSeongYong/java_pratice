package 배열;

import java.util.Random;

public class Ex02크기비교 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[10];

		//int max = arr[0]
		//int min= arr[0] <<이거 효율적
		
		int max = 0; // 기억해야 한다 그럼 무조건 변수 선언하기
		int min = 20;
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = rd.nextInt(20) + 1;
			System.out.print(" "+arr[i]);

			if (arr[i] >= max) {

				max = arr[i];// 초기화 1이 나오면 1저장 3이 나오면 3저장
			}
			if (arr[i] <= min) {
				min = arr[i];}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
