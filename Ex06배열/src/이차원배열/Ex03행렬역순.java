package 이차원배열;

public class Ex03행렬역순 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+1)*5-j;

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
