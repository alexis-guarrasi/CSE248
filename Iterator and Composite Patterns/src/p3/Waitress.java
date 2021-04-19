package p3;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;

	
	
	public Waitress (PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		System.out.println("MENU\n------\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
		
	}
	
	
	public void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}

	public void printBreakfastMenu() {

	}

	public void printVegetarianMenu() {

	}

	public void printLunchMenu() {

	}

	public boolean isItemVegetarian(String name) {
		return false;
	}

}
