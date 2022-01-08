package utils;

import java.util.HashMap;

import com.app.Book;

public class validations {
			public static Book findbook(String book ,HashMap<String, Book> map)
			{
				
					Book a = map.get(book);
					if (a == null) {
						return null;
					}
					
					
						return a;
					
						
						}
			
			}


