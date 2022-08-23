package while문;

import java.util.Random;
import java.util.Scanner;

public class Ex02_pra5랜덤 {

	public static void main(String[] args) {
		
		//랜덤 도구 생성
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		//1~10까지 중 랜덤 수 뽑기
		//첫번째 랜덤 수 뽑기
		//(10) >0~9
		int y=0;
		int n=0;
		while(true) {
			
			int rd1=rd.nextInt(10)+1;
			int rd2=rd.nextInt(10)+1;
			
			System.out.print( rd1 + "+" + rd2 +"=" );
			int num=sc.nextInt();
			if(rd1+rd2==num) {
				System.out.println("Success!!");
				y++;
				System.out.print("계속 하시겠습니까?? ");
				String answer=sc.next();
				if(answer.equals("N")||answer.equals("n"))
				break;
				
				
			}else {System.out.println("Fail!");
			n++;
			System.out.print("계속 하시겠습니까?? ");
			}String answer=sc.next();
			if(answer.equals("N")||answer.equals("n"))
			{
				
			}
			
			
				
			
			}
		System.out.println("맞춘개수 : " +y);
		System.out.println("틀린개수 : " +n);
			}
		}

			
				
			
			
		
		
		

	


