package 이차원배열;

public class Ex01이차원배열생성 {

	public static void main(String[] args) {

		int[][] arr; // 2차원 배열의 레퍼런스 배열의 참조값을가지는 레퍼런스변수
		arr = new int[3][5];// 3행(레퍼런스 배열 길이)5열(실제값이 들어가는 배열 길이 2차원 배열 생성

		arr[0][0] = 1;
		arr[2][3] = 3;

		int[][] arr2 = { { 1, 2, 3 }, { 2, 3, 4 } };

		// 배열크기
		System.out.println(arr2.length);// 레퍼런스 배열의 길이 (행의개수)
		System.out.println(arr2[0].length);// 실제 값을 가지는 배열의 길이 (열의개수)

		int[][] arr3 = new int[5][5];

		int num = 1;
		// 값 입력
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = num++;

			}
		}
		//값 출력
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+"\t");
			}
	System.out.println();
		}
	}
}
