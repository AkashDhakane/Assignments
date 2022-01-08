package tester;



import java.util.Map;
import java.util.Scanner;

import com.app.student.Student;



import static utils.StudentCollectionUtils.*;
public class Test9 {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
		Map<String, Student> map = populateMap(populateList());
		map.forEach((s,v)->System.out.println(v));


		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
}
}