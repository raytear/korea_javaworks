package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest2 {

	public static void main(String[] args) {
		// 보조 스트림 - Buffered 스트림
		// 버퍼(buffer)는 임시 기억 장소를 의미
		// 보조스트림은 기반 스트림을 생성자의 매개 변수로 사용해야 함
		// 이유는 보조 스트림이 독립적으로 입출력을 수행할 수 없음
		String originFile = "C:/javaworks/Chapter11/whitecat.jpg";
		String copyFile = "C:/javaworks/Chapter11/whitecat3.jpg";
		long start, end;
		
		try(FileInputStream fis = new FileInputStream(originFile); 	//기반 스트림
			FileOutputStream fos = new FileOutputStream(copyFile); 	//기반 스트림
			BufferedInputStream bis = new BufferedInputStream(fis); //보조 스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			start = System.currentTimeMillis();
			//읽고 쓰기
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			end = System.currentTimeMillis();
			System.out.printf("복사 시간: %dms", (end - start));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
