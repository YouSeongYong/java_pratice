package 이차원배열;

public class Ex04비정방형배열 {

	public static void main(String[] args) {
		
		//비정방형 배열 생성 방법
		int[][] arr=new int[5][];
		
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[5];
		arr[3]=new int[1];
		arr[4]=new int[6];
		
		System.out.println(arr[0].length);
		System.out.println(arr[2].length);
	}

}
