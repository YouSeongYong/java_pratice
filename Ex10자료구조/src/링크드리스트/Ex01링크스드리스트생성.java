package 링크드리스트;

import java.util.LinkedList;

public class Ex01링크스드리스트생성 {

	public static void main(String[] args) {
		
		//1. 링크드리스트 생성
		LinkedList<String> list=new LinkedList<>();
		
		//2.요소 삽입
		list.add("apple");
		list.add("banana");
		
		//3.요소 삭제
		System.out.println(list.remove());
		
		//3.요소 전체 삭제
		list.clear();
		

	}

}
