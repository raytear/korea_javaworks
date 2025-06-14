package streams.student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> sList = Arrays.asList(
			new Student("유빈", 90),
			new Student("상혁", 80),
			new Student("정후", 85)
		);
		
		//Stream 사용
		Stream<Student> stream = sList.stream();
		stream.forEach(std -> {
			//System.out.println(std.getName() + ":" + std.getScore());
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name + ":" + score);
		});
		
		System.out.println("== 학생의 이름 출력 ==");
		stream = sList.stream(); //stream() 한 번 사용하면 소모되므로 다시 초기화함
		stream.map(std -> std.getName())
			  .forEach(s -> System.out.println(s));
		
		System.out.println("== 학생의 점수 출력 ==");
		stream = sList.stream(); //stream() 한 번 사용하면 소모되므로 다시 초기화함
		stream.map(std -> std.getScore())
			  .forEach(s -> System.out.println(s));
		
		System.out.println("== 점수가 90 이상인 학생의 이름 출력 ==");
		sList.stream().filter(std -> std.getScore() >= 90)
					  .map(std -> std.getName())
					  .forEach(s -> System.out.println(s));
	}

}
