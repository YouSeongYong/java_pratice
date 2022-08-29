package 메소드;

public class Ex09메소드오버로딩 {

	public static void main(String[] args) {

		// 메소드 오버로딩 > 메소드 중복정의
		System.out.println(sum(2, 3));
		System.out.println(sum(2, 3, 4));
		System.out.println(1);
		System.out.println("문자"+"문자");
		System.out.println(sum(1,2));
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;

	}
	public static int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
}
