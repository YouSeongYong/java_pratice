package Ex01;

public class AnimalMain {

	public static void main(String[] args) {
		
		//Dog 객체가 잘 생성되고 사용이 되는지 확인해보기
		
		Dog d=new Dog();
		System.out.print("Dog 객체 : ");
		d.eat();
		
		
		Cat c= new Cat();
		System.out.print("Cat 객체 : ");
		c.eat();
		
		
		//형변환(Casting)
		//- 기본 데이터 타입에 대한 형변환 > 데이터의 크기를 변환하는 기능
		//- 객체 타입에 대한 형변환 > 객체의 타입을 변환하는 기능 
		// 객체 타입에 대하여 형변환을 진행 할 때, 꼭 상속의 개념이 있어야한다
		
		//묵시적(자동)형변환 >업캐스팅 개념
		//:자식 클래스가 부모 클래스의 타입으로 형태가 변환 되는것
		//ex) 강아지는 동물이다 > O
		//ex) 고양이는 동물이다 > O
		System.out.println();
		System.out.println("----업캐스팅----");
		Animal a1 =new Dog();
		a1.eat();
		
		Animal a2= new Cat();
		a2.eat();
		//명시적(강제)형변환 > 다운캐스팅
		//동물은 강아지다 > X
		
//		Dog d1= (Dog)new Animal();
		//문법적으로는 문제가 없으나 실행시 오류가 발생한다 > 런타임 오류 
		
		//업캐스팅 되어 있는 객체가 원래의 객체타입으로 돌아가는것!!
		System.out.println();
		System.out.println("----다운캐스팅----");
		
		Dog d1=(Dog)a1;
		d1.eat();
		
		
		
		
		
	}

}
