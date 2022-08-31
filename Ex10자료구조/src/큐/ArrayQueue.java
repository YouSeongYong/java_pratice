package 큐;

public class ArrayQueue {

	private int[] que;// 큐 배열
	private int capacity;// 용량
	private int ptr; //인덱스

	// 큐가 가득비어있으면 예외처리
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
			System.out.println("큐가 비어있습니다!");
		}

	}

	// 큐가 가득차있으면 예외처리
	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
			System.out.println("큐가 꽉찼습니다");
		}
	}

	// 생성자 (Queue 생성)
	public ArrayQueue(int max) {
		que = new int[max]; //사용자가 지정한만큼 공간 할당
		capacity = max; //사용자가 입력한 값 저장
		ptr=0;
		
		
	}
	//요소 삽입 
	public int add(int n) {//추가된 요소 앞자리
		if(ptr>=capacity) {
			throw new OverflowQueueException();
		}else {
			que[ptr++]=n;
			return que[ptr-1];
		}
	}
	public int remove() {//삭제된 요소
		if(ptr<=0) {
			throw new EmptyQueueException();
			
		}else {
			int temp = que[0];
			//배열que의 인덱스0값을 없애기.
			ptr--;
			for(int i=0;i<ptr;i++) {
				que[i]=que[i+1];
			}
			return temp;
		}
	}
	public int peek() {// 맨 마지막 요소
		if(ptr<=0) {
			throw new EmptyQueueException();
		}else {
			return que[0];
		}
	}
	public boolean isempty() {
		return ptr<=0;
	}
	public boolean isFull() {
		return ptr>=0;
	}
}
