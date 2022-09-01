package Ex03추상화;

public class regularEmployeeMain {

	public static void main(String[] args) {
		
		//객체를 생성하느 키워드 > new
		//new >키워드 사용과 동시에 생성자 메소드를 호출할 수 있는 기능!
	 regularEmployee regular=new regularEmployee("SMHRD001","홍길동",4000,400);
		
	
	System.out.println(regular.print());
	System.out.println(regular.getMoneyPay());
		
		
		
	temmpEmployee temp=new temmpEmployee("SMHRD002","채수민",3000);
	System.out.println(temp.print());
	System.out.println(temp.getMoneyPay());
	
	PartTimeEmployee pt=new PartTimeEmployee("SMHRD003","김장독",10,10);
	System.out.println(pt.print());
	System.out.println(pt.getMoneyPay()+"만원");
	}

}
