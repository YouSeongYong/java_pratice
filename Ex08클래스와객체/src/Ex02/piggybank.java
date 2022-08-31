package Ex02;

import java.util.Scanner;

public class piggybank {
	// 저금통의 기능을 가질수 있는 설계도 만들기!!!!!

	// 1.필드 > 금액을 관리할수 있는 money

	int money;// 메인에서 넘어와서 1500원 저장

	// 2.메소드 > 리턴타입이 없는 형태로 기본구조 생성하기
	// static 키워드 사용 x
	// static << 메모리를 저장할수 있는 위치
	// -돈을 넣을수 있는 기능 deposit()
	public void deposit(int money) {

		// 적금된 금액을 유지시켜 기억할수 있도록 로직 만들기!
		// this > 클래스(설계도)가 자체적으로 가지고 있는 변수를 가르키는 키워드
		this.money += money;

	}

	// -돈을 인출할 수 있는 기능 withdraw()
	public void withdraw(int money) {
	 this.money -=money;

	}

	// -잔액을 확인할수 있는 기능 showMoney()
	public  void showMoney() {
		
		//System.out.println("현재 잔액 :" + this.money);
		System.out.println("현재 잔액 :" + money);
	}
}
