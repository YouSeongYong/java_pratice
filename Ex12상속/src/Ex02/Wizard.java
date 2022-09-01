package Ex02;

public class Wizard extends Charac {

	// 기본 캐릭터의 기능을 물려받은 마법사 캐릭터
	// 공격시 "마술봉 휘두르기~~"
	// 점프시 "포털 이동!!"
	public void attack() {
		System.out.println("마술봉 휘두르기~~");
	}
	public void jump() {
		System.out.println("포털 이동!!");
	}
}
