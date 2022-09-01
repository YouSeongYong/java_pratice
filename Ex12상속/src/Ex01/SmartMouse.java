package Ex01;

public class SmartMouse extends wheelMouse{
	
	//좌 클릭
	//우 클릭
	//휠 기능
	// +)SMartMouse만이 가질수 잇는 기능
	// 피로를 감소시키는 기능 > smart
	
	public void smart() {
		System.out.println("피로 감소됩니당");
	}
	
	//물려받기 하였으나 나만의 기능으로 사용할수 있는 기능 만들기
	// > 재정의 의미임! (메소드 오버라이딩)
	// > 상속의 받는 관계에서 메소드의 대하여 재정의를 하는것!!
	public void leftclick() {
		System.out.println("더블 좌클릭 ~~");
	}
	
	public void rightclick() {
		System.out.println("더블 우클릭 ~~");
	}
}


