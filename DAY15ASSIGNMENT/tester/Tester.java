package tester;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import com.app.*;

import com.app.Book;

public class Tester {

	public static void main(String[] args) {
		
		HashSet <Book> bookset=new HashSet<Book>();
		
		Book b1=new Book("Chava",Category.ADVENTURE, 5000, LocalDate.parse("2021-12-21"), "Shivaji jadhav", 3);
		Book b2=new Book("Abc",Category.BIOGRAPHY, 545, LocalDate.parse("2020-12-21"), "BBC", 4);
		Book b3=new Book("Abc",Category.ADVENTURE, 5000, LocalDate.parse("2000-04-21"), "ABC", 5);
		Book b4=new Book("Abb",Category.FANTASY, 5000, LocalDate.parse("2021-03-21"), "CD", 2);
		bookset.add(b1);
		bookset.add(b4);
		bookset.add(b2);
		bookset.add(b3);
		Book b5=new Book()
		for(Book b:bookset)
		{
			System.out.println(b);
		}
		
		
		
		
	}

}
