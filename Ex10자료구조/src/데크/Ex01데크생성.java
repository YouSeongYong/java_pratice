package 데크;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex01데크생성 {

	public static void main(String[] args) {
		//1. 데크로 스택 생성
		Deque<String> stack=new ArrayDeque<>();
		
		// 데크에 요소 삽입(앞으로만 삽입)
		stack.addFirst("apple");
		stack.addFirst("banana");
		stack.addFirst("kiwi");
		
		//데크에 요소 삭제(앞에서만 꺼내기)
		System.out.println(stack.removeFirst());
		System.out.println(stack.removeFirst());
		System.out.println(stack.removeFirst());
		
		//2. 데크로 큐 생성
		Deque<String> queue=new ArrayDeque<>();
		
		//데크에 요소 삽입(맨 앞에서만 추가)
		queue.addFirst("peach");
		queue.addFirst("grape");
		
		//데크에 요소 삭제(맨 끝에서만 삭제)
		//queue.removeLast();
		System.out.println(queue.removeLast());
		System.out.println(queue.removeLast());
		
		
	}

}
