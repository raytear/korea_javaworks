package datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		//보조 스트림 - DataOutputStream, DataInputStream
		//메모리에 저장된 0과 1의 상태를 그대로 읽거나 씀
		//보조 스트림은 기반 스트림을 생성자의 매개변수로 가져야 함
		
		//데이터 쓰기
		try(FileOutputStream fos = new FileOutputStream("object.dat");
			DataOutputStream dos = new DataOutputStream(fos)){
						
			dos.writeInt(1);		//학번
			dos.writeUTF("우영우"); 	//이름
			dos.writeDouble(95.1);	//점수
			
			dos.writeInt(2);		//학번
			dos.writeUTF("장그래"); 	//이름
			dos.writeDouble(88.7);	//점수
			
			dos.flush(); //버퍼 비우기 빨리 저장함			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//데이터 읽기
		try(FileInputStream fis = new FileInputStream("object.dat"); //기반 스트림
			DataInputStream dis = new DataInputStream(fis)){	//보조 스트림
			
			for(int i=0; i<2; i++) {
				int no = dis.readInt();
				String name = dis.readUTF();
				double score = dis.readDouble();
				System.out.println(no + ". " + name + " : " + score);
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}