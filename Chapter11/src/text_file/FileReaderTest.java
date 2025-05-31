package text_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		/*
		  파일 입출력 프로세스 
		  1. 파일을 연다(파일 경로 - 절대경로, 상대경로)
		  2. 파일을 쓴다
		  3. 파일을 닫는다		 
		 */
		try {
			//파일을 연다
			Reader reader = new FileReader("c:/file/text.txt");
			
			//파일 읽기
			while(true) {
				int data = reader.read();
				//-1은 문자가 없음을 의미함
				if(data == -1) break;
				System.out.print((char)data); //문자형 형 변환 후 출력
			}
			//파일 종료
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
