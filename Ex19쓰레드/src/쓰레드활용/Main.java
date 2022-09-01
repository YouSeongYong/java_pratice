package 쓰레드활용;

public class Main {

	public static void main(String[] args) {

		String[] key = { "Q", "W", "E" };

		for (int i = 0; i < key.length; i++) {
			blitzcrank b = new blitzcrank(key[i]);
			b.run();
		}

		
		System.out.println("=======================");
		for(int i=0; i<key.length;i++) {
			Ari a= new Ari(key[i]);
			//run() : 하나의 쓰레드가 동작할 코드(한가지 작업)
			//start()-Thread : 쓰레드가 여러개 동작할 수 있도록 하는 메서드 
			//start() 절대로 오버라이딩 하면 안됨!
			//쓰레드가 생명력을 가지고 실행을 시작하도록 만들어 줌 
			a.start();
		}
	System.out.println("=============================");
	for(int i=0; i<key.length;i++) {
		Thread thread= new Thread(new Ari2(key[i]));
		
		//run() : 하나의 쓰레드가 동작할 코드(한가지 작업)
		//start()-Thread : 쓰레드가 여러개 동작할 수 있도록 하는 메서드 
		//start() 절대로 오버라이딩 하면 안됨!
		//쓰레드가 생명력을 가지고 실행을 시작하도록 만들어 줌 
		thread.start();
		
	}
		
	}

}
