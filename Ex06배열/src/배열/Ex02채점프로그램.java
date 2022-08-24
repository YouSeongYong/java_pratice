package 배열;

import java.util.Scanner;

public class Ex02채점프로그램 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[5];
		
		int score=0;
		int score1=0;
		
		System.out.println("==채점하기==\n답을 입력하세요");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"번답 >> ");
			if(arr[i]<=5) {
				arr[i]=sc.nextInt();
			score+=arr[i];
			}
		
	}
		System.out.println("입력한 답은 : "+score);
	}
}
