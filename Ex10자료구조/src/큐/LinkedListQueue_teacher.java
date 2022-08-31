package 큐;

public class LinkedListQueue_teacher {
	private Node front;// front 노드 주소
	private Node rear; // rear 노드 주소
	private int num;// 큐 요소 개수

	// 생성자
	public LinkedListQueue_teacher() {
		front = null;
		rear = null;
		num = 0;

	}

	// 큐가 비어있을 때 >값을 삭제하지 못함!
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
			System.out.println("큐가 비어있습니다!");
		}

	}

	// 요소 삽입
	public int enque(int n) {
		// 데이터를 저장하고 있는 노드 생성
		Node newnode = new Node(n);

		// 노드가 없을 때 (큐가 비어있을때)
		// head=null, rear=null
		// 노드 1개 삽입 > 1개 삭제(head 삭제 !)
		// 첫번째 노드 삽입 - head=newNode

		// 큐가 비어있을 경우 > 노드 -front로 설정
		if (num <= 0) {
			front = newnode;
			rear = newnode;
			num++;
		} else {// 큐의 마지막 노드가 다음 노드(새노드)주소값을 가지게 함
			rear.linkNode(newnode);// 새로운 노드의 주소값이 rear노드의 주소부에 저장(연결)
			rear = newnode;
			num++;
		}
//	rear= newnode; //새로운 노드가 rear가 되도록 변경
//		num++; 요소개수 1증가  위에 코드 간결화 
		return newnode.getData();
	}

	// 요소삭제
	public int dequq() {
		if (num <= 0) {// 여기로 들어오는경우 큐가 비어있을경우
			throw new EmptyQueueException();
		} else {// 하나라도 있으면 삭제할수 있게
			int n = front.getData();// 현재 삭제될 노드의 데이터 저장
			Node nextnode = front.getNextNode();// 현재 주소를 가져와 다음에 front가 될 노드의 주소(참조값)을 저장

			front = nextnode;// ex)1주소가 2로 바뀜??front 노드가 바뀜
			num--;// 큐 요소 개수 1개감소
			return n;
		}
	}
	
	//맨 앞 요소 리턴
	public int peek() {
		return front.getData();
		
	}
	//큐가 비어있는지
	public boolean isEmpty() {
		return num<=0;
	}
}
