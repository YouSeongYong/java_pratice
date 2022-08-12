package 다중for문;

public class 별짓기 {

	public static void main(String[] args) {

		// 피라미드 별찍기
	//	for (int i = 1; i <= 1; i++) {
	//		System.out.print("*");
	//	}
	//	System.out.println();
	//	for (int i = 1; i <= 2; i++) {
	//		System.out.print("*");
	//	}
		//System.out.println();
	//	for (int i = 1; i <= 3; i++) {
	//		System.out.print("*");
	//	}
	//	System.out.println();
	//	for (int i = 1; i <= 4; i++) {
	//		System.out.print("*");
	//	}
	//	System.out.println();
	//	for (int i = 1; i <= 5; i++) {
	//		System.out.print("*");
	//	}
	//	System.out.println();

		for (int j = 1; j <= 5; j ++) {
			for (int i = 5; i >= j; i--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
