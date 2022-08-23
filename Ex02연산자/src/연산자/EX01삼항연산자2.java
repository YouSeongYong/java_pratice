package 연산자;

import java.util.Scanner;

public class EX01삼항연산자2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("농구공의 개수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		int res= num1/5;
		
	
		int res1 =(num1%5)==0? res  : res+1;
		
		System.out.println("필요한 상자개수 : "+ res1);
		
		
//		System.out.println("농구공 개수 : ");
//		
//		int ball = sc.nextInt();
//		
//		int box = (ball%5==0)?ball/5:ball/5+1;
//		
//		System.out.println("필요한 상자의 수 : " +box);
//	}

	}
}
