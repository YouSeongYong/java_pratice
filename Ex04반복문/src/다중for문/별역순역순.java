package 다중for문;

public class 별역순역순 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 1; j <= 5; j++) {
			for (int i = 4; i >= j; i--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("*");

			}
			System.out.println();
			for(int i=1;i<=5;i++)
				System.out.print("@");
		}

	}
}