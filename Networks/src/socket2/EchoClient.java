package socket2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) {
		// Socket 객체 생성과 연결 요청
		try {
			Socket socket = new Socket("localhost", 8000);
			System.out.println("[클라이언트] 연결 성공!");
			//-----------------------------------------------------------//
			
			//데이터 보내기
			
//			String sendMessage = "오늘도 즐거운 하루되세요!";
//			//바이트 기반 스트림
//			OutputStream os = socket.getOutputStream();
//			//문자열을 바이트로 저장함
//			byte[] bytes = sendMessage.getBytes("utf-8");
//			os.write(bytes);
//			os.flush();
			
			String sendMessage = "행운을 빌어요! Good Luck!";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);
			
			//서버로부터 데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String message = dis.readUTF();
			System.out.println("[클라이언트] 서버에서 데이터 받음: " + message);
			
			//-----------------------------------------------------------//
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
