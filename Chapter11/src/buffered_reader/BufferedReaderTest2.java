package buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BufferedReaderTest2 {

	public static void main(String[] args) {
		// 파일 읽기
		try(BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))) {
			String str;
			String[] list = null;	//분리된 단어를 저장할 배열

			while((str = br.readLine()) != null) {
				list = str.split(" ");
			}
			System.out.println(list[0]);
			//배열 객체 출력
			//[ant, bear, cow, chicken, eagle, elephant, fox, horse, monkey, penguin, tiger]
			System.out.println(Arrays.toString(list));
			
			//랜덤 추출
			int rndIdx = (int)(Math.random() * list.length);
			System.out.println(list[rndIdx]);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
