package 배열;

public class Ex01배열생성 {

	public static void main(String[] args) {
		
		//1. 정수형 데이터를 저장할 수 있는 배열의 참조값을 저장하는 변수 선언
		int[]arr;
		int arr2[];
		
		//2. arr 변수에 크기가 10인 배열의 참조값 할당하기
		arr=new int[10];//<< 0부터 9까지의 길이 생성됨 < 요 생성된걸 arr저장함
		
		
		//3. 각각 인덱스에 값을 저장
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		//정수형 배열 생성되었을 때 값을 넣어주지않았을때 기본값? =0
		
		//3-1 배열 생성할때 저장되야하는 값을 알고있을때
		int[]arr3= {5,3,2,1,8,9,10};
		
		//4. arr3 배열에 저장된 모든 데이터를출력
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		//for(int i=0;i<=arr3.length-1;i++) { 가능
		//for(int i=0;i<arr3.length;i++) {  가능
		for(int i=0;i<=arr3.length-1;i++) {
			System.out.println(arr3[i]);
			
		}
		//5. 배열에 저장된 모든 값의 합 << 누적합
		int sum= 0; //누적합 저장할 변수
		
		for(int i=0;i<arr3.length;i++) {
			sum+=arr3[i]; // sum= sum+arr3[i];
		}
		System.out.println("합 : "+sum);
	}

}
