package while문;

import java.util.Scanner;

public class Ex02_pra2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		int odd=0;
		int even=0;
		while(num!=-1) {
			System.out.print("숫자 입력 : ");
			num=sc.nextInt();
			
			 if(num%2>0) {odd++;}
			else if(num%2==0) {even++;
			
			
			
			}
			
		}
		
		
	System.out.println("홀수 개수 : "+odd);
	System.out.println("홀수 개수 : "+even);

	}

}
