package tester;



import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

import com.app.student.Student;



import static utils.StudentCollectionUtils.*;
public class Test10 {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
		Map<String, Student> map = populateMap(populateList());
		map.forEach((s,v)->System.out.println(v));
		Comparator<Student> studComp = (s1, s2)-> (s1.getRollNo()).compareTo(s2.getRollNo());
		System.out.println("students details sorted as per roll no.");
		map.values().stream().sorted(studComp).forEach(System.out :: println);


		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
}
}