package Ex04;

public class person {
	
	//public : 내부 /외부 어디서든 접근할수 있는 지정자
	//private :  같은 클래스 내에서만 접근이 가능한 지정자
	//default(생략가능) : 같은 패키지 안에서 접근이 가능한 지정자
	//protected : 같은 패키지 안에서 접근이 가능한 지정자
	//				(상속의 경우 다른 패키지더라도 접근이 가능하다)
	
	private String name; //<private 현재 여기 클래스에서만 접근 가능
	private int age;
	
	
	//기본 생성자 메소드
	public  person() {

	}
	//생성자 메소드 > 메소드 오버로딩(중복정의)
	public  person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
	}

	public void show() {
		System.out.println("의 이름 : "+name+", 나이 : "+age);
	//	System.out.println("woman 의 이름 : "+name+", 나이 : "+age);
	}
	
}
