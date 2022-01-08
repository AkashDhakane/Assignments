package tester;

import java.util.Comparator;
import java.util.List;

import com.app.student.Student;

import static utils.StudentCollectionUtils.*;
public class Test1 {

	public static void main(String[] args) {
		List<Student> list = populateList();
	//	list.forEach(System.out::println);
		System.out.println("unsorted list");
		list.forEach(p->System.out.println(p));
		System.out.println("sorted list as per gpa");
		Comparator<Student> studComp = (s1, s2)-> ((Double)s1.getGpa()).compareTo(s2.getGpa());
	//	Comparator<Student> studComp = (s1, s2)-> ((Double)s1.getGpa().compareTo(s2.getGpa()));
	list.stream().sorted(studComp)
			.forEach(System.out::println);
	
//		Comparator<Student> studComp = (s1, s2)->((Double)s1.getGpa()).compareTo(s2.getGpa());
		
		
}
}