package 큐;

public class Node {
	private int data; // 실제 데이터 저장
	private Node nextNode; // 연결된 노드의 주소 저장 (다음에 추가될 노드의 주소) 다음노드가 연결될때 추가
	
	//생성자
	public Node(int data) {
		this.data=data;
		this.nextNode=null;//노드만 생성했을 경우에는 큐에
							// 연결된 상태가 아님!
		
	}
	//this새로운 rear 일때 새로운노드가 연결이 될때 그 노드의 주소값을 저장
	public void linkNode(Node next) {
		this.nextNode=next;
		
	}
	//this 노드의 데이터 가져오기
	
	public int getData() {
		return data;
	}
	//this 노드에 저장된 next노드의 주소값 가지고 오기
	public Node getNextNode() {
		return nextNode;
	}
}
