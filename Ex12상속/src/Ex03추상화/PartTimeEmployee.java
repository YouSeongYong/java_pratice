package Ex03추상화;

public class PartTimeEmployee extends employee {

//	String empno;// 사번
//	String name; // 이름
//	int pay; // 일당
	int workDay; // 일수

	//공통된 부분만 상속받은거임

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}

	
	public int getMoneyPay() {
		return pay * workDay;
	}

	public String print() {
		return "사번 : "+empno+" 이름 :" + name + " 일당 : " + pay;
	}
}
