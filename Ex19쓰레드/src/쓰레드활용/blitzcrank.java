package 쓰레드활용;

//동시에 여러 스킬을 사용할 수 없음
//스킬이 완료되기 전까지 다른 스킬을 사용할 수 없음 > 단일 쓰레드 
public class blitzcrank {

	private String skill;
	
	//특정 스킬을 사용하는 블리츠크랭크 생성 
	public blitzcrank(String key) {
		skill=key;
	}



	//스킬 사용 메서드
	public void run() {
		System.out.println("입력 키 : "+skill);
		//3초간 스킬 지속 (카운팅)
		for(int i=1;i<=3;i++) {
			System.out.println(skill+"스킬 사용 중 : "+i+"s");
			
		}
		System.out.println(skill+ "스킬 사용 종료 ");
	}
	
}
