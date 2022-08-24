package while문;

import java.util.Scanner;

public class Ex01_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num= 0;
		
		while(true) {//무한반복
			num=sc.nextInt();
			if(num>=10) {// < 반복을 멈출 조건 쓰는거임
				//반복문 멈추는 키워드가 있음 스위치문뿐만 아니라 가능
				//break : 가장 가까운 반복문을 나감
				
				
				//while(){
				      //while
				         //if
				           // break; 3번째 if에서 하는게 아니라 두번째껄 실행시키고 브레이크
				break;
			}
		}
		

	}

}
