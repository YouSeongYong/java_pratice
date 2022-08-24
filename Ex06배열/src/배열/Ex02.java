package 배열;

public class Ex02 {

	public static void main(String[] args) {
		int[]arr;
		arr=new int[10];
		
		
		int[] arr2= {5,6,13,27,34,35,78,2,3,1};
		
		for(int i=0;i<=arr2.length-1;i++) {
//			System.out.println(arr2[i]);
			if(i/2!=1) {
				System.out.print(" "+ arr2[i]);
			}
		
		}

	}

}
