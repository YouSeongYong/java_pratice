package 큐;

public class LinkedListMain_teacher {

	public static void main(String[] args) {
		LinkedListQueue_teacher llq=new LinkedListQueue_teacher();
		
		llq.enque(1);
		llq.enque(2);
		llq.enque(3);
		llq.enque(4);
		llq.enque(5);
		llq.enque(6);
		
		System.out.println(llq.dequq());
		System.out.println(llq.dequq());
		System.out.println(llq.dequq());

		System.out.println(llq.peek());
	}

}
