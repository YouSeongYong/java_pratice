package 메소드;

public class Ex01 {
					//메인이라는 이름에 (매개변수가 들어가있음)
	public static void main(String[] args) {
		
		//더하기 기능을 가질수 있는 메소드 생성하기!
		
		//메소드()의 기본구조
		//1.접근제한자 : public >내부/외부 어디서든 사용가능!
		//2.리턴 타입: 메소드의 결과값이 어떤 형태로 나오는지 지정!
		// + 리턴의 타입이 없는 경우 'void' 사용
		//3.메소드 이름 : 메소드의 기능을 사용하기 위해서 이름을 호출
		//4.매개변수 : 일련의 알고리즘을 처리하기 위한 재료값! > x값 이라 생각
		//+return 키워드! : 메소드의 결과에 따라 도출 되어야 하는 결과값 y값
		
		// 메소드 호출 
		int result=sum(2,3);
		System.out.println("결과값 : "+result);
		System.out.println("결과값 : "+sum(2,3));
	}

	
	//메소드를 지정할 수 있는 영역
	//>main() 영역을 벗어나고 아직 class 의 영역 포함 될 때
	public static int sum(int num1, int num2) {
		
		int result=num1+num2;
		
		return result;
	}
	
}
