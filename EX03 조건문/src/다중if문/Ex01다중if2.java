package 다중if문;

import java.util.Scanner;

public class Ex01다중if2 {

	public static void main(String[] args) {
		// == != 래퍼런스로 절대 비교못함
		//성인, 청소년, 어린이
		Scanner sc=new Scanner(System.in);
		System.out.print("잔액 : ");
		int a=sc.nextInt();
		System.out.print("성인/청소년/어린이 : ");
		String input = sc.next();
		
		if(input.equals("성인")&&a>=1800) 
		{System.out.println("감사합니다");}
		else if(input.equals("청소년")&&a>=1500) 
		{System.out.println("반갑습니다");
		}else if(input.equals("어린이")&&a>=1000) 
		{System.out.println("안녕하세요");
		}else {System.out.println("잔액이 부족합니다");
		
		}

		
		
	
		}
			


	}


