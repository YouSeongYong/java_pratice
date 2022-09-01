package Ex01;

public class MouseMain {

	public static void main(String[] args) {
		
		//Mouse 설계도를 통하여 mouse 객체 생성하기
		Mouse mouse=new Mouse();
		
		mouse.leftclick();
		mouse.rightclick();
		
		System.out.println();
		//wheelMouse 객체 생성
		wheelMouse wm=new wheelMouse();
		wm.leftclick();
		wm.rightclick();
		wm.wheel();
		System.out.println();
		SmartMouse sm=new SmartMouse();
		
		sm.leftclick();
		sm.rightclick();
		sm.wheel();
		sm.smart();
		
		
	}

}
