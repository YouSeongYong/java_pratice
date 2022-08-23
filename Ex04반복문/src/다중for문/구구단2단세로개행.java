package 다중for문;

public class 구구단2단세로개행 {

	public static void main(String[] args) {
//		System.out.println("==2단==");
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("2 * %d = %d\n", i, 2 * i);
//
//		}
//		System.out.println("==3단==");
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("3 * %d = %d\n", i, 3 * i);
//		}
//		System.out.println("==4단==");
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("4 * %d = %d\n", i, 4 * i);
//		}
//		
		//2단~9단까지 출력 반복문
		//for문 혹은 while문(반복문) 중첩해서 쓸 수 잇다!
		for(int i=1;i<=4;i++) {
			
			for(int j=2;j<=9;j++) {
				System.out.printf("%d * %d = %d\t",j,i,i*j);
			}
			System.out.println();
		
		}
	}
}
