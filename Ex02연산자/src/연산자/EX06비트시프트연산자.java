package 연산자;

public class EX06비트시프트연산자 {

	public static void main(String[] args) {
		// 비트연산 : AND(&), OR(|), XOR(^), NOT(~)
		System.out.println(3&5);//둘다 1일 때만 1
		System.out.println(3|5);//둘다 0일 때만 0
		System.out.println(3^5);//다르면 1 같으면 0
		System.out.println(~3);//0>1 1>0 맨앞이 1일경우 음수로 바뀜
		
		
		//시프트연산 ( <<, >>)
		int a = 3;
		int b = a<<2; //00000011 이 00001100 으로  왼쪽으로 이동 >> : 오른쪽으로 이동
		System.out.println(b);
		

	}

}
