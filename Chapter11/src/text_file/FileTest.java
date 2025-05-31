package text_file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// File 클래스
		// 디렉터리 생성, 파일 생성, 파일 정보 등의 파일 시스템 작업을 수행하는 클래스
		
		//파일 쓰기 전 디렉터리 존재 유무 확인
		File dir = new File("c:/file2");
		if(!dir.exists())
			dir.mkdirs();
		
		//신규 파일 생성
		File file = new File("c:/file2/new_file.txt");
		file.createNewFile();
		
		//파일 정보 출력
		System.out.println(file.isFile());	//true
		System.out.println(file.isDirectory()); //false
		System.out.println(file.getName()); //new_file.txt
		System.out.println(file.getPath()); //c:/file2/new_file.txt
	}

}
