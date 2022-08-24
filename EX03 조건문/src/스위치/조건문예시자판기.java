package 스위치;

import java.util.Scanner;

public class 조건문예시자판기 {

	
		
		
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
				System.out.print("넣을 금액 : ");
				int coin = sc.nextInt();
				System.out.print("--메뉴--\n1.콜라(1800) 2.파워에이드(2000원) 3.탄산수(1200원) >>");
				int input = sc.nextInt();
				int res=0;
				
				switch(input) {
				case 1:
					System.out.printf("잔돈 : %d원\n",coin-1800);
					res = coin-1800;
					break;
				case 2:
					System.out.printf("잔돈 : %d원\n",coin-2000);
					res = coin-2000;
					break;
				case 3:
					System.out.printf("잔돈 : %d원\n",coin-1200);
					res = coin-1200;
					break;
				default:
					System.out.println("메뉴를 다시 출력하세요.");
				}
				
				System.out.println("천원 : " + res/1000);
				System.out.println("오백원 : " + (res%1000)/500);
				//System.out.println("백원 : " + ((res-(res/1000*1000)-(res%1000/500)*100)/100));
				
				
		}
		











	}


