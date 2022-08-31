package 큐;

public class ArrayQueueMain_teacher {

	public static void main(String[] args) {
		
		ArrayQueue_teacher aq=new ArrayQueue_teacher(5);
		
		aq.enque(1);
		aq.enque(2);
		aq.enque(3);
		aq.enque(4);
		aq.enque(5);

		
		System.out.println(aq.deque());
		System.out.println(aq.deque());
		System.out.println(aq.deque());
		System.out.println(aq.deque());
		System.out.println(aq.peek());
	
	
	
	}

}
