package buffered_reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		// 파일에 쓰기
		try(Writer writer = new FileWriter("message.txt")){
			String message = "오늘도 좋은 하루 되세요\n행운을 빌어요\n고맙습니다";
			writer.write(message);
			
			writer.flush();
			System.out.println("파일 쓰기 완료!");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}