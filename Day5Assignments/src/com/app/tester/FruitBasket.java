package com.app.tester;

import java.util.Scanner;

import com.app.fruites.Apple;
import com.app.fruites.Fruite;
import com.app.fruites.Mango;
import com.app.fruites.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Basket Size");
		Fruite f[] = new Fruite[sc.nextInt()];
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.printf(
					"******Welcome To Fruite Cart******%n 1.Add Mango %n 2.Add Orange %n 3.Add Apple %n 4.Display Names of all Fruites %n 5.Display name color ,weight ,taste of all fruites %n 6.Mark fruite as stale %n 7.Mark all Sour fruits stale %n 8.What will Your Fruite do(Pulp/juice/jam) %n 9.Exit ");
			System.out.println("Enter Your choice");
			switch (sc.nextInt()) {
			case 1:
				if (counter < f.length) {
					/* System.out.println("Enter name of Fruit,Color,Weight"); */
					
					f[counter++] = (new Mango("Mango","Yellow",1, true));
				} else {
					System.out.println("Basket Is Full");
				}

				break;
			case 2:
				if (counter < f.length) {
					//System.out.println("Enter name of Fruit,Color,Weight");
					f[counter++] = new Orange("Orange","Orange", 1, true);
				} else {
					System.out.println("Basket Is Full");
				}
				break;
			case 3:
				if (counter < f.length) {
					//System.out.println("Enter name of Fruit,Color,Weight");
					f[counter++] = new Apple("Apple", "Red",1, true);
				} else {
					System.out.println("Basket Is Full");
				}
				break;
			case 4:
				for (Fruite p : f) {
					if (p != null) {
						System.out.println(p.getName());
					}
				}
				break;
			case 5:
				for (Fruite p : f) {
					if (p != null && p.isFresh() == true) {
						System.out.println("Name Of Fruit " + p.getName() + " Color: " + p.getColor() + " weight: "
								+ p.getWeight() + " Taste" + p.taste());
					}
				}
				break;
			case 6:
				System.out.println("Enter A fruite to Mark as stale (Index)");
				int index = sc.nextInt() - 1;
				if (index < counter && f[index] != null) {
					f[index].setFresh(false);
				} else {
					System.out.println("Enter valid index !!! Your cart having only  " + counter + "Fruits");
				}
				break;
			case 7:
				System.out.println("Marking all sour fruits as stale");
				for (Fruite p : f) {
					if (p != null && (p.taste()).equals("Sour")) {
						p.setFresh(false);

					}
				}
				System.out.println("Marked as Stale!!");
				break;
			case 8:
				System.out.println("Enter index For Fruit functionality");

				int i = sc.nextInt() - 1;
				if (i < counter) {
					if (f[i] instanceof Mango) {
						((Mango) f[i]).pulp();
					} else if (f[i] instanceof Orange) {
						((Orange) f[i]).juice();
					} else {
						((Apple) f[i]).jam();
					}
				} else {
					System.out.println("Enter valid Input cart is having only " + counter + "fruites");
				}
				break;
			case 9:
				System.out.println("Thanks For Visiting !!");
				exit=true;
				break;
			default:
				System.out.println("Pls Enter Valid Input ");
				break;
			}

		}

	}

}
