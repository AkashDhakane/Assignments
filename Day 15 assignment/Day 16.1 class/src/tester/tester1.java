package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.library.Book;


import customeException.BookCustomException;
import enums.Category;

import static enums.Category.*;
import static utils.CollectionUtils.populateList;
import static utils.CollectionUtils.foundByTitle;;
public class tester1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Book> books = populateList();
			boolean exit = false;
			while (!exit) {
				System.out.println(" 1 Add Book 2. Show all book 3.Issue a book 4.Return a book 5.Remove a book "
						+ "\n6. Remove all books written by a specific author , published under specific category"
						+ "\n7. Display Title , author name n price of all books , published before specific date"
						+ "\n8. Sort all the books in the library asc order of book title"
						+ "\n9. Sort all the books in the library , based upon desc order of book title"
						+ "\n10. Sort the books in the library as per date n price"
						+ " 20. Exit");
				System.out.println("Enter your choice");

				try {
					switch (sc.nextInt()) {
					case 1://increase qty of books if already in the map otherwise add new book;
						System.out.println("enter tilte");
						sc.nextLine();
						String bTitle = sc.nextLine();
						if(books.containsKey(bTitle)) {
							System.out.println("Enter quantity for increasing");
							Book b = books.get(bTitle);
							b.setQuantity(b.getQuantity()+sc.nextInt());
							System.out.println("Quantity of book increased");
						}else {
							System.out.println("Enter author name");
							String aName = sc.nextLine();
							sc.nextLine();
						System.out.println("Enter book details: price, publishdate, quantity, "
								+ "category(FANTASY,SCIENCE_FICTION,MYSTRY,HORROR,MEMOIR,AUTOBIOGRAPHY, ACTION_AND_ADVENTURES");
						books.put(bTitle,new Book(bTitle, sc.nextDouble(), sc.next(), aName, sc.nextInt(),
								sc.next().toUpperCase()));
						}
						break;
					case 2:// show all the book details;
						for(Book b: books.values()) {
							System.out.println(b);
						}
						break;
					case 3: //Issue a single copy of the book
						System.out.println("enter tilte");
						sc.nextLine();
						bTitle = sc.nextLine();
						Book b = foundByTitle(bTitle, books);
						b.setQuantity(b.getQuantity()-1);
						System.out.println("Book Issued successfully!!");
						break;
					case 4:// return a book
						System.out.println("enter tilte");
						sc.nextLine();
						bTitle = sc.nextLine();
							b = foundByTitle(bTitle, books);
							b.setQuantity(b.getQuantity()+1);
							System.out.println("Book returned Successfully!!");
						
						
						break;
					case 5://remove a book
						System.out.println("Enter booktitle");
						sc.nextLine();
						bTitle = sc.nextLine();
						Book a = books.remove(bTitle);
						if(a==null) {
							throw new BookCustomException("Book removed!!");
						}else {
						System.out.println(a+"book removed from library!!");
						}
						break;
					case 6:// remove book of specific author published in specific catgory
						System.out.println("author name");
						sc.nextLine();
						String aName = sc.nextLine();
						System.out.println("Enter category of book");
						Category catgry= valueOf(sc.next());
						Iterator<Book> itr =books.values().iterator();
						while(itr.hasNext()) {
							Book tempBook = itr.next();
							if(tempBook.getAuthorName().equals(aName) && tempBook.getCategory().equals(catgry)) {
								itr.remove();	
							}
						}
						System.out.println("book removed");
						break;
					case 7://Display Title , author name n price of all books , published before specific date
						System.out.println("Enter date(yyyy-mm-dd");
						LocalDate date = LocalDate.parse(sc.next());
						itr =books.values().iterator();
						while(itr.hasNext()) {
							Book tempBook = itr.next();
							if(tempBook.getPublishDate().isBefore(date)) {
								System.out.println("Book Title: "+tempBook.getTitle()+", Author: "+tempBook.getAuthorName()+", Price: "+tempBook.getPrice());
							}
						}
						break;
					case 8://Sort all the books in the library asc order of book title
						TreeMap<String, Book> sortedBooks = new TreeMap<String, Book>(books);
						itr=sortedBooks.values().iterator();
						while(itr.hasNext()) {
							System.out.println(itr.next());
							
							}
						
						
						break;
					case 9://Sort all the books in the library , based upon desc order of book title"
						sortedBooks=new TreeMap<String, Book>(new Comparator<String>(){
							@Override
							public int compare(String b1, String b2) {
							return b2.compareTo(b1);
							}
						});
						sortedBooks.putAll(books);
						itr = sortedBooks.values().iterator();
						while(itr.hasNext()) {
							System.out.println("desc order of book title \n"+itr.next());
						}
						
						break;
					case 10://Sort the books in the library as per date n price"
						System.out.println("Sorted books (date n price)");
						ArrayList<Book> alBooks = new ArrayList<Book>(books.values());
						Collections.sort(alBooks,new Comparator<Book>() {

							@Override
							public int compare(Book o1, Book o2) {
								if(o2.getPublishDate().compareTo(o1.getPublishDate()) == 0)
									return ((Double)o2.getPrice()).compareTo(o1.getPrice());
								return o2.getPublishDate().compareTo(o1.getPublishDate());
							}
						});
						for(Book book : alBooks) {
							System.out.println(book);
						}
						break;
						
					case 20:
							exit= true;
						break;

					default:
						break;
					}

					

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
