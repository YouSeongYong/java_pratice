package 큐;

public class ArrayQueueMain {

	public static void main(String[] args) {
		ArrayQueue que=new ArrayQueue(5);
		
		que.add(2);
		que.add(3);
		que.add(5);
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("지워진 요소 "+que.remove());
//		System.out.println(que.remove());
		System.out.println("지워지고 난후 요소"+que.peek());
		System.out.println();
		System.out.println("지워진 요소 "+que.remove());
		System.out.println("지워지고 난후 요소"+que.peek());
		
		
	}

}
