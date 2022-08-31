package Ex01;

public class personMain {

	public static void main(String[] args) {
		
		//설계도를 통해서 실체(= 객체)가 만들어 질수 있는 공간!
		
		//객체 생성하기 >new 키워드!
		//인스턴스 화? 설계도 (class)를 통하여 실제 실체가 만들어 지는 과정
		person 채수민=new person();
		System.out.println(채수민.age);
		
		// 객체 구체화 하기!  > 객체가 가질 데이터값 저장
		채수민.age=27;
		채수민.gender="여";
		채수민.height=165;
		채수민.weight=50;
		System.out.println("성별 :"+채수민.gender);
		
		채수민.move();
		채수민.eat();
	}

}
