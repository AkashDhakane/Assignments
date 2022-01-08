package custom_sorting;

import java.util.Comparator;
import com.customerManagement.app.Customer;

public class CustomerTypeAscSorting implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		int n = (o1.getType()).compareTo(o2.getType());
		if(n==-1) {
			return -1; 
		} else if(n==0) {
			return 0;
		}else {
			return 1;
		}
		
	}

}
