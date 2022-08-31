package 스택;

public class LinkedListStackMain {

	public static void main(String[] args) {
	
		LinkedListStack lls=new LinkedListStack();
		
		lls.push(3);
		lls.push(4);
		lls.push(6);
		
		System.out.println(lls.pop());
		System.out.println(lls.peek());
		System.out.println(lls.isEmpty());
	}

}
