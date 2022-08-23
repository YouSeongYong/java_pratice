package for문;

public class 계산결과출력 {

	public static void main(String[] args) {

//		int p=0;
//		int m=0;
//		
//		for( p=1;p<=77;p++) {
//			System.out.println(p);}

//		for(m=77;m>1;m--) {
//			System.out.println(m);
//			
//		}
//		System.out.println(p*m);
		int down = 77; // 앞에서 곱해지는 숫자저장 변수
		int up = 1; // 뒤에서 곱해지는 숫자저장 변수

		// 누적합 저장 변수
		int sum = 0;

		for (int i = 1,j=1; i <= 77; i++,down--,up++) {// 1~77 i변수 활용 /77번 반복
			sum += (down * up);//sum=sum+(down*up)
			//down--;
			//up++;
			System.out.println(sum);
		}
	}

}
