package tester;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import static com.customerManagement.app.Customer.sdf;
import com.customerManagement.app.Customer;

import custom_sorting.CustomerDobDescComparator;

import static enums_pack.CustomerType.*;
import custome_exception.CustomerHandlingException;
import enums_pack.CustomerType;

import static utils.CustomerValidationRules.*;
import static utils.CollectionUtils.populateList;
public class Tester1 {

	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Customer capacity/limit");
			ArrayList<Customer> customers = populateList();
			boolean exit =false;
			while(!exit) {
				System.out.println("options 1. Add Customer 2. Dispaly all 3. Login 4. linked Adhar  5. Change Password \n6. Add senior Citizen to Gold plan "
						+ "7. remove all customers from Silver plan 8. sort Customers as per email in asc order \n9.  Sort customer as per Dob (desc )"
						+ " 10.Sort customer as per Dob (desc ) n Plan (customer type)  100. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
							System.out.println("Enter Customer details : name email password regAmount dob type");
							Customer c1 = validateAllPoints(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),sc.next().toUpperCase(), customers);
							customers.add(c1);
							System.out.println("Customer added to CMS");
						
						
						break;
					case 2://
						System.out.println("CMS details");
						for(Customer c : customers) {
							if(c!=null) {
								System.out.println(c);
							}
						}
						break;
					case 3:
						System.out.println(" Log in");
						System.out.println("Enter details : email passwrod");
						customerLogin(sc.next(),sc.next(),customers);
						break;
						
					case 4:
						System.out.println("your are here to link your adhar no.");
						System.out.println("Enter your email");
						String email = sc.next();
						Customer c = findByEmail(email, customers);
						if(c.getAdhar()==null) {
							System.out.println("Enter your aadhar number and location");
							c.assignAdharno(sc.nextLong(),sc.next());
							System.out.println("adhar linked to your details");
						}else {
							throw new CustomerHandlingException("Customer with "+email+"is not available in our db");
						}
						break;
					case 5:
						System.out.println("Enter email and password");
						c = authenticateCustomer(sc.next(),sc.next(),customers);
						System.out.println("Enter new password");
						c.setPassword(sc.next());
						System.out.println("password changed successfully!!");
						break;
					case 6:
						boolean flag = false;
						System.out.println("enter your dob");
						Date dob = sdf.parse(sc.next());
						for(Customer c2: customers) {
							if(c2.getDob().equals(dob) && c2.getDob().before(sdf.parse("31-12-1961"))){
								c2.setType(PLATINUM);
								flag = true;
							}
						}
						if(flag==false) {
							throw new CustomerHandlingException("not a seniour citizen");
						}
						break;
					case 7:
					Iterator<Customer> customerItr = customers.iterator();
					while(customerItr.hasNext()) {
						if(customerItr.next().getType()==CustomerType.SILVER) {
							customerItr.remove();
							System.out.println("SILVER type customer removed");
						}
					}
						break;
					case 8:
						Collections.sort(customers);
						System.out.println("Customer sorted as per email in asc/natural order");
						for(Customer c2: customers) {
							System.out.println(c2);
						}
						break;
					case 9:
						Collections.sort(customers, new CustomerDobDescComparator());
						System.out.println("Customer sorted as per dob in desc order");
						for(Customer c2: customers) {
							System.out.println(c2);
						}
						break;
					case 10:
						Collections.sort(customers, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								int retVal = o1.getDob().compareTo(o2.getDob());
								if(retVal==0) {
									return o1.getType().compareTo(o2.getType());
								}else {
									return retVal;
								}
							}
						});
						System.out.println("Customer sorted as per dob and type");
						for(Customer c2: customers) {
							System.out.println(c2);
						}
						break;
					case 100:
						exit=true;
	
						break;

					default:
						break;
					}
				}catch(Exception e) {
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}
				sc.nextLine();
			}
			
			
			
			
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());

	}
	}

}
