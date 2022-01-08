package utils;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.app.library.Book;

public interface CollectionUtilsIf {
	static List<Book> poupulateListFromMap(Map<String, Book> map){
		
		return new ArrayList<Book>(map.values());
	}
}
