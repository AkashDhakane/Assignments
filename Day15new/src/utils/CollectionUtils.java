package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.app.Book;
import com.app.Category;

public class CollectionUtils {
//add static method for populating map with sample data
	public static HashMap<String,Book> populateMap() {
		HashMap<String, Book> map = new HashMap<>();
		// int acctNo, AccountType acType, double balance, LocalDate creationDate,
		// String customerName
		map.put("CHAVA", new Book("CHAVA",Category.ADVENTURE, 5000, LocalDate.parse("2021-12-21"), "Shivaji jadhav", 3));
		map.put("MATHS" ,new Book("MATHS",Category.BIOGRAPHY, 545, LocalDate.parse("2020-12-21"), "BBC", 4));
		map.put("BIOLOGY", new Book("BIOLOGY",Category.ADVENTURE, 4000, LocalDate.parse("2000-04-21"), "ABC", 5));
		map.put("OOPS",new Book("OOPS",Category.FANTASY, 3000, LocalDate.parse("2021-03-21"), "CD", 2));
		map.put("PANCHTANTRA", new Book("PANCHTANTRA",Category.ADVENTURE, 2000, LocalDate.parse("2000-04-21"), "ABC", 5));
		map.put("RICH DAD POOR DAD",new Book("RICH DAD POOR DAD",Category.FANTASY, 1000, LocalDate.parse("2021-03-21"), "CD", 2));
		
		return map;
	}
	public static List<Book> populateList(HashMap<String,Book> map){
	Collection<Book> list=map.values();
	List<Book> l1=new ArrayList<>(list);
	return l1;
	}
}
