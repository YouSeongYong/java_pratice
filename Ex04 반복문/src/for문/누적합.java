package for문;

public class 누적합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int down = 77; // 앞에서 곱해지는 숫자저장 변수
		int up = 1; // 뒤에서 곱해지는 숫자저장 변수

		// 누적합 저장 변수
		int sum = 0;

		for (int i = 1,j=1; i <= 77; i++) {// 1~77 i변수 활용 /77번 반복
			sum += (down);//sum=sum+(down*up)
			//down--;
			//up++;
			System.out.println(sum);
		}
	}

}
