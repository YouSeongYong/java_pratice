package 다중for문;

import java.util.Scanner;

public class 약수구하기 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		
		//32 : 1 2 4 8 16 32
		//약수 구하기 : 나누어 떨어지는수
		
		for(int j=2;j<=30;j++) {
			System.out.print(j+"의 약수 : ");
		for(int i=1; i<=j/2;i++) {
			if(j%i==0) {
				System.out.print(i+"  ");
			}
		}
		System.out.println(j);
		}
		
	}

}
