package 트리;

public class Tree {
	private Node rootNode; // 근노드(root)주소값 저장

	// 생성자
	public Tree() {
		rootNode = null;
	}
	//루트노드 구하는 메서드
	public Node getRootNode() {
		return rootNode;
	}
	
	// 이진탐색트리구성 메서드
	// 근노드값을 기준으로 새로운 값이 작으면 왼쪽 크면 오른쪽
	public void addNode(int n) {
		if (rootNode == null) {// 루트가 비어있는경우, 아무노드도 없는경우
			rootNode = new Node(n);
		} else {
			Node root = rootNode; // 최상위 루트부터 시작해서 그다음 비교해줘야하는 노드 참조값 저장
			Node currentNode;// 포인터

			while (true) {
				currentNode = root;

				// 새로운 노드의 값이 비교하는 (current)노드 값보다 작으면 > 왼쪽
				if (n < root.getData()) {
					root = root.getLeftNode();
					// 왼쪽 자식노드가 비어있는경우 > 새로운노드 삽입가능
					if (root == null) {
						currentNode.setleftnode(new Node(n));// 새로운 노드 삽입끝
						break; // 삽입끝 > 반복문 종료
					}
				}else {//새로운 노드 값이 비교하는(current)노드 값보다 크면 >오른쪽 
					root=root.getRightNode();
					//오른쪽 자식노드가 비어있는 경우> 바로 새로운 노드 삽입
					if(root==null) {
						currentNode.setRightnode(new Node(n));
						break; //삽입끝 > 반복문
					}
				}

			}
		}
	}
	public void print() {//재귀함수 : 매서드내에서 자기자신을 다시 호출
		System.out.println("출력!");
		print();
	}
	
	public void preorderTree(Node root) {
		if(root!=null) {
		System.out.print(root.getData()+" ");
		preorderTree(root.getLeftNode());
		preorderTree(root.getRightNode());
	}}
	public void inorder(Node root) {
		if(root!=null) {
			inorder(root.getLeftNode());
			System.out.print(root.getData()+" ");
			inorder(root.getRightNode());
		}}
	public void postorder(Node root) {
		if(root!=null) {
			postorder(root.getLeftNode());
			postorder(root.getRightNode());
			System.out.print(root.getData()+" ");
		}}
	
	
	//전위 순회 (root-left-right)
	//public void preorderTree(Node root) {
		//1.근노드 확인
		//2.왼쪽노드 주소확인(채워져있는지 /null)
		//3-1 if 왼쪽 노드 주소가 null> 더이상왼쪽 안봐도됨
		//3-2 if 왼쪽 노드 주소가 null이 아님
		//	  왼쪽 노드 data 출력
		//	  왼쪽노드 주소확인(채워져있는지 /null)
		
//		System.out.println(root.getData());//1
//		if(root.getLeftNode()==null) {
//			//
//		}else {
//			root.getLeftNode().getData();
//			if(root.getLeftNode()==null) {
//				
//			}else {
//				
//			}
//		}
		
		//System.out.println(root.getLeftNode().getData());//2
		//System.out.println(root.getRightNode().getData());
	//}
	//중위 순회 (left-root-right)
	//후위 순회 (left right root)
}
