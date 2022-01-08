package tester;



import java.util.Arrays;

import java.util.List;

public class testerForFunctionalExperessionDay16_2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println("list via lambda");
		list.forEach(i->System.out.println(i));
		System.out.println("list via method reference");
		list.forEach(System.out::println);
		System.out.println("list via lambda");
		list.forEach(i->System.out.print(i+" "));
	}

}
