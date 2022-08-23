package while문;

import java.util.Scanner;

public class Ex02_teacher3몸무게 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//현재 몸무게, 목표몸무게 입력
		System.out.print("현재 몸무게 : ");
		int cur =sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal =sc.nextInt();
		
		int week=1; //주차번호
		while(true) {
			System.out.println(week+"주차 감량 몸무게 : ");
			week++;
			int weight=sc.nextInt(); // 각 주차별로 감량한 몸무게
			
			//현재 몸무게 수정
			cur-=weight;
			
			if(cur<=goal) {
				break;
			}
		}
		System.out.println("현재 몸무게 : " +cur);
		
		

	}

}
