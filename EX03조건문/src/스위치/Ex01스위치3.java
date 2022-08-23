package 스위치;

import java.util.Scanner;

public class Ex01스위치3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c=0;
		System.out.print("넣을 금액 : ");
		int a = sc.nextInt();
		System.out.println("--메뉴--");
		System.out.println("1.콜라(1800원) 2. 파워에이드(2000원) 3.탄산수(1200원) >> ");
		int b= sc.nextInt();
		
		switch(b) {
		case 1: System.out.println("잔돈 : "+(a-1800)+"원");
		c=a-1800;
		break;
		case 2: System.out.println("잔돈 : "+(a-2000)+"원");
		c=a-2000;
		break;
		
		case 3: System.out.println("잔돈 : "+(a-1200)+"원");
		c=a-1200;
		break;
		
		default : System.out.println("메뉴에 없어요 ㅠㅡㅠ");
		}
		if(c>=0) {
			System.out.println("돈이 부족해요 ");
			
		}
		System.out.println("천원 : " + (c/1000));
		System.out.println("오백원 : " + (c%1000/500));
		System.out.println("백원 : " + (c%500/100));
		System.out.println("십원 :  "+(c%100/10));
	}

}
