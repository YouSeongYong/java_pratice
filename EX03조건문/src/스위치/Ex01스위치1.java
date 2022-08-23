package 스위치;

import java.util.Scanner;

public class Ex01스위치1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("입력 : ");
		String input=sc.next(); //한국어 , 영어, 일본어, 중국어
		
		//switch(식(변수))
		switch(input) {
		case "한국어":
			System.out.println("안녕하세요");
			break;
		case "영어":
			System.out.println("헬로");
			break;
		case "중국어":
			System.out.println("니하오");
			break;
		case "일본":
			System.out.println("곤니찌와");
			break;
			default:
				System.out.println("다시 입력하세요");
			
		
		}
		
		

	}

}
