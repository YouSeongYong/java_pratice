package Ex03추상화;

public class temmpEmployee extends employee {
	
//	String empno;
//	String name;
//	int pay;
//	위에 공통된 부분은 지워도 됨
//	밑에 생성자 메소드 등 다른건 지우면 안됨
	public temmpEmployee(String empno, String name, int pay) {
		//super(); > 상속의 의미에서 부모가 되는 클래스를 지칭하는 키워드
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	public int getMoneyPay() {
		return pay  / 12;
	}
	public String print() {
//		System.out.println("사번 :" + empno + "이름 : " + name + "연봉 : " + pay);
//		return print();
		return "사번 : " + empno + " 이름 : " + name + " 연봉 : " + pay;
	}
}


