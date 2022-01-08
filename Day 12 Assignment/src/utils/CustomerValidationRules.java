package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.customerManagement.app.Customer;

import custome_exception.CustomerHandlingException;
import enums_pack.CustomerType;


import static com.customerManagement.app.Customer.sdf;

public class CustomerValidationRules {
	public static Date endDate;
	static {
		try {
			endDate= sdf.parse("01-01-1995");
		}catch(ParseException e){
			System.out.println("err in static init block "+e);
		}
	}

	//chk for dup Cust
	public static void checkForDup(ArrayList<Customer> customers,String email) throws CustomerHandlingException{
		Customer newCustomer = new Customer(email);
			if(customers.contains(newCustomer)) {
				throw new CustomerHandlingException("email already exist");
				}
			
		
		
	}
	
	
	//customer plan validation
	
	public static void validateCustomerType(String customerType, double regtrationAmount) throws CustomerHandlingException{
		
		CustomerType c = CustomerType.valueOf(customerType);
		
		switch (c) {
		case SILVER:
			if(c.getRegistrationAmount() == regtrationAmount) {
				System.out.println("Customer type and amount is valid");
				
			}else {
				throw new CustomerHandlingException("not a valid amount!!");
			}
			break;
		case GOLD:
			if(c.getRegistrationAmount() == regtrationAmount) {
				System.out.println("Customer type and amount is valid");
			}else {
				throw new CustomerHandlingException("not a valid amount!!");
			}
			break;
		case DIAMOND:
			if(c.getRegistrationAmount() == regtrationAmount) {
				System.out.println("Customer type and amount is valid");
			}else {
				throw new CustomerHandlingException("not a valid amount!!");
			}
			break;
		case PLATINUM:
			if(c.getRegistrationAmount() == regtrationAmount) {
				System.out.println("Customer type and amount is valid");
			}else {
				throw new CustomerHandlingException("not a valid amount!!");
			}
			break;

		default:
			System.out.println("check your data , invalid amount or customer type");
			break;
		}
		
		
		
	}
	
	
	
	//customerType validation
	public static CustomerType validateCustomerType(String customerType) {
		return CustomerType.valueOf(customerType.toUpperCase());
		 
	}
	
	//
	
	
	//chk for email have @ and .com;
	public static void validateEmail(String newEmail) throws CustomerHandlingException{
		//if(newEmail.indexOf("@")==-1 || newEmail.indexOf(".com")==-1)
		if(!newEmail.matches("^[A-Za-z0-9+_.-]+@(.+)+.com$")) {
			throw new CustomerHandlingException("invalide email !!!");
		}
	}
	
	public static void validatePassword(String newPassword) throws CustomerHandlingException{
		if(newPassword.length() < 4) {
			throw new CustomerHandlingException("Password must be of 4 char");
		}else if(newPassword.length() >10){
			throw new CustomerHandlingException("Password too long");
		}
	}
	
	
	public static Date parseAndValidateDob(String dob) throws ParseException,CustomerHandlingException {
		// parsing
		Date d1 = sdf.parse(dob);
		// => parsing success , proceed to validation
		if(d1.after(endDate)) //=> err
			throw new CustomerHandlingException("Invalid dob!!!!!");
		//=> validations success
		return d1;
			

	}
	
	//validate password and email for registered customer
	public static void customerLogin(String email, String password,ArrayList<Customer> customers) throws CustomerHandlingException {
		   
        for(Customer c:customers)
        {
      	  if(c!=null)
      	  {
      		  if(c.getEmail().equals(email) && c.getPassword().equals(password))
      		  {
      			  System.out.println("Hello "+c.getName()+" you are logged in successfully!!");
      			  System.out.println("your details is "+c);
      			  return;
      		  }
      	  }
      	 
        }
        throw new CustomerHandlingException("New Customer please register yourself!!!");
     
     
      	  
}
	
	
	
	
	
	
	public static Customer validateAllPoints(String name, String email, String password, double registrationAmount, String dob,
			String type,ArrayList<Customer> customers) throws CustomerHandlingException, ParseException{
		validateEmail(email);
		validatePassword(password);
		Date d1 =parseAndValidateDob(dob);
		CustomerType c = CustomerType.valueOf(type);
		validateCustomerType(type, registrationAmount);
		checkForDup(customers, email);
		
		
		
		return new Customer(name,email,password,registrationAmount,d1,c);
	}
	
	
	
	public static Customer findByEmail(String email, ArrayList<Customer> customers) throws CustomerHandlingException{
		
		Customer c1 = new Customer(email);
		for(Customer c: customers) {
			if(c!=null) {
				if(c.equals(c1)) {
					return c;
				}
			}
		} throw new CustomerHandlingException("Invalid email");
			
	}
	
	public static Customer authenticateCustomer(String email, String password, ArrayList<Customer> customers) throws CustomerHandlingException
	{
		Customer c = findByEmail(email, customers);
		if(c.getPassword().equals(password) && c.getAdhar()!=null) {
			return c;
		} else {
			throw new CustomerHandlingException("Invalid customer");
		}
	}
	
	
}
