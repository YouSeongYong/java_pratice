package Ex05;

import java.util.ArrayList;

public class pocketmonmain {

	public static void main(String[] args) {
		
		pocketmon mon1 = new pocketmon("피카츄", "전기", 10, 80, 120);

//	mon1.type="물"; < 불가능

		pocketmon mon2 = new pocketmon("치코리타", "풀", 10, 100, 90);
		pocketmon mon3 = new pocketmon("파이리", "불", 10, 100, 90);

		// 배열 (Array): 같은 데이터 타입을 관리하기 위하여 사용하는 기능
		pocketmon[] mons = new pocketmon[3];

		mons[0] = mon1;
		mons[1] = mon2;
		mons[2] = mon3;

//		System.out.println(mons);
//		System.out.println(mons[1]);
//		System.out.println(mons[0].getName());
//		System.out.println(mons[1].getName());
//		System.out.println(mons[2].getName());

//		for (int i = 0; i < mons.length; i++) {
//			System.out.println(mons[i].getName());
//			System.out.println(mons[i].getType());
//
//		}

		// 가변 배열 (ArrayList) : 크기가 상관없이 계속해서 늘어날수 있는 배열
		ArrayList<pocketmon> pocketlist=new ArrayList<>();
		//		<클래스로 구성되어있는친구들>
		// 1.pocketmon 타입의 배열의 이름이 pocketlist인 가변배열 생성하기

		// 2. 생성된 가방에 mons1, mons2, mons3 순서대로 담아주기
		pocketlist.add(mon1);
		pocketlist.add(mon2);
		pocketlist.add(mon3);
		
		pocketlist.add(new pocketmon("꼬부기", "물", 20, 90, 130));
		//3. 가변배열에 들어있는 포켓몬들의 이름과 타입, lv 출력하기!!
		for(int i= 0; i<pocketlist.size();i++) {
		System.out.println((i+1)+". "+pocketlist.get(i).getName() + ", "
						  +pocketlist.get(i).getType()+ ", "
						  +pocketlist.get(i).getLv());
		}
	
	}

}
