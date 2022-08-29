package 메소드;

public class 피보나치 {

	public static void main(String[] args) {

		fiboprint(7); // fibo()활용해서 특정항 까지 출력

	}

	public static void fiboprint(int n) {
		for (int i = 1; i <= n; i++) {
			if (i <= 1) {
				System.out.println(i);
			} else {
				System.out.println(fibo(i - 2) + fibo(i - 1));
			}
		}

	}

	// 피보나치 수열에 특정 항의 값을 구하는 메서드
	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibo(n - 2) + fibo(n - 1);
		}
	}
}
