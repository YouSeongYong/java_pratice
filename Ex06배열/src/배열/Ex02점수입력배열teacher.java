package 배열;

import java.util.Scanner;

public class Ex02점수입력배열teacher {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//1.크기가 5인 배열 생성, 레퍼런스 변수 선언
		int[]arr=new int[5];
		int max=arr[0];
		int min=arr[0]; //최저점수 0 < 입력을 모두 마치고 해야함
		int sum=0; //총합을 저장할 변수
		//2. 입력한 값을 배열에 저장
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"번째 입력 >> ");
			arr[i]=sc.nextInt();
		}
		max=arr[0];
		min=arr[0];
		//3.배열안에 모든 값 출력
		for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]+" ");
			//총합
			sum+=arr[i];
			//최고점수
			if(arr[i]>=max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("최고 점수 : "+max);
		System.out.println("최저 점수 : "+min);
		System.out.println("총 합 : "+sum);
		System.out.println("평균 : "+sum/arr.length); //<5 이렇게 써도되는데 계속 변하니까
	}

}
