package Ex02;

public class BurgerMain {

	public static void main(String[] args) {
		
		Burger burger=new Burger();
		
		cheeseBurger cheese=new cheeseBurger();
		
		burger.make();
		cheese.cheesemake();
		
		System.out.println();
		
		Burger b1=new cheeseBurger();
		b1.make();
		
		System.out.println();
		cheese.make();
		cheese.cheesemake();
	}

}
