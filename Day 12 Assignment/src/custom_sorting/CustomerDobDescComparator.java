package custom_sorting;

import java.util.Comparator;

import com.customerManagement.app.Customer;

public class CustomerDobDescComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		System.out.println("in comapare : dob");
		int retVal = c1.getDob().compareTo(c2.getDob());
		if(retVal==-1) {
			return 1;
		}else if(retVal==0) {
			return 0;
		}else {
			return -1;
		}
		
	}

}
