package 메소드;

public class Ex04곱하기 {

	public static void main(String[] args) {
		int base=2;
		int n=3;
		int result = powerN(base,n);
		System.out.println("결과 확인 : " +result);

	}
	public static int powerN(int base,int n) {
		
//		int result=base;
//		for(int i=1;i<=n-1;i++) {
//			
//			result*=base;
//		}
//		int result=1;
//		for(int i=0;i<n;i++) {
//			
//			result*=base;
//		}
//		return result;
//		
		return (int)Math.pow(base,n);
	}
}
