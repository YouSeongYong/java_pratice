package Ex05;

public class pocketmon {

	// 속성(String),이름(String),공격력(int), 레벨, 체력
	// - 외부에서 접근하지 못하도록 private 지정
	private String name;
	private String type;
	private int hp;
	private int lv;
	private int attack;

	// 2. 5개의 매개변수를 받을 수 있는 생성자 메소드 만들기
	// 생성자 메소드 특징
	// 1. 반환 타입 x>void x
	// 2.메소드의 이름은 클래스 명과 동일하다
	// 3.생성자 메소드는 오버로딩이 가능하다
	// 4. 객체 생성시 new 키워드와 함께 호출된다!
	
	//메소드 생성 단축키 :alt +shift +s > 생성자및 getter/stter 생성가능
	public pocketmon(String name, String type, int lv, int hp, int attack) {
		this.name = name;
		this.type = type;
		this.lv = lv;
		this.hp = hp;
		this.attack = attack;

	}

	// 3. 공격하기 attack() > 포켓몬의 기능
	// - 리턴타입 x
	// -메소드 호출시 " 공격하기!" 출력

	public void attack() {
		System.out.println("공격하기!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	// getter/setter(); : 외부로 부터 접근이 가능하고 내부적인 필드에 접근할 수 있는 기능
	// getter() : 데이터를 확인하는 용도!
	// setter() : 데이터를 저장/수정 용도!

}
