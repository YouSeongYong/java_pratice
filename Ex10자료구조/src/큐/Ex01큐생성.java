package 큐;

import java.util.LinkedList;
import java.util.Queue;

public class Ex01큐생성 {

	public static void main(String[] args) {
		
		//1.큐생성(LinkedList)
		Queue<Integer>que=new LinkedList<>();
		
		//2.요소 삽입(add/offer)
		que.add(1);//boolean (여유공간이 없으면 Exception(!예외상황-런타임(실행)시오류발생! 발생)
		que.offer(2);//boolean (여유공간이 없으면 false 리턴)
		
		//3.맨 앞에 값 확인 (element / peek)
		System.out.println(que.element());//큐가 비어있으면 Exception 발생
		System.out.println(que.peek());//큐가 비어있으면 null 리턴
		
		//4.요소 삭제(remove / poll)
		que.remove(); //큐가 비어있으면 Exception 발생
		que.poll(); // 큐가 비어있으면 null 리턴
		
		
	}

}
