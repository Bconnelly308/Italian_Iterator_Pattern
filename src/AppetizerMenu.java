import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AppetizerMenu implements Menu {
	HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
  
	public AppetizerMenu() {
		addItem("Calamari",
			"Calamari with Lemon Wedge and Tomato Sauce",
			false, false, 12.99, 1300);
		addItem("Caprese Skewers",
			"Fresh Mozzarella Cheese, Basil, Cherry Tomato, and Balsamic Glaze",
			true, true, 7.99, 500);
		addItem("House Salad",
				"Sprinach, Cucumber, Artichoke, Kalamata Olives, Balsamic Dressing",
				true, true, 4.99, 450);
		addItem("Mozzarella Sticks",
			"Mozzarella Cheese, Breading, and Tomato Sauce",
			false, false, 8.99, 750);
	}
 
	public void addItem(String name, String description, boolean glutenfree, 
			boolean vegetarian, double price, int calories) 
	
	{
		MenuItem menuItem = new MenuItem(name, description, glutenfree, vegetarian, price, calories);
		menuItems.put(menuItem.getName(), menuItem);
	}
 
	public Map<String, MenuItem> getItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}