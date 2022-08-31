package 스택;

//배열 활용스택 만들기
public class ArrayStack {
	// 필드(private),메서드(생성자, get(가져오기),set(수정하기))

	// 필드 : 배열, 스택 용량 (최대 요소 개수),포인터(top)

	private int[] stk; // 스택용 배열
	private int capacity; // 스택 용량
	private int ptr; // 스택포인트 -다음 요소 들어올수 있는 인덱스

	// 예외(Runtime(실행)시 오류 발생)
	// 런타임오류 > 코드에는 문제가 없음 > 예외처리 필수
	// 1.try~catch
	// 2.throws
	// int num="sdfsdf";
	// 컴파일 오류> 컴파일 자체가 안됨(코드에 문제가 있음)
	// 스택이 비어있음 >pop() > 예외처리

	// Nested Class(class안에 class작성
	public class EmptyStackException extends RuntimeException {
		public EmptyStackException() {
			System.out.println("스택이 비어있습니다!");
		}

	}

	// 스택이 가득차있음 > push() > 예외처리
	public class OverflowStackException extends RuntimeException {
		public OverflowStackException() {
			System.out.println("스택이 가득 차있습니다!");
		}

	}

	// 생성자(Stack생성)
	public ArrayStack(int max) {// ArrayStack 생성시 사용자가 크기 지정할 수 있도록
		stk = new int[max]; // 사용자가 지정한 크기만큼 연속된 공간 할당
		capacity = max; // 최대허용용량 = 사용자가 지정한 크기
		ptr = 0; // 최초로 들어오는 요소는 0번 인덱스
	}

	// 요소삽입(push(int n) 삽입된 요소 반환(리턴)
	public int push(int n) {
		if (isFull()) {
//		if(ptr>=capacity) {
			throw new OverflowStackException();

		} else {
			stk[ptr++] = n; // 스택에 요소 넣기!
//			ptr++; 포인터 1증가 \\위에 처럼해도 되고 요렇게 해도되고
			return stk[ptr - 1]; // 포인터가 1증가되었기 때문에 -1 해줘야함!
//			return n;
		}
	}

	// 요소 삭제(pop()), 삭제된 요소 반환(리턴)
	public int pop() {
		if (isEmpty()) {
			// if(ptr<=0) {
			throw new EmptyStackException();
		} else {
			// 포인터 1감소(top 위치가 1감소)
			ptr--;
			return stk[ptr];
		}

	}

	// 꼭대기 요소 확인
	public int peek() {
		// 스택이 비어있으면 예외 처리
		if (isEmpty()) {
			// if(ptr<=0) {
			throw new EmptyStackException();
		} else {
			return stk[ptr - 1];
		}
		// 비어있지 않으면 top(꼭대기요소) 리턴
	}
	// 스택이 비어있는지
	// 비어있으면 true 비어있지 않으면 false

	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득차있는지
	// 가득차있으면 true 차있지 않으면 false
	public boolean isFull() {
		return ptr >= capacity;

	}
}
