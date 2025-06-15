package socket1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		// Socket 객체 생성과 연결 요청
		try {
			Socket socket = new Socket("localhost", 8000);
			System.out.println("[클라이언트] 연결 성공!");
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
