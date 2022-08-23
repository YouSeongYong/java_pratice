import java.util.Scanner;

public class Ex01스위치2 {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("월(1~12) 입력 : ");
		int month=sc.nextInt();
		
//		switch(a) {
//		case 3:System.out.println("3월은 봄입니다.");
//		break;
//		
//		case 4:System.out.println("4월은 봄입니다.");
//		break;
//		 
//		case 5:System.out.println("5월은 봄입니다.");
//		break;
//		
//		case 6:System.out.println("6월은 여름입니다.");
//		break;
//		
//		case 7:System.out.println("7월은 여름입니다.");
//		break;
//		
//		case 8:System.out.println("8월은 여름입니다.");
//		break;
//		
//		case 9:System.out.println("9월은 가을입니다.");
//		break;
//		
//		case 10:System.out.println("10월은 가을입니다.");
//		break;
//		
//		case 11:System.out.println("11월은 가을입니다.");
//		break;
//		
//		case 12:System.out.println("12월은 겨울입니다.");
//		break;
//		
//		case 1:System.out.println("1월은 겨울입니다.");
//		break;
//		
//		case 2:System.out.println("2월은 겨울입니다.");
//		break;
//		default:System.out.println("끝");
		
		switch(month) {
		case 3,4,5:
			System.out.println(month+"월은 봄입니다.");
		break;
		case 6,7,8:
			System.out.println(month+"월은 여름입니다.");
		break;
		case 9,10,11:
			System.out.println(month+"월은 가을입니다.");
		break;
		case 12,1,2:
			System.out.println(month+"월은 겨울입니다.");
		break;
		default : System.out.println("고생");
		
		
		}
	}
}
		
		
		
		
		
		
	
		
		


