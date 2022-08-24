package 단순if문;

import java.util.Scanner;

public class Ex01if문1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 입력 : ");
		
		int age= sc.nextInt();
		
		//age가 20보다 크거나 같으면 성인입니다 문구 출력
		// > 단순 if문
		//if(조건식 > true/false(비교연산자, 논리 연산자)
		if(age>=20) {
			System.out.println("성인입니다");
			
		}

	}

}
