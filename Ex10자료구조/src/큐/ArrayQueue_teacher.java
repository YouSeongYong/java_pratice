package 큐;

public class ArrayQueue_teacher {
	private int[] que; // 큐용 배열
	private int capacity;// 큐의 용량 ( 최대 요소 개수 )
	private int frontPtr;// front (맨 앞 요소 가리키는 포인터)
	private int rearPtr; // rear (맨 뒤 요소 가리키는 포인터)
	private int num; // 큐 현재 데이터 개수

	// 큐가 비어있을 때 > 값을 삭제하지 못함! 예외처리
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
			System.out.println("큐가 비어있습니다!");
		}

	}

	// 큐가 가득차있음 > 값을 더이상 삽입 하지 못함!
	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
			System.out.println("큐가 가득 차있습니다!");
		}

	}
	// 생성자

	public ArrayQueue_teacher(int max) { // max-배열의 크기
		que = new int[max];
		capacity = max;
		frontPtr = 0;
		rearPtr = 0;
		num = 0;

	}

	// 요소 삽입
	public int enque(int n) {// 큐에 넣을 요소 (정수)
		if (isFull()) {
			throw new OverflowQueueException();
		} else {
			que[rearPtr] = n; // 배열에 요소 삽입
			rearPtr++; // 다음 요소가 들어올 인덱스 번호 지정
			num++; // 현재 요소개수 1증가
			if (rearPtr == capacity) { // rearPtr가 배열에 인덱스범위를 벗어나게 되면
				rearPtr = 0;// 무조건 0번인덱스를 가리키게 함
			}
			return n;
		}
	}

	// 요소 삭제
	public int deque() {
		if (isEmpty()) {// 큐에 데이터가 없을 때 (비어있음)
			throw new EmptyQueueException();
		} else {
			int n = que[frontPtr]; // 삭제될 데이터의 값을 저장
			frontPtr++; // front 포인터를 1증가(1인덱스 삭제-> 2번 인덱스를 가르킬수있게
			num--;// 현재 요소개수 1감소
			if (frontPtr == capacity) {// frontPtr가 배열의 인덱스 범위를 벗어나면
				frontPtr = 0;// 무조건 0번인덱스를 가리키게함
			}
			return n;
		}
	}

	// 맨 앞 데이터 리턴
	public int peek() {
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else {
			return que[frontPtr];
		}
	}

	// 큐가 비어있는지
	public boolean isEmpty() {
		return num <= 0;

	}

	public boolean isFull() {
		return num >= capacity;
	}
}
