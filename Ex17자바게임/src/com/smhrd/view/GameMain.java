package com.smhrd.view;

import java.util.Scanner;

import com.smhrd.controller.GameController;
import com.smhrd.model.Charac;

public class GameMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//main 실행되게 되면은
		//사용자가 메뉴(캐릭터 생성, 전투, 내캐릭터 확인, 종료)를 선택 할수 있게함 
		// > Controller -printMenu() 
		//1. GameController 객체 생성후 참조값을 저장하고 있는 레퍼런스변수 선언
		GameController gc= new GameController();
		//메뉴가 반복으로 출력 >사용자는 1~4 숫자 입력 
		//1 > 내캐릭터 생성! 2> 전투모드! 3> 내 캐릭터 확인 4>반복문 종료
		
		//내 캐릭터(라이언/춘식) 저장공간
		Charac myC=null;
		while(true) {
			gc.printMenu();
			int menu=sc.nextInt();
			if(menu==1) {
				System.out.println("내 캐릭터 생성");
				if(myC==null) {
				System.out.println("[1]라이언[2]춘식");
				int select=sc.nextInt();
			//1. 캐릭터는 딱 1개만 생성할 수 있음 
			//만약, 캐릭터가 생성된 상태라면 "이미 생성된 캐릭터가 있습니다!" 출력
				
			//캐릭터가 생성되지 않았을 떄
			//[1]라이언 [2]춘식이 선택하기 
				
			//Controller - myCharac 캐릭터 생성 
			
			//생성된 캐릭터의 타입만 출력 
				//checkMyc >전체 속성 출력
				
				myC=gc.myCharac(select);			
						gc.checkMyc(gc.myCharac(select)); //오른쪽부터 해석하기
				}else {
					System.out.println("이미생성된 캐릭터가 있습니다.");
				
				}
			}else if(menu==2) {
				System.out.println("전투모드");
			if(myC==null) {
				System.out.println("캐릭터를 생성하세요!");
			}else {//캐릭터가 생성되어 있는 경우
				//1. 상대방 캐릭터 생성
				//내 캐릭터가(춘식)-상대방(라이언)내 캐릭터(라이언)-상대방(춘식)
			Charac oppC=gc.oppCharac(myC);
			while(true) {
				System.out.println("[1]공격하기 [2]방어");
				int ad=sc.nextInt();
				//(내캐릭터, 상대방캐릭터, 공격/방어
				boolean cont =gc.battle(myC, oppC, ad);
				//cont가 true이면 계속 전투 
				//cont가 false이면 전투 중단 
			if(cont==false) {
				System.out.println("전투중단");
				break;
			}
			}
			
			}
			
			
			}else if(menu==3) {
				System.out.println("내캐릭터 확인");
				gc.checkMyc(myC);
			
			}else {
				System.out.println("종료");
				break;
			}
		}
		
	}

}
