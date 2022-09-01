package com.smhrd.controller;

import java.util.Scanner;

import com.smhrd.model.Charac;
import com.smhrd.model.Chunsik;
import com.smhrd.model.Ryan;

public class GameController implements GameInterface {
	
	private Charac charac = null;
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void printMenu() {
		System.out.print("[1]내 캐릭터 생성 [2]전투모드 [3] 내 캐릭터 확인 [4] 종료");
		
	}
	//내 캐릭터 생성
	@Override
	//Charac myC=null; //라이언/춘식 생성된 객체 담을용도
	public Charac myCharac(int select) {
		//1번 선택 > 라이언 객체 생성
		//2번 선택 > 춘식 객체 생성
		//생성된 캐릭터 반환 
		
		if(select==1) {
			charac = new Ryan();//업스캐팅 자동형변환 부모꺼 쓰겟다
		}else if(select==2){
			charac = new Chunsik();
		}
		
		
		
		return this.charac;
	}

	@Override
	public Charac oppCharac(Charac myCharac) {
		//내캐릭터 어떤 타입인지
		//myCharac가 원래 라이언 타입 이었니?
		//원래 라이언이다> true
		//원래 라이언 타입이 아니었다 > false
		Charac opp=null;
		
		if(charac instanceof Ryan) {
			//춘식이 생성
			opp=new Chunsik();
			System.out.println("야생의 춘식이가 나왔씁니다!");
		}else if(charac instanceof Chunsik) {
			//라이언 생성
			opp=new Ryan();
			System.out.println("야생의 라이언이 나왓스빈다!");
		}
		return opp;
	}
	
	//한번의 공격- 방어
	//한캐릭터라도 죽은 경우에는 >false
	//계속 전투를 할 수 잇는 경우(아무도 죽지 않은경우)에는 true
	@Override
	public boolean battle(Charac myC, Charac oppC, int ad) {
		//1.사용자가 1>공격
		//내캐릭터는 상대방 공격, 상대방은 방어
		//2. 사용자가 2> 방어
		//상대방은 내캐릭터를 공격, 내캐릭터는 방어
		if(ad==1) {//내캐릭터가 공격
			myC.attack(oppC);
			oppC.defence();
		}else if(ad==2) {
			myC.defence();
			oppC.attack(myC);
		}
		
		System.out.println("내캐릭터 HP : "+myC.getHp());
		System.out.println("상대 캐릭터 HP : "+oppC.getHp());
		//내 캐릭터의 체력(hp)와 상대방 캐릭터의 체력(hp)을 출력
		
		//1.내캐릭터가 죽었는지(myC HP<=0)
		//내 캐릭터의 경험치를 -10감소 
		//전투종료
		
		//2.상대방캐릭터가 죽었는지(oppC HP<=0)
		//내 캐릭터의 경험치를 +10증가
		//만약에 경험치를 10 증가시킨후 내 경험치가 30이상이 되면은
		// > 레벨 1증가 
		
		//캐릭터중 하나라도 죽은 캐릭터가 있으면 False 반환 
		//죽은 캐릭터가 없으면 true 반환 
		
		boolean cont=true; //전투를 계속 할수있는지 없는지
		if(myC.getHp()<=0) {
			if(myC.getXp()>=10) {
				myC.setXp(myC.getXp()-10);
			}else {//경험치가 10보다 작을때는 무조건 0으로 수정
				myC.setXp(0);
			}
			System.out.println(myC.getType()+"이 죽었습니다");
			cont=false;
		}else if(oppC.getHp()<=0) {
			myC.setXp(myC.getXp()+10);
			
			if(myC.getXp()>=30) {
				myC.levelUp();
			}
			System.out.println(oppC.getType()+"이 죽었습니다");
			cont=false;
		}
//			System.out.println(myC.getType()+"이 사망하였습니다 종료");
//		}else if(oppC.getHp()<=0) {
//			myC.getXp();
//			System.out.println("죽었");
//		}if(myC.getXp()>=30) {
//			myC.levelUp();
//		}
	
		return cont;
		}
	
	//내캐릭터 현재 상태 출력
	//타입 hp,xp,atk...
	@Override
	public void checkMyc(Charac myC) {
		System.out.println("타입 : "+charac.getType());
		System.out.println("레벨 : "+charac.getLevel());
		System.out.println("체력 : "+charac.getHp());
		System.out.println("경험치 : "+charac.getXp());
		System.out.println("공격력 : "+charac.getAtk());
		System.out.println("방어력 : "+charac.getDef());
			
			
			
		
		
	}

}
