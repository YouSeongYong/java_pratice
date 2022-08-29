package 메소드;

public class Ex02 {

	public static void main(String[] args) {

		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);

	}

	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	public static void sub(int num1, int num2) {
		// 큰 수에서 작은수를 뺄수 있도록 수정! 알고리즘 만들기
		int  result = num1>num2? num1-num2:num2-num1;
		System.out.println(result);
		 
	}

	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}

	// 메소드 연산에 대한 결과값은 메소드 내에서 출력할 수 있도록 하시오

	// add(int num1, int num2)

	// sub(int num1, int num2)

	// mul(int num1, int num2)

	// div(int num1, int num2)
}
