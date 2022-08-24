package 다중if문;

import java.util.Scanner;

public class Ex01다중if1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		
		int score = sc.nextInt();
		
		if(score>=90) {//90점 이상일경우 A
			System.out.println("A학접입니다.");
		}else if(score>=80) {System.out.println("B학점입니다.");
		}else if(score>=70) {System.out.println("C학점입니다.");
		}else {System.out.println("F학점입니다");
		
		}
	}

}
