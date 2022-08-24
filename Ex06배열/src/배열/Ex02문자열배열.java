package 배열;

import java.util.Scanner;

public class Ex02문자열배열 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		char[]
//		int[]
//		String[]		
		//문자열 배열 생성 , 레퍼런스 변수 선언 문자형 참조값을 가진다~
		//String[]arrStr1 =new String[8];
		
//		arrStr[0]="박진형";
//		arrStr[1]="김설아";
//		arrStr[2]="임다인";
//		arrStr[3]="문재승";
//		arrStr[4]="김지연";
		String[] arrStr= {"김지은","박수현","정세연","이명훈","강예진","임명진","정형","채수민"};
		String name;
		System.out.println("검색할 이름 입력 >>");
		name=sc.next();
		for(int i=0;i<arrStr.length;i++) {
			if(arrStr[i].equals(name)) {
				System.out.println(name+" 님은 "+i+"번째 인덱스에 저장되어 있습니다.");
				System.out.printf("%s 님은 %d 번째 인덱스에 저장되어 있습니다",name,i);
				
			}
		}
	}

}
