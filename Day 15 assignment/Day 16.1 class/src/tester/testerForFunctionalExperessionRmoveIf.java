package tester;



import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.app.library.Book;

import static utils.CollectionUtils.populateList;
import static utils.CollectionUtilsIf.poupulateListFromMap;
public class testerForFunctionalExperessionRmoveIf {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
		HashMap<String, Book> hm = populateList();
		List<Book> bookList = poupulateListFromMap(hm);
		System.out.println("original books");
		bookList.forEach(b->System.out.println(b));
		
		
		System.out.println("Enter date (yyyy-mm-dd)");
		LocalDate date = LocalDate.parse(sc.next());
		bookList.removeIf(value->value.getPublishDate().isBefore(date));
		System.out.println("books after sorting ");
		bookList.forEach(b->System.out.println(b));
		
		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
