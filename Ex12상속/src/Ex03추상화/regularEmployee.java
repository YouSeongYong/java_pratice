package Ex03추상화;

public class regularEmployee extends employee {

	
	int bonus;// 보너스

	public  regularEmployee(String empno, String name, int pay, int bonus) {
		this.empno=empno;
		this.name=name;
		this.pay=pay;
		this.bonus=bonus;
	}

	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

//	public String print() {
//		System.out.println("사번 :" + empno + "이름 : " + name + "연봉 : " + pay);
//		return print();
//		return "사번 : " + empno + " 이름 : " + name + " 연봉 : " + pay;
//	}
}