package jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJson {

	public static void main(String[] args) {
		// member.json 파일 읽기
		try(BufferedReader br = new BufferedReader(new FileReader("member.json"))){
			String json = br.readLine();
			
			//파싱 - 구문 해석(읽어서 출력)
			JSONObject root = new JSONObject(json);
			
			//속성 정보
			System.out.println(root.getString("id")); 		//sky123
			System.out.println(root.getString("name"));		//이하늘
			System.out.println(root.getInt("age"));			//28
			System.out.println(root.getBoolean("student"));	//true
		
			//속성 tel의 정보
			JSONObject tel = root.getJSONObject("tel");
			System.out.println("home: " + tel.getString("home"));		//home: 02-111-2222
			System.out.println("mobile: " + tel.getString("mobile"));	//mobile: 010-3333-5555
			
			//배열의 속성 정보
			JSONArray skill = root.getJSONArray("skill");
			System.out.println("skill: ");
			/*
			for(int i=0; i<skill.length(); i++) {
				System.out.print(skill.get(i) + ", ");	//skill: Java, C, C++,
			}
			*/
			
			//범위 기반 for문
			for(Object sk : skill)
				System.out.print(sk + ", ");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
