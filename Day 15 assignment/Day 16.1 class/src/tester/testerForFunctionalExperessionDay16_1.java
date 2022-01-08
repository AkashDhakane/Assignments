package tester;



import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import com.app.library.Book;

import static utils.CollectionUtils.populateList;
import static utils.CollectionUtilsIf.poupulateListFromMap;
public class testerForFunctionalExperessionDay16_1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
		HashMap<String, Book> hm = populateList();
		List<Book> bookList = poupulateListFromMap(hm);
		System.out.println("original list");
		bookList.forEach(b->System.out.println(b));
		
		Comparator<Book> comp=(b1, b2)->((Double)b1.getPrice()).compareTo(b2.getPrice());
		Collections.sort(bookList,comp);
		System.out.println("Listed sorted on price");
		bookList.forEach(System.out::println);
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
