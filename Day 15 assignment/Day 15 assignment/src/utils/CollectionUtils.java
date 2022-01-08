package utils;

import java.text.ParseException;
import java.util.HashMap;


import com.app.library.Book;

import customeException.BookCustomException;


public class CollectionUtils {
		
	public static HashMap<String, Book> populateList() throws ParseException{
		HashMap<String, Book> books = new HashMap<String, Book>();
		books.put("Adventures of Tom Sawyer",new Book("Adventures of Tom Sawyer",150,"1990-10-20", "Mark Twin", 5, "ACTION_AND_ADVENTURES" ));
		books.put("Foundation and Earth",new Book("Foundation and Earth",262,"2016-10-20", "Isaac Asimov", 5, "SCIENCE_FICTION" ));
		books.put("Alice's Adventures in Wonderland ",new Book("Alice's Adventures in Wonderland",300,"1865-11-26", "Lewis Carroll", 6, "FANTASY" ));
		books.put("Just Kids",new Book("Just Kids",175,"2010-01-01", "PATTI SMITH", 8, "MEMOIR"));
		books.put("Wings of Fire",new Book("Wings of Fire",200,"2011-01-11", "Arun Tiwari", 10, "AUTOBIOGRAPHY"));
		books.put("The Wind on Haunted Hill",new Book("The Wind on Haunted Hill",125,"2018-11-16", "RUSKIN BOND", 5, "HORROR"));
		books.put("The Bad Samaritan",new Book("The Bad Samaritan",165,"2018-12-11", "Lyon Bell", 8, "MYSTRY"));
		return books;
	}
	
	public static Book foundByTitle(String title,HashMap<String, Book> books ) throws BookCustomException{
		if(books.containsKey(title)) {
			Book b = books.get(title);
			return b;
		}else {
			throw new BookCustomException("Book not found");
		}
	}
}
