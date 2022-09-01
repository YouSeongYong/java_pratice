package Ex01;

public interface operaterGame {
	//개발자가 원하는대로 만드세요~ > 추상 클래스
	//개발자는 제공하는 방식대로 만드세요 > 인터페이스
	
	
	// 난수 생성할 수 있는 기능
	public abstract int random();
	//문제를 제출할 수 있는 기능
	public abstract String getQuizMsg();
	//정답을 체크할 수 있는 기능 
	public abstract boolean checkAnswer(int ans);
}
