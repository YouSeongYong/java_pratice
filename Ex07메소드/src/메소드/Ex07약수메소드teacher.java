package 메소드;

public class Ex07약수메소드teacher {

	public static void main(String[] args) {
		
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
	}
	public static void getDivisor(int num) {
		//1~num 범위 
		
		System.out.print(num+" 의 약수 : ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				//약수!
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
