package Ex02;

public abstract class Charac {
	
	//일반 클래스 > 설계가 완성되어 있는 완성 설계도 
	// 추상화 > 완성되지 않은 기본 뼈대만 제공하는 기능 
	
	//추상 메소드는 완성되지 않은 기능의 메소드 이므로 
	//완성 되지 않은 설계도에 포함되어야 한다! > 클래스 추상화가 되어야 한다
	
	// 기본 캐릭터로 간단한 기능을 가질수 있도록 설계
	// run() : 앞으로 전진
	// jump() :위로 점프 
	// attack() : 주먹 휘두르기
	public void run() {
		System.out.println("앞으로 전진");
	}
	
	// 추상화 작업을 위한 키워드! > abstract
	public abstract void jump(); 
//		System.out.println("위로 점프");
	
	public abstract void attack(); 
//		System.out.println("주먹 휘두르기");
	

}
