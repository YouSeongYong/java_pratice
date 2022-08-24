package 배열;

import java.util.Random;
import java.util.Scanner;

public class Ex02teacher예제 {

	public static void main(String[] args) {
		Random rd=new Random();//< random 도구 (객체, 인스턴스)\
		int r=rd.nextInt(20)+1;//1~19까지
		
		//1.크기가 10인 1차원정수형 배열을 선언한후 원하는 값으로 초기화하시오.
		int[]arr=new int[10]; //배열생성 > 값 따로 초기화 X(0)
		
		for(int j=0;j<=arr.length-1;j++) {
			arr[j]=rd.nextInt(20)+1;
			System.out.println(arr[j]);
			
		}
//		arr[0]=rd.nextInt(20)+1;
//		arr[1]=rd.nextInt(20)+1;
//		arr[2]=rd.nextInt(20)+1;
//		arr[3]=rd.nextInt(20)+1;
//		arr[4]=rd.nextInt(20)+1;
//		arr[5]=rd.nextInt(20)+1;
//		arr[6]=rd.nextInt(20)+1;
//		arr[7]=rd.nextInt(20)+1;
//		arr[8]=rd.nextInt(20)+1;
//		arr[9]=rd.nextInt(20)+1;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=rd.nextInt(20)+1;
			arr[i]=sc.nextInt();
			
		}
		int cnt=0;
		for(int i=r;i<=arr.length-1;i++) {
			
			if(arr[i]%2==1) {
				cnt++; //<<이렇게 하면 if문 안에 들어왔을떄만 카운트함
				System.out.print(" "+arr[i]);
			}
		}
		System.out.println("홀수 개수 : "+cnt);
//		int[]arr2;   요방법 안됨 int[] arr2 = { } 값이 미리 할당되어있어서?? 무조건 배열생성후 바로 변수까지 선언
//		arr2 = {2,4,6,7,4,8,2,6,8,4}; //크기가 10인 배열을 생성
		
		int []arr2 = {2,4,6,7,4,8,2,6,8,4}; //크기가 10인 배열을 생성
	}

}
