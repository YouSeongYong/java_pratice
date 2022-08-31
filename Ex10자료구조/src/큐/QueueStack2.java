package 스택;

import 스택.QueueStack.EmptyStackException;

public class QueueStack2 {

	private Node First; // 가장 먼저 들어온 노드의 주소값
	private Node End;	// 가장 나중에 들어온 노드의 주소값

	public QueueStack2() {
		First = null;
	}

	public class EmptyStackException extends RuntimeException {
		public EmptyStackException() {
			System.out.println("스택이 비어있습니다.");
		}
	}

	// 요소 삽입, 삽입된 요소의 데이터 반환
	public int add(int n) {
		if (isEmpty()) {	//아예 맨처음 아무 값도 입력되지 않을시 실행
			First = new Node(n);	//new Node를 이용해서 Node공간을 생성, 생성자를 통해 data값만 가지도록 한 후 First에 아까만든 Node(데이터 값만 존재)의 주소값을 저장
		} else if(End==null) {		//First 주소값은 존재하지만 End값은 없을 경우 실행
			Node newNode = new Node(n);	//new Node를 통해 Node공간을 생성
			First.linkNode(newNode);	//First를 통해 이전에 만든 Node에 접근한 다음 방금 새로 만든 Node의 주소를 저장, 이로서 First에 연결된 Node는 데이터값과 주소 둘 다 가지게 됨.
			End = newNode;	//End에 새로만든 Node(데이터값만 존재)의 주소값을 저장
		} else {	//First와 End 모두 주소값을 가지고 있을시 실행
			Node newNode = new Node(n);	//입력받은 값을 이용해 새로운 Node 생성 (메모리에 공간 확보)
			End.linkNode(newNode);	//End에 저장된 주소값을 통해 이전에 만든 Node에 접근한 뒤 새로 만든 노드의 주소값을 저장
			End = newNode;	//End에 새로만든 Node(데이터값만 존재)의 주소값을 저장
		}
		return n;	//if문안에 개별적으로 return문을 만들어주기 귀찮아서 통일함, Node newNode = new Node(n);도 if문 앞쪽으로 빼서 코드를 줄일 수 있지만 설명을 위해 놔둠.
	}

	// 요소 삭제, 삭제된 요소의 데이터 반환, 스택이 비어있으면 예외처리
	public int remove() {
		if (isEmpty())
			throw new EmptyStackException();
		else {
			int popnum = First.getData();	//First의 주소에 있는 Node의 데이트 값을 미리 저장해둔다.
			First = First.getNextNode();	//First에 First의 주소에 있는 Node(다음 input값이 저장된 node)의 주소값을 덮어쓴다.
			return popnum;
		}

	}

	public Integer peek() {
		if (First == null)
			return null;
		else
			return First.getData();
	}

	public int element() {
		if (First == null)
			throw new EmptyStackException();
		else
			return First.getData();
	}

	public boolean isEmpty() {
		return First == null;
	}
}
