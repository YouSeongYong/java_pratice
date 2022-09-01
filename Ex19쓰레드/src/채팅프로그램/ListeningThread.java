package 채팅프로그램;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

//서버는 모든 클라이언트의 채팅을 받음
//모든 클라이언트들이 작성된 채팅을 확인 할 수 있도록 하는 역할
public class ListeningThread extends Thread {

	private Socket socket = null;

	// 어떤 서버가 내용을 보내는지 확인
	// 서버 (소켓-넘버) 확인
	public ListeningThread(Socket socket) {
		this.socket = socket;
	}

	// 어떤 작업을 수행할건지!
	public void run() {
		try {
			// 소켓의 inputstream 정보 가지고 오기
			//소켓정보가 잘못됐을 수 있기 때문에 예외처리!
			InputStream input = socket.getInputStream();
		
			//inputstream 통해 들어오는 데이터 임시적으로 저장할 공간 - 버퍼(읽는 용도)
		BufferedReader reader=new BufferedReader(new InputStreamReader(input));
		
		while(true) {//데이터 가져오고 버퍼에 저장된 값 출력을 반복
			System.out.println(reader.readLine());
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
