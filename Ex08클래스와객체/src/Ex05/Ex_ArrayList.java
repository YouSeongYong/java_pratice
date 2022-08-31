package Ex05;

import java.util.ArrayList;

public class Ex_ArrayList {

	public static void main(String[] args) {
		
		//가변 리스트 선언하기
		//<> >> 제네릭 타입 : 클래스 구조(레퍼런스)로 되어있는 데이터 타입을 지정 해야한다!
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//데이터 저장 > add()
		//배열명[위치] = 데이터 값;
		System.out.println(list.size());
		
		list.add(1);
		System.out.println(list.size());
		list.add(3);
		System.out.println(list.size());
		
		//추가시 가장 마지막 위치에 데이터 추가!
		
		//데이터 확인하기(가져오기)>get();
		list.add(7);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println(list);
		//데이터 삭제 > remove(위치)
		list.remove(1);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		//데이터 수정 > set(수정할 위치, 수정할 데이터 값)  
		list.set(0,9);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		
	}

}
