package utils;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import static com.app.customer.Customer.sdf;
import com.app.customer.Customer;

import CustomerHandlingException.CustomerException;
import enums.CustomerType;

public class ValidationRules {
	private static Date maxDob;
	static {
		try {
			maxDob = sdf.parse("01-01-1995");
		} catch (ParseException e) {
			System.out.println(e);
		}
	}

	// validateall
	public static Customer validateAll(String name, String email, String password, double registrationAmount,
			String dob, String type, Customer[] customers) throws CustomerException, ParseException {
		// validateAll : all validate methods will be call here
		// arguments : String name, String email, String password, double
		// registrationAmount, String dob, CustomerType type
		// output : Customer instance
		validateCheckUniqueEmail(email, customers);
		validatePassword(password);
		Date validatedDob = validateDob(dob);
		CustomerType validatedType = parseAndValidateType(type);
		validateRegistrationAmount(registrationAmount, validatedType);
		return new Customer(name, email, password, registrationAmount, validatedDob, validatedType);
	}

	// validateCheckUniqueEmail
	public static void validateCheckUniqueEmail(String email, Customer[] customers) throws CustomerException {
		// validateCheckUniqueEmail : will raise exception when duplicate or invalid
		// email is entered.
		// arguments : 1> String email{email entered} 2> Customer[] customers{array of
		// all registered customer
		// output: void
		email = email.toLowerCase();
		if (!email.matches("^[a-z0-9_\\.]+@[a-z]+\\.com$"))
			throw new CustomerException("Email not valid");
		Customer newCustomer = new Customer(email);
		for (Customer c : customers) {
			if (c != null) {
				if (c.equals(newCustomer))
					throw new CustomerException("Email already exist");
			}
		}
	}

	// validatePassword
	public static void validatePassword(String password) throws CustomerException {
		// validatePassword: will throw exception if length of password is not in range
		// of [4,10]
		// arguments: 1> password : string
		// output : void
		int length = password.length();
		if (length < 4 || length > 10)
			throw new CustomerException("Password length should be in between 4 and 10");
	}

	// validateDob
	public static Date validateDob(String dob) throws ParseException, CustomerException {
		// validateDob: will throw exception if date of birth is before 1st Jan 1995
		// arguments: 1> dob : string
		// output : Date
		Date tempDob = sdf.parse(dob);
		if (tempDob.after(maxDob))
			throw new CustomerException("Date of birth must be before 1st Jan 1995");
		return tempDob;
	}

	// validateRegistrationAmount
	public static void validateRegistrationAmount(double registrationAmount, CustomerType type)
			throws CustomerException {
		// validateRegistrationAmount: will throw exception when registration amount
		// does not match customer type
		// arguments: 1> registrationAmount : double | 2> type : CustomerType
		// output: void
		if (type.getRegAmount() != registrationAmount)
			throw new CustomerException(
					"You paid wrong registration amount for the selected plan.\n You must pay registration amount = "
							+ type.getRegAmount());
	}

	// parseAndValidateType
	public static CustomerType parseAndValidateType(String type) {
		// parseAndvalidateType : parse type to CustomerType
		// arguments : 1> type: string
		// output : CustomerType
		return CustomerType.valueOf(type.toUpperCase());
	}

	// validateLogin
	public static void validateLogin(String email, String password, Customer[] customers) throws CustomerException {
		// validateLogin : will throw exception if email does not exist or password is
		// incorrect
		// arguments : 1> email id : String | 2> password : String | 3> customers :
		// array of reference of instance of Customer
		// output : void
		boolean found = false;
		Customer newCustomer = new Customer(email);
		for (Customer c : customers) {
			if (c != null) {
				if (c.equals(newCustomer)) {
					found = true;
					if (c.getPassword().equals(password))
						System.out.println("\n=============\nLogin Success\n=============\n");
					else
						throw new CustomerException("Invalid password");
				}
			}
		}
		if (!found)
			throw new CustomerException("Customer does not exist");
	}

	// linkAdhar
	public static void linkAdhar(String email, Customer[] customers, Scanner sc) throws CustomerException {
		// linkAdhar : check if user exist, if exist link aadhar
		// arguments: 1> emali : string 2> customers : array of reference of instance of
		// Customer 3> sc : instance of Scanner
		// output : void
		Customer newCustomer = new Customer(email);
		for (Customer c : customers) {
			if (c != null) {
				if (c.equals(newCustomer)) {
					System.out.println("Enter aadhar card details : aadhar card no, location : ");
					c.assignAdharCard(sc.next(), sc.next());
				} else
					throw new CustomerException("Customer does not exist");
			}
		}

	}

}
