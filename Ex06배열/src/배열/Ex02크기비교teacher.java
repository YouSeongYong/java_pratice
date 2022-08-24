package 배열;

import java.util.Random;

public class Ex02크기비교teacher {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] arr = new int[10];

		// 랜덤 배열생성
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = rd.nextInt(20)+1;
			System.out.println(arr[i]+ " ");
		}
		//최대값
		//int max=0;
		//최소값
		//int min=20;
		//최대값
		int max=arr[0]; // <<이방법이 효율적
		//최소값
		int min=arr[0];
		
		
		//최대값 구하는 반복문
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		
		
		System.out.println("가장 큰값 : " +max);
		System.out.println("가장 작은 값 : "+min);
	}

}
