package while문;

import java.util.Scanner;

public class Ex02_pra {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		int sum=0;
		while(num<10) {
			System.out.print("숫자 입력 : ");
			num=sc.nextInt();
			sum=sum+num;//sum+=num <<똑같음
		
			if(num<0) {
				
				System.out.println("누적결과 : "+(sum+1));
				break;
			}
			
			
		}

	}

}
