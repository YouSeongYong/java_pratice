package 쓰레드활용;

//여러개 스킬을 동시에 사용가능
//멀티쓰레드
//1.Thread 클래스를 상속
public class Ari extends Thread{
	
	private String skill;
	
	public Ari(String key) {
		skill=key;
		
	}
	
	//Thread 클래스 - run 메서드 가 있음(빈깡통)
	//하위클래스 run 메서드 오버라이딩 필수!
	//run() : 하나의 쓰레드 수행할 한가지 작업(코드)
	//쓰레드는 run()에서부터 시작 run()이 종료되면 쓰레드도 종료 
	public void run() {
		System.out.println("입력 키 : "+skill);
		//3초간 스킬 지속 (카운팅)
		for(int i=1;i<=3;i++) {
			System.out.println(skill+"스킬 사용 중 : "+i+"s");
			
		}
		System.out.println(skill+ "스킬 사용 종료 ");
	}
}
