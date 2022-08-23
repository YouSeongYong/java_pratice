package 단순if문;

import java.util.Scanner;

public class Ex01if문3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int score1=sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int score2=sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int score3=sc.nextInt();
		System.out.println("평균 : "+(score1+score2+score3)/3.0);
		if((score1+score2+score3)/3>80) {
			System.out.println("합격");
		}else {System.out.println("불합격");
		
	}
	}
}
