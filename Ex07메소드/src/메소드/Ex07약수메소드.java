package 메소드;

public class Ex07약수메소드 {

	public static void main(String[] args) {

		getDivisor(10);
		getDivisor(16);
		getDivisor(24);

	}

	public static int getDivisor(int num1 ) {
		System.out.print("10의 약수 : \n");
		for (int i = 1; i <= num1; i++) {

			if (10 % i == 0) {
				System.out.print(i + " ");
			}
		}
		return num1;
		
	}

}
