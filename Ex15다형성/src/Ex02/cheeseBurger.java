package Ex02;

public class cheeseBurger extends Burger {
	
	public void cheesemake() {
		System.out.println("치즈버거 만들기");
	}
	
	//자식이 부모의 기능을 불러오기 위한 메소드
	public void make() {
		super.make();
	}
}
