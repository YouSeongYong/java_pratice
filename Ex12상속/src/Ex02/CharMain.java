package Ex02;

public class CharMain {

	public static void main(String[] args) {
		
		//추상적으로 만들어진 클래스는
		//미완성되어 있는 클래스로 명확하게 객체 생성을 할 수 없다.
		// > 추상 클래스는  new 키워드 사용할 수 없다.
		// Charac c = new Charac();

//		c.run();
//		c.attack();
//		c.jump();
		System.out.println();

		Warrior sword = new Warrior();

		sword.run();
		sword.attack();
		sword.jump();
		System.out.println();

		Wizard magic = new Wizard();
		magic.run();
		magic.attack();
		magic.jump();

	}

}
