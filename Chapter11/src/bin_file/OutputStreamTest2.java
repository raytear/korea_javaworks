package bin_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest2 {

	public static void main(String[] args) {
		//바이트 기반 파일 쓰기
		//try ~ with ~ resources(자원을 효율적으로 사용) - close() 사용 안함
		//상대경로 - 내 파일을 기준으로 위치를 정함
		try(OutputStream os = new FileOutputStream("file2.bin")) {
			//특정 데이터 보내기
			byte[] array = {48, 49, 50, 51, 52};
			
			os.write(array, 1, 3); //1 ~ 3번 인덱스까지 쓰기
			
			os.flush();
			System.out.println("쓰기 완료!");			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}
}