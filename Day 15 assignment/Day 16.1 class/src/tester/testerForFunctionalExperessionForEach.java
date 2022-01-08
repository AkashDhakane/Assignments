package tester;



import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.app.library.Book;

import static utils.CollectionUtils.populateList;
import static utils.CollectionUtilsIf.poupulateListFromMap;
public class testerForFunctionalExperessionForEach {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
		HashMap<String, Book> hm = populateList();
		List<Book> bookList = poupulateListFromMap(hm);
		bookList.forEach(b->System.out.println(b));
		
		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
