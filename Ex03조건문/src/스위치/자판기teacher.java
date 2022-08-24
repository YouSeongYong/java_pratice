package 스위치;

import java.util.Scanner;

public class 자판기teacher {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.print("넣을 금액  : ");
		int money = sc.nextInt();
	
		System.out.println("==메뉴==");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		int menu = sc.nextInt();
		
		int change = 0; //사용자가 받은 잔돈을 저장할 변수
		//잔돈 계산
		if(menu==1) { //콜라
			//System.out.println("잔돈 : "+ (money-1800)+"원" );
			change = money - 1800;
		}else if(menu==2) {//파워에이드
			//System.out.println("잔돈 : "+ (money-2000)+"원");
			change = money - 2000;
		}else if(menu==3) {//탄산수
			//System.out.println("잔돈 : "+(money-1200)+"원");
			change = money - 1200;
		}else { //1,2,3외 다른 숫자
			System.out.println("메뉴를 다시 선택하세요");
		}
		
		
		//잔돈 계산
		//돈이 넉넉한 경우 : 잔돈 >= 0
		//돈이 부족한 경우 : 잔돈 <0
		if(change>=0) {
			System.out.println("잔돈 : "+change+"원");
			//천원,오백원,백원
			System.out.println("천원 : "+ (change/1000));
			System.out.println("오백원 : "+ ((change%1000)/500));
			System.out.println("백원 : "+ ((change%500)/100));
		}else {
			System.out.println("돈이 부족해요ㅜㅜ");
		}
	}
	}
