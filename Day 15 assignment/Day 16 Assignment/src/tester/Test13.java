package tester;



import java.util.Map;
import java.util.Scanner;

import com.app.student.Student;
import com.app.student.Subject;


import static utils.StudentCollectionUtils.*;
public class Test13 {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
		Map<String, Student> map = populateMap(populateList());
		map.forEach((s,v)->System.out.println(v));
//		Comparator<Student> studComp= s->s.getGpa();
		System.out.println("Enter Subject");
		Subject subject = Subject.valueOf(sc.next().toUpperCase());
		System.out.println("Names of top three toppers of subject "+subject+": ");
		map.values().stream().filter(s->s.getSubject()==subject)
		.sorted((s1, s2)->((Double)s2.getGpa()).compareTo(s1.getGpa())).limit(3).forEach(s->System.out.print(s.getName()+" "));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
}
}