package writer_read;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest2 {

	public static void main(String[] args) {
		// 기존 파일에 추가로 내용 쓰기
		try {
			Writer writer = new FileWriter("c:/file/text.txt", true);
			writer.write("\n오늘도 좋은 하루 되세요~");
			
			writer.flush();
			writer.close();
			
			System.out.println("추가 쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
