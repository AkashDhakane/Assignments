package tester;


import java.util.Map;
import java.util.Scanner;

import com.app.student.Student;
import com.app.student.Subject;

import custom_exception.StudentHandlingException;

import static utils.StudentCollectionUtils.*;
public class Test5 {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
		Map<String, Student> map = populateMap(populateList());
		map.forEach((s,v)->System.out.println(v));
		System.out.println("Enter Subject");
		Subject subject = Subject.valueOf(sc.next().toUpperCase());
		System.out.println("Avg "+subject +" "+
		map.values().stream().filter(s->s.getSubject()==subject)
		.mapToDouble(g->g.getGpa())
		.average().orElseThrow(()-> new StudentHandlingException("Empty stream!!")));


		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
}
}