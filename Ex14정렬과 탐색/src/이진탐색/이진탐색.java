package 이진탐색;

public class 이진탐색 {

	public static void main(String[] args) {
		
		//이진탐색 : 정렬이 되어있는 배열에서만 사용 (전진)
		int[] arr= {1,7,16,25,30,33,41,66,78,90};
		int num=25;
		
		int lowIndex = 0; // 찾아야하는 배열의 구역중 가장 낮은 인덱스 번호 포인터
		int highIndex=arr.length-1;// 가장 높은 인덱스 번호포인터
		
		while(true) {
			//현재 봐야하는 배열 구역중에서 센터 찾아야함
			int centerIndex=(lowIndex+highIndex)/2;
			
			if(arr[centerIndex]==num) {
				System.out.println(centerIndex);
				break;
			}else {
				if(arr[centerIndex]>num) {
					highIndex=centerIndex-1;
					
				}else {//arr[centerIndex] <num
					lowIndex=centerIndex+1;
				}
			}
		}
	}

}
