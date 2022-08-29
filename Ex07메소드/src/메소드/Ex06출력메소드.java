package 메소드;

public class Ex06출력메소드 {

	public static void main(String[] args) {
		int[] array= {1,3,4,8,7,9,10};
		arrayToString(array);

	}
	public static void arrayToString(int[] array) {
		
//		for(int i=0;i<array.length;i++) {
//		System.out.print(array[i]+" ");
//		}
		for(int i:array) {
			System.out.print(i+" ");
		}
	}
	
}
