package while문;

import java.util.Random;
import java.util.Scanner;

public class 랜덤함수my {

	public static void main(String[] args) {
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		
		boolean sw=true;
		
		int rd1=0;
		int rd2=0;
		
		int o=0;
		int x=0;
		
		
		while(true) {
			if(sw==true) {
		 rd1=rd.nextInt(10)+1;
		 rd2=rd.nextInt(10)+1;}
		
		System.out.printf("%d + %d = ",rd1,rd2);
		int num1=sc.nextInt();
		if(rd1+rd2==num1) {
			System.out.println("success!");
			sw=true;
			o++;
			
		}else {System.out.println("Fail!");
			sw=false;
			x++;
			
		}
		System.out.print("계속 하시겠습니까?");
		String answer=sc.next();
		if(answer.equals("N")||answer.equals("n")) {
			System.out.println("프로그램 종료");
			break;
		
		}else if(answer.equals("Y")||answer.equals("y")) {
			continue;
		}
		
		

	}
		System.out.println("맞춘개수" + o);
		System.out.println("맞춘개수" + x);
	}
	
}
