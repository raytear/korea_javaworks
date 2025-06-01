package buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// 파일 읽기 - 보조 스트림 사용 - BufferedReader
		try(Reader reader = new FileReader("message.txt");
				BufferedReader br = new BufferedReader(reader)) {
				String str; //읽은 문자를 저장할 변수
				int lineNo = 1; //행 번호 생성
				while((str = br.readLine()) != null) {
					System.out.println(lineNo + " " + str);
					lineNo++;
				}
				reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
