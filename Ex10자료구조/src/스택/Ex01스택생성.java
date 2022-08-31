package 스택;

import java.util.Stack;

public class Ex01스택생성 {

	public static void main(String[] args) {
		
		//1.스택생성				(크기값 지정 안함)
		Stack<String> st=new Stack<>();
		
		//2.요소 삽입(push)
		st.push("apple");
		st.push("banana");
		st.push("kiwi");
		st.push("peach");
		
		//3. 가장 위(top)에 있는 데이터 확인
		String s=st.peek();
		System.out.println(s);
		
		//4.가장 위(top)에 있는 데이터 삭제(꺼내기)
		String s1= st.pop();
		System.out.println(s1);
		
		System.out.println(st.peek());
		
		//5.요소 조회 (search)
		//특정 데이터가 몇번째에 존재하는지 > 정수형
		int n=st.search("banana");
		System.out.println(n);
	
		//6. 스택이 비어있는지 확인(empty)
		//비어 있으면 true 비어있지 않으면false
		System.out.println(st.empty());
		
		//스택이 빌때까지 요소를 꺼내기
		while(!st.empty()) {//스택이 비어있지 않으면
			//요소를 꺼내기
			System.out.println(st.pop());
		}
	}

}
