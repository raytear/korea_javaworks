package users.run;

import java.util.List;

import users.domain.Users;
import users.domain.UsersDAO;

public class UsersTest {

	public static void main(String[] args) {
		Users user = new Users();	   //Users 객체 생성
		UsersDAO dao = new UsersDAO(); //관리 객체 생성
		
		/*
		user.setUserId("korea");
		user.setUserPassword("2468!!");
		user.setUserName("이대한");
		user.setUserAge(31);
		dao.insertUser(user);
		*/
		
		user.setUserId("cloud");
		user.setUserPassword("c1357!@#");
		user.setUserName("흰구름");
		user.setUserAge(100);
		dao.insertUser(user);
		
		List<Users> userList = dao.getUserList();
		for(int i = 0; i < userList.size(); i++) {
			Users findUser = userList.get(i);
			System.out.println(findUser);
		}
		//System.out.println(user.getUserId());
		
//		System.out.println(user); //객체의 정보 출력
	}

}
