package 채팅프로그램;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//클라이언트가 작성 채팅을 서버로 보내는 용도
public class WritingThread extends Thread {

	private Socket socket = null;
	Scanner sc=new Scanner(System.in);
	public WritingThread(Socket socket) {
		this.socket = socket;

	}

	// 클라이언트가 작성한 채팅을 서버로 보내기
	public void run() {

		try {
			// 클라이언트가 작성한 채팅을 서버로 전송할 통로(스트림)
			OutputStream out = socket.getOutputStream();

			// 통로를 통해서 데이터를 출력할 때 쓰는 객체
			// true->autoflush의미 (버퍼사용, 자동으로 버퍼에 쌓인 데이터를 전송)
			PrintWriter writer = new PrintWriter(out, true);
			
			while(true) {
				//키보드로 입력값을 outputstream 출력하는 역할 
				writer.println(sc.nextLine());
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
