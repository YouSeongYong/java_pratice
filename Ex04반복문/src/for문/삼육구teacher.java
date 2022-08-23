package for문;

public class 삼육구teacher {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			if(i%10==5) {
				System.out.println("으악");
			}else if(i%10==3||i%10==6||i%10==9) {//1의 자리수 3,6,9
				System.out.println("박수");
				
			}
			else {
				System.out.println(i);
			}
		}
			
	}

}
