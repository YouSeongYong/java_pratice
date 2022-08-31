package Ex05;

import java.util.ArrayList;

public class Ex_ArrayList2 {

	public static void main(String[] args) {
		
		//String형의 ArrayList생성
		ArrayList<String>names= new ArrayList<>();
		
		names.add("강예진");
		names.add("김동원");
		names.add(1,"채수민");
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names);
	}

}
