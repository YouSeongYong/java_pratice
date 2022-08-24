package 이차원배열;

public class Ex024행6열 {

	public static void main(String[] args) {
		int[][]arr=new int[4][6];
		
	int num=21;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=num+=2;
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
	}
	}

}
