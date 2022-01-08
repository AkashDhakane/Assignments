package tester;



import java.util.Map;
import java.util.Scanner;

import com.app.student.Student;
import com.app.student.Subject;


import static utils.StudentCollectionUtils.*;
public class Test8 {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
		Map<String, Student> map = populateMap(populateList());
		map.forEach((s,v)->System.out.println(v));
//		Comparator<Student> studComp= s->s.getGpa();
		System.out.println("Enter Subject");
		Subject subject = Subject.valueOf(sc.next().toUpperCase());
		System.out.println("Number of student get distinction in  "+subject);
		System.out.println(map.values().stream().filter(s->s.getSubject()==subject)
		.filter(s->s.getGpa()>7.5).count());


		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
}
}