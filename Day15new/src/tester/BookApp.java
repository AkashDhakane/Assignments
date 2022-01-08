package tester;

import static utils.CollectionUtils.populateMap;
import static utils.validations.findbook;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import static com.app.Category.valueOf;

import com.app.Book;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Book> books = populateMap();
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Add Book 2. Display 3. Issue Book 4.Return Book 5.remove book 6. 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter book name");
						String book = sc.next();
						Book b = findbook(book, books);
						if (b != null) {
							b.setQuantity(b.getQuantity() + 1);
						} else {
							System.out.println("Enter book Details:BookType ,Publish date , author,quantity");
							books.put(book, new Book(book, valueOf(sc.next()), sc.nextDouble(),
									LocalDate.parse(sc.next()), sc.next(), sc.nextInt()));
						}

						break;
					case 2:
						System.out.println("A/C created...");
						for (Book a : books.values())
							System.out.println(a);
						break;
					case 3:
						System.out.println("Enter book name");
						book = sc.next();
						b = findbook(book, books);
						if (b != null) {
							b.setQuantity(b.getQuantity() - 1);
						}
						break;
					case 4:
						System.out.println("Enter book name");
						book = sc.next();
						b = findbook(book, books);
						if (b != null) {
							b.setQuantity(b.getQuantity() + 1);
						} else {
							System.out.println("Book not found !!");
						}
						break;
					case 5:
						System.out.println("Enter book name");
						book = sc.next();
						b = findbook(book, books);
						if (b != null) {
							books.remove(b.getTitle());
						} else {
							System.out.println("Book not Found");
						}
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}

		}
	}

}
