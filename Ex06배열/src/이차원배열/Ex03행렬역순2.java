package 이차원배열;

public class Ex03행렬역순2 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i%2==0) {
					arr[i][j] = ((i*5)+1)+j;
					
					
				}else {
					arr[i][j]=(i+1)*5-j;
				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
