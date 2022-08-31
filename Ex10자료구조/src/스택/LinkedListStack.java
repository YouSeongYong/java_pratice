package 스택;

public class LinkedListStack {
	private Node top; //현재 top 노드의 주소값 \
	
	public LinkedListStack() {
		top=null;
	}
	//스택이 비어있을 경우 예외처리
	public class EmptyStackException extends RuntimeException {
		public EmptyStackException() {
			System.out.println("스택이 비어있습니다!");
		}

	}
	//요소 삽입, 삽입된 요소의 데이터 반환
	public int push(int n) {
		Node newNode=new Node(n); //노드 생성 데이터부분 초기화
		newNode.linknode(top); //현재 top인 노드의 주소값을 새로 생성된
							   //노드의 주소부에 저장(연결)
		top= newNode;//새로 생성된 노드가 top이 되도록 수정
		
		return newNode.getData();
	}
	
	//요소 삭제, 삭제된 요소의 데이터 반환
	//스택이 비어있으면 예외처리
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
			
		}else {
			int data = top.getData();
			//top 위치를 바꾸기
			//top 필드가 현재top의 이전에 있는 노드의 주소값을 가져야함
			top=top.getnextNode();
			//top이 가지고 있는 주소데이터(top가 연결된 노드의 주소 ) > top할당
			//> top 위치 바뀜
					return data; //top 바뀌기 전에 top 노드의 데이터
			
		}
	}
	
	//꼭대기 노드 데이터 가지고오기 
	public int peek() {
		return top.getData();
		
	}
	//스택이 비어있는지
	//비어있으면 true 비어있지 않으면false
	public boolean isEmpty() {
		return top==null;
	}
}
