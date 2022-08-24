package 배열;

import java.util.Scanner;

public class 배열쉽게하기 {

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
			//확장for문(for~each문) >!!!!!배열, arraylist 다룰때 많이 씀!!!!!
			// 배열의0번인덱스부터 실제값을임시적으로 저장할변수 선언 : 배열의 레퍼런스변수이름
				for(String i:arrStr) {
					System.out.println(i);
				}
	}

}
