package p6;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	private ArrayList<Menu> menus;
	
	public Waitress (ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		Iterator menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.createIterator());
		}
		
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
