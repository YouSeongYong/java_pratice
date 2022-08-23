package 다중for문;

import java.util.Scanner;

public class 완전수구하기 {

	public static void main(String[] args) {
		

		//int sum=0; < 바깥에 있으면 초기화가 안됨 초기화 시킬려면 for 안에다 넣기
		Scanner sc=new Scanner(System.in);
		for(int j=1;j<=1000;j++) {
			int sum=0;
			
			//약수 합 구하는 반복분
		for(int i=1; i<=j/2;i++) {
			if(j%i==0) {
				sum+=i;//자기자신을 제외한 약수들의 합
			}
		}
		if(j==sum) {
			System.out.println(j);
			
		}
		}
	}

}
