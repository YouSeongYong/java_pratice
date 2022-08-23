package while문;

import java.util.Scanner;

public class Ex02_pra3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=0;
		
		System.out.print("현재 몸무게 : ");
		int num=sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int num1=sc.nextInt();
		
		while(num>0) {
			a++;
			System.out.print(a+"주차 감량 몸무게 : ");
			num=sc.nextInt();
			
			
			
			
		}
		
		System.out.println("최종 몸무게 : ????");

	}

}
