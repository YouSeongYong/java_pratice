package 메소드;

public class Ex08트루출력teacher {

	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		
		boolean divisor=isDivisor(num1,num2);

	}
	public static boolean isDivisor(int num1, int num2) {
		
		if(num1%num2==0) {
			return true;
		}else {
			return false;
		}
	}
}
