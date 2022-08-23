package 연산자;

import java.util.Scanner;

public class Ex01산술연산4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("초 입력: ");
		int num1= sc.nextInt();
		System.out.printf("%d시 %d분 %d초",num1/3600,num1%3600/60,num1%3600%60);
		
		
		
		

	

	}

}
