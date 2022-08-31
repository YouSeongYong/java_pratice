package 스택;

public class ArrayStackMain {

	public static void main(String[] args) {
	
		//스택생성
		ArrayStack as=new ArrayStack(5);
		
		as.push(3);
		as.push(2);
		as.push(4);
		as.push(5);
		as.push(6);
		
		System.out.println(as.pop());
		System.out.println(as.peek());
		System.out.println(as.isEmpty());
		System.out.println(as.isFull());
	}
	
}
