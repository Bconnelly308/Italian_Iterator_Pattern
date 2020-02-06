import java.util.Iterator;

public class EntreeMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public EntreeMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Chicken Alfredo", "Chicken, Broccoli, Fettuccine Pasta, Alfredo Sauce", 
			false, false, 12.99, 1250);
		addItem("Chicken Marsala", "Chicken, Mushrooms, Fettuccine Pasta, Marsala Sauce", 
				false, false, 10.99, 850);
		addItem("Baked Ziti", "Ziti, Sausage, Mushrooms, Basil, Tomato Sauce", 
				false, false, 12.99, 1550);
		addItem("Lasagna", 
				"Lasagna Noodles, Sausage, Spinach, Ricotta cheese, Tomato Sauce, Mozzarella Cheese", 
				false, false, 11.99, 1400);
		addItem("Fish of the Day", "Fish of the Day, Brocolli, Baked Potato", 
				true, false, 15.99, 1250);
		addItem("Funghi Pizza", "Wild Mushrooms, Tomatos, Fresh Mozzarella, Basil, Caulifower Pizza Crust", 
				true, true, 12.99, 900);
	}
  
	public void addItem(String name, String description, boolean glutenfree, 
			boolean vegetarian, double price, int calories) 
	{
		MenuItem menuItem = new MenuItem(name, description, glutenfree, vegetarian, price, calories);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return new ItalianMenuIterator(menuItems);
		//return new AlternatingDinerMenuIterator(menuItems);
	}
 
	// other menu methods here
}