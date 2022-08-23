package for문;

public class ex03삼육구 {

	public static void main(String[] args) {
		
		
		
		for(int i=1;i<=50;i++) {
			int a= i%10;
			if(a==5) {
				System.out.println("으악");
			}else if(a==3||a==6||a==9) {
				System.out.println("박수");
			}else
			
			System.out.println(i);
			
		}

	}

}
