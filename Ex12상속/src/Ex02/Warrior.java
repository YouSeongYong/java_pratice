package Ex02;

public class Warrior extends Charac {
	
	//추상 클래스를 상속받는 클래스는
	//해당 추상 메소드에 대하여 구체적인 구현이 이뤄줘야 한다!(강제성)
	
	
	//기본 캐릭터를 물려받은 전사 캐릭터
	// 공격시 : 칼 휘두르기
	// 점프시 : 이단 점프 하기
	
	public void attack() {
		System.out.println("칼 휘두르기");
	}
	public void jump() {
		System.out.println("이단 점프 하기");
	}
}
