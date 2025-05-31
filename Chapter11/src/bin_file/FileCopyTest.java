package bin_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		// 이미지 읽어서 쓰기(복사)
		String originFile = "C:/javaworks/Chapter11/whitecat.jpg";
		String copyFile = "C:/javaworks/Chapter11/whitecat2.jpg";
		long start, end; //시작 시간, 종료 시간
		
		try(InputStream is = new FileInputStream(originFile);
				OutputStream os = new FileOutputStream(copyFile)) {
				start = System.currentTimeMillis(); //시작
				
				while(true) {
					int num = is.read(); //is로 읽어서
					if(num == -1) break;
					os.write(num); //os로 쓰기
				}
				end = System.currentTimeMillis(); //종료
				System.out.println("복사 시간: " + (end - start) + "ms");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
