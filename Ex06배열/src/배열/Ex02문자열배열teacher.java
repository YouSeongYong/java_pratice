package 배열;

import java.util.Scanner;

public class Ex02문자열배열teacher {

	public static void main(String[] args) {
		//문자열 배열 생성, 레퍼런스 변수 선언
		Scanner sc=new Scanner(System.in);
		String[] arrStr = new String[5];
		
		arrStr[0]= "박진형";
		arrStr[1]= "김설아";
		arrStr[2]= "임다인";
		arrStr[3]= "문재승";
		arrStr[4]= "김지연";
		System.out.println("검색할 이름 입력 >>");
		String name=sc.next();
		
		for(int i=0; i<arrStr.length;i++) {
			if(name.equals(arrStr[i])) {
				System.out.println(name+"님은"+i+"번째 인덱스에 저장되어 있습니다");
			}
		}
	}

}
