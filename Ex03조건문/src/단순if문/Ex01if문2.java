package 단순if문;

import java.util.Scanner;

public class Ex01if문2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
//		int num=sc.nextInt();
//		int num2= num%3<=0||num%5<=0?0:1;
//		if(num2==0) {
//			System.out.println("3 또는 5의 배수 입니다");
//			
		int num3=sc.nextInt();
		if(num3%3==0||num3%5==0) {
			System.out.println("3이나 5의배수");
			
		}
		

	}

}
