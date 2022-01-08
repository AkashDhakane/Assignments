package tester;



import java.util.HashMap;
import java.util.Scanner;

import com.app.library.Book;

import static utils.CollectionUtils.populateList;

public class testerForFunctionalExperessionForEachForMap {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
		HashMap<String, Book> hm = populateList();
		hm.forEach((t, b)->System.out.println(b));
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
