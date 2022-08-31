package Ex04;

public class personmain {

	public static void main(String[] args) {
		person man = new person();

		man.setName("홍길동");
		man.setAge(25);

		person woman = new person("김영희", 27);
		System.out.print("man");
		man.show();
		System.out.print("woman");
		woman.show();

	}

}
