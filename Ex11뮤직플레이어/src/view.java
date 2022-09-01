import java.util.Scanner;

public class view {

	public static void main(String[] args) {
		
		// view 역할을 할 수 있는 클래스!
		
		Scanner sc=new Scanner(System.in);
		
		//[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료
		// -사용자가 5번을 선택할 경우에만 프로그램 종료되는 반복문만들기
		
		// Controller 접근을 위한 객체 생성!
		MusicController mc=new MusicController();
	
		while(true) {
			System.out.print("[1]재생 [2]정지 [3]다음곡 [4]이전곡 [5]종료 >> ");
			int menu=sc.nextInt();
			if(menu==5) {
				System.out.println("프로그램 종료...");
				break;
			}else if(menu==1) {
				//controller에게 요청할 메소드 호출!> 메세지 요청!
				mc.play();
				
			}else if(menu==2) {
				mc.stop();
			}else if(menu==3) {
				mc.next();
			} else if (menu == 4) {				
				mc.pre();
			}
		}
		
	}

}
