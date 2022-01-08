package tester;

import static utils.CollectionUtils.populateList;
import static utils.CollectionUtils.populateMap;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import com.app.Book;

public class Test2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Book> books = populateMap();
		List <Book> b1=populateList(books);
		b1.forEach(System.out::println);
		System.out.println("ENter date to remove boooks");
		LocalDate d=LocalDate.parse(sc.next());
		//USing removeIf 
		b1.removeIf(a->(a.getPublishDate().isBefore(d)));
		b1.forEach(System.out::println);
		System.out.println("Using Map");
		books.forEach((a,b) -> System.out.println(b));
		//Custom sorting..
		System.out.println("After custom sorting");
		
		Collections.sort(b1,(b3,b2) ->((Double)b3.getPrice()).compareTo(b2.getPrice()));
		b1.forEach(System.out::println);
	}

}
