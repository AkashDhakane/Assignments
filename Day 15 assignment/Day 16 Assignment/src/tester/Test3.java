package tester;


import java.util.Map;
import java.util.Scanner;

import com.app.student.Student;
import com.app.student.Subject;

import custom_exception.StudentHandlingException;

import static utils.StudentCollectionUtils.*;
public class Test3 {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
		Map<String, Student> map = populateMap(populateList());
		map.forEach((s,v)->System.out.println(v));
		System.out.println("Enter Subject");
		Subject subject = Subject.valueOf(sc.next().toUpperCase());
		System.out.println("avg "+map.values().stream().filter(s->s.getSubject()==subject)
		.mapToDouble(Student :: getGpa)
		.average().orElseThrow(()->new StudentHandlingException("Empty stream!!!")));
//		if(optional.isPresent()) {
//			System.out.println("avg"+optional.getAsDouble());	
//		}else {
//			System.out.println("empty optional");
		}catch(Exception e) {
			System.out.println(e.getMessage());

}
		
		
}
}