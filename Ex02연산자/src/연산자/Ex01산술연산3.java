package 연산자;

import java.util.Scanner;

public class Ex01산술연산3 {

	public static void main(String[] args) {
		
		double num3= 3;
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Java 점수 입력: ");
//		int num = sc.nextInt();
//		System.out.print("WEB 점수 입력: ");
//		int num1= sc.nextInt();
//		System.out.print("ANDROID 점수 입력 : ");
//		int num2= sc.nextInt();
//		
//		System.out.println("합계 : "+num+num1+num2);
//		System.out.printf("평균 %.2f",(num+num1+num2)/num3);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Java 점수 입력: ");
		int num = sc.nextInt();
		System.out.print("WEB 점수 입력: ");
		int num1= sc.nextInt();
		System.out.print("ANDROID 점수 입력 : ");
		int num2= sc.nextInt();
		int res=num+num1+num2;
		double res2=(double)res/3;
//		double res2=res/3.0;
		System.out.println(res);
		System.out.printf("%.2f",res2);
				
		
		
	

	}

}
