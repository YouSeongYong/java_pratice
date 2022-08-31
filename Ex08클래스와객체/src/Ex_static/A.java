package Ex_static;

public class A {

	public static void main(String[] args) {
		//static(정적) / Heap (

			test01();//<스태틱이 붙어잇어서?
			
			A a= new A();//<이거 없으면 실행 불가능
			a.test02();//스태틱이 없어서 클래스 지정해줘야함
			
			B b=new B();
			b.test03();
		//	B.test03(); <가능
			b.test04();
	}
	
	public static void test01() {
		System.out.println("static이 있는 test01메소드");
	}
	public void test02() {
		System.out.println("static이 없는 test02 메소드");
	}
}
