package 큐;

import 스택.Node;

public class LinkedListQueue {
	private Node first;//가장 먼저 들어온 노드 주소값
	private Node end;//가장 나중에 들어온 노드 주소값
	
	public LinkedListQueue(){
		first=null;
	}
	public class EmptyQueueException extends RuntimeException{
		public EmptyQueueException() {
			System.out.println("스택이 비어있습니다!!");
		}
		
	}
	public int add(int n) {
		if(first==null) { //아무값도 없을때 실행
			Node newnode=new Node(n);
			first=new Node(n);//first에 새로만든 노드값 저장
			
		}else if(end==null) {//first값은 존재하지만 end값이 없을때 
			Node newnode=new Node(n);//새로운 노드 주소값 생성
			first.linknode(newnode);//
			end=newnode;
		}else {//first와 end 모두 주소값을 가지고 있을때
			Node newnode=new Node(n);
			end.linknode(newnode);
			end=newnode;
		}
		return n;
		}
	public int remove() {
		return 0;
	}
}
