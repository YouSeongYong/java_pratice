package 변수;

//인코딩방식 (한글, 영문, 한자, 일본어 -> 기계어 ) 방식  (UTF-8, EUC-KR)설정
//EUC-KR (완성형) :유 > 유   / 유 성 용 단어를 인코딩 
//UTF-8  (조합형) :유 > ㅇ ㅠ /자음 모음 하나하나를 인코딩 ㅁㄴㅇㄹ ㅏㅔ
public class Ex01변수선언 {

	public static void main(String[] args) {

//		 ctrl+/ or ctrl+shift+/ > 주석
		// <<주석 코드에 영향을 미치지 않음 - 코드에 대한 설명 작성
		// 변수 : 데이터를 담을수 있는 공간 ( 값 변경 가능)
		// 변수 선언 (자료형 변수 이름;)
		// 자료형 : 변수가 담을 자료의 형태(정수형, 실수형, 문자형, 논리형)
		int num;

		// 변수이름 : 예약어는 사용불가능
		// int class1;

		// 값 할당
		num = 3;

		// alt+shift+r : 변수 일괄 변경
		// ctrl+ shift +f : 코드정렬
		int num4 = 3;
		// ctrl+ alt + 방향키 위,아래 : 코드복사
		// alt+ 방향키 위, 아래 : 코드 순서 바꾸기
		num4 = 5; // 새로운 값 할당
		num4 = 7;

		// 상수 선언 : 값 변경 불가능, final 키워드 사용
		final int num5 = 10;
//		num5 = 12;

	}

}
