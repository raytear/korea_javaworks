package inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		// 내 컴퓨터의 IP 주소 확인
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터의 IP 주소: " + local.getHostAddress());

			//서버 컴퓨터
			//InetAddress server = InetAddress.getByName("www.naver.com");
			//System.out.println(server);
			InetAddress[] servers = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : servers)
				System.out.println(remote);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
