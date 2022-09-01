package Ex03;

import java.util.Random;

public class MachineMain {

	public static void main(String[] args) {
		
		
		Machine m = new Machine();

		Pika pika = new Pika();
//		m.pick(pika);

		Pairi pairi = new Pairi();
//		m.pick(pairi);

		Kkobuk kkobuk = new Kkobuk();
//		m.pick(kkobuk);

		System.out.println();
		System.out.println("랜덤 인형 뽑기");
		
		//랜덤으로 인형을 뽑아보자
		Doll[] dolls= {pika,pairi,kkobuk};
		Random rd= new Random();
		int choice=rd.nextInt(3);
		m.pick(dolls[choice]);
	}

}
