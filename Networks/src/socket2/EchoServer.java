package socket2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

	// 서버 소켓 객체 선언
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		System.out.println("=======================================");
		System.out.println("서버 종료하려면 q 또는 Q를 입력하고 Enter를 치세요");
		System.out.println("=======================================");
				
		startServer(); //서버 시작 함수 호출
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			//'q'키를 누르면 종료
			String key = scan.nextLine();
			//소문자로 변경 후 일치하는지 비교
			if(key.toLowerCase().equals("q")) break;
		}				
		scan.close();
		
		stopServer();  //서버 종료 함수 호출
	}

	private static void stopServer() {
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void startServer() {
		//작업 스레드 생성
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//포트 번호 - 8000번 사용
					serverSocket = new ServerSocket(8000);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("[서버] 클라이언트의 연결 요청 기다림");
						//연결 수락함수 호출
						Socket socket = serverSocket.accept();
						
						//요청한 클라이언트의 소켓 주소(포트 번호) 가져옴
						InetSocketAddress isa =
								(InetSocketAddress) socket.getRemoteSocketAddress();
						//클라이언트의 IP
						String clientIp = isa.getHostString();
						System.out.println("[서버] " + clientIp + "의 연결 요청을 수락함");
						//-----------------------------------------------------------//
						
						//클라이언트의 데이터 받기
						
//						InputStream is = socket.getInputStream();
//						byte[] bytes = new byte[1024]; //1KB 생성
//						int readByteCount = is.read(bytes); //읽은 바이트의 수
//						//바이트를 문자열로 저장
//						String message = new String(bytes, 0, readByteCount, "utf-8");
						
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						String message = dis.readUTF();
						System.out.println("[서버] 받은 데이터: " + message);
						
						//받은 데이터 다시 보내기
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message);
						dos.flush();
						System.out.println("[서버] 받은 데이터 다시 보냄: " + message);
						
						//-----------------------------------------------------------//
						//연결 끊기
						socket.close();
						System.out.println("[서버] " + clientIp + "의 연결 종료");
					}
					
				} catch (IOException e) {					
					//e.printStackTrace();
					System.out.println("[서버] " + e.toString());
				}
				
			}
		};
		thread.start();	//스레드 시작(세미콜론 밑에서 시작하면 됨)
	}

}
