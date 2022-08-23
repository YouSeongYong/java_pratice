package 변수;

public class Ex02자료형 {

	public static void main(String[] args) {

		// 1. primitive type(기본타입) : 자바 언어에 내장된 기본 유형
		// 1-1. 논리형 (yes/no, true/false, on/off) >true/false
		boolean sw = true;
		boolean sw1 = false;

		// 1-2. 문자형 (문자 하나만 표현가능)
		char c = '나';
		char c1 = 97; //아스키 코드로 문자를 표현한거
		char c2 = '\uAC00'; //유니코드
		
		//1-3. 정수형 (byte, short, int, long) -자동 형변환
		int num= 3; // 정수 기본형
		short num3 = 1;
		
		long num2 = 4;
		
		//1-4. 실수형( float, double) -강제형변환
		double d= 10.123;
		float f= (float)10.123;
		float f1= 10.123f;
		
		//2. reference type  값 저장, 기능이 정의가 되어있음
		//2-1. 문자열형 (String)
		String s;
		s= "Hello World!";
		
		//출력문 > 콘솔창에 출력하는방법 
		System.out.println(s.substring(0,5));
		System.out.println(s+"!!!!!!!"); //문자열 + 연산기호 사용가능
		System.out.println(s+123); //문자열 + 숫자 > 문자열
		
		
		

	}

}
