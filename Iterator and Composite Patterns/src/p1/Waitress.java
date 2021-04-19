package p1;

import java.util.ArrayList;

public class Waitress {

	private PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
	private ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

	DinerMenu dinerMenu = new DinerMenu();
	MenuItem[] lunchItems = dinerMenu.getMenuItems();
	
	public Waitress (PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
//		this.pancakeHouseMenu = pancakeHouseMenu;
//		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {

		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem) breakfastItems.get(i);
			System.out.print((menuItem.getName()) + " ");
			System.out.println((menuItem.getPrice()) + " ");
			System.out.println(menuItem.getDescription());
		}

		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem =lunchItems[i];
			System.out.print((menuItem.getName()) + " ");
			System.out.println((menuItem.getPrice()) + " ");
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
