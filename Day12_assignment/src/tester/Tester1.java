package tester;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.app.customer.Customer;

import enums.CustomerType;

import static utils.ValidationRules.*;

public class Tester1 {

	public static void main(String[] args) {
		// tester class
		try (Scanner sc = new Scanner(System.in)) {
			// try-with-resources block. resources : 1> Scanner
			System.out.println("Enter Customer base Cap : ");
			Customer[] customers = new Customer[sc.nextInt()]; // customer array
			int counter = 0; // customer count
			boolean exit = false;
			while (!exit) {
				// loop until exist
				try {
					// inner try block
					System.out.println(
							"What do you want to do :\n*******************\n1. Add new customer\n2. Display all registered customers\n3. Customer Login\n4. Link Adhar \n5. Exit\n*******************\nEnter Choice : ");
					switch (sc.nextInt()) {
					case 1:
						if (counter < customers.length && counter >= 0) // check for bounds
							System.out.println(
									"Enter customer details : name, email, password, registrationAmount, validatedDob, type");
						// add customer if everything is good
						customers[counter] = validateAll(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(),
								sc.next(), customers);
						counter++;
						break;
					case 2:
						// print all refistered customers
						System.out.println("All customer details : \n*******************");
						for (Customer c : customers)// c=customers[0],c=customers[1],.........c=customers[customers.length-1]
						{
							if (c != null) {
								System.out.println("\n" + c); // print customer details
							}
						}
						System.out.println("*******************");
						break;
					case 3:
						// login
						System.out.println("Enter login details : email, password");
						validateLogin(sc.next(), sc.next(), customers);
						break;
					case 4:
						// exit the loop
						System.out.println("Enter email to link aadhar :");						
						linkAdhar(sc.next(), customers, sc);
						break;
					case 5:
						// exit the loop
						System.out.println("Ok byeeee");
						exit = true;
						break;
					default:
						System.out.println("Enter valid choice !!!");
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				} catch (Exception e)// catch all exception(catch all block)
				{
					System.out.println(e); // print exception on prompt
				}
			}
		}
	}

}
