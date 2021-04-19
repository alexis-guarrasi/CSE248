package p6;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		ArrayList<Menu> list = new ArrayList<>();
		list.add(pancakeHouseMenu);
		list.add(dinerMenu);
		list.add(cafeMenu);
		Waitress waitress = new Waitress(list);
		waitress.printMenu();

	}

}
