package Ex02;

public class piggyMain {

	public static void main(String[] args) {

		// 설계도에 의한 piggy 객체 생성

		piggybank piggy = new piggybank();
		
		
		// piggy 객체의 money 속성에 1500원 적금하기 << deposit()
		piggy.deposit(1500);
		//piggy 객체의 money 속성에 700원 적금하기
		piggy.deposit(700);
		piggy.showMoney();
		piggy.withdraw(500);
		//현재까지의 입금액 확인하기
		piggy.showMoney();
		
		piggybank piggy2=new piggybank();
		piggy2.deposit(1000);
		
		
		System.out.println("piggy 금액 : ");
		piggy.showMoney();
		System.out.println("piggy2 금액 : ");
		piggy2.showMoney();
		
	}
	
	
}
