package p7_composite_pattern;

public class Demo {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Desserts");

		MenuComponent allMenus = new Menu("ALL MENUS", "All Menus Combined");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		dinerMenu
				.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce and a slice of sourdough bread", true, 3.89));

		dinerMenu.add(new MenuItem("Vegetarian BLT", "(Faki')Bacon with Letterce & tomato on whole wheat", true, 2.99));
		
		dinerMenu.add(new MenuItem("BLT", "Bacon with Letterce & tomato on whole wheat", false, 2.99));
		dinerMenu.add(new MenuItem("Hotdog", "A hotdog, with saukraut, relish, onipons, topped with cheese" , false, 3.05));
		dinerMenu.add(dessertMenu);

		dessertMenu.add(
				new MenuItem("Apple Pie", "Apple poe with a flakey crust, topped with vanilla icecream", true, 1.59));

		dessertMenu.add(
				new MenuItem("Vannila Icecream", "Vanilla icecream topped with nuts", true, 2.59));
		
		pancakeHouseMenu
				.add(new MenuItem("K & B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));

		pancakeHouseMenu
				.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));

		pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));

		pancakeHouseMenu
				.add(new MenuItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59));

		cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
				"Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));

		cafeMenu.add(new MenuItem("Soup of the Day", "A cup of the soup of the day, with a side salad", false, 3.59));

		cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.59));

		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}

}
