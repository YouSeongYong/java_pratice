package 변수;

//import : 다른 패키지에 있는 클래스/인터페이스 등을 사용할 때 선언하는 구문
import java.util.Scanner;

public class EX04입력문 {

	public static void main(String[] args) {
		//입력에 필요한 도구 : System.in
		//입력한 값을 사용할 수 있도록 해주는 도구 : Scanner
		
		//new : 도구생성
		Scanner scan= new Scanner(System.in);
		
		//기능(메소드) > 결과값 
		//입력(123) > s 변수에 할당 (123)
		//String s = scan.next();
		//String s1= scan.next();
		//System.out.println(s+s1);
		
		//정수입력
//		int num = scan.nextInt();
//		int num2 = scan.nextInt();
//		System.out.println(num+num2);
		
		String s =scan.next();
		System.out.println(s);
		
		scan.nextLine();
		String s1 = scan.nextLine();
		System.out.println(s1);
		
		
		
	

	}

}
