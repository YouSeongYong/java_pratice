package 버블정렬;

import java.util.Arrays;

public class 버블정렬_내림차순 {

	public static void main(String[] args) {
		int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43 };
		
		System.out.println("정렬 전 : " +Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			int cnt=0;
			for(int j=0;j<arr.length-1;j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j + 1]; 
					arr[j + 1] = arr[j];
					arr[j] = temp;
				cnt++;
			}
			}
			if(cnt==0) {
				break;
		}System.out.println(i+1+"번째 : "+Arrays.toString(arr));
	}
	}
}
