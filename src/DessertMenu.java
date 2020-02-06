import java.util.ArrayList;
import java.util.Iterator;

public class DessertMenu implements Menu {
	ArrayList<MenuItem> menuItems;
 
	public DessertMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("Chocolate Cake", " Warm Cake served with Ice Cream",
				false, false, 5.99, 850);
 
		addItem("Cheesecake,", "Cheesecake Flavor of the Day",
				false, false, 5.99, 700);
 
		addItem("Cannoli", "Fried Pastry filled with Sweet Cream",
				false, false, 5.99, 650);
 
		addItem("Gelati", "Gelati Flavor of the Day",
				true, true, 5.99, 400);
	}

	public void addItem(String name, String description, boolean glutenfree, 
			boolean vegetarian, double price, int calories)
	{
		MenuItem menuItem = new MenuItem(name, description, glutenfree, vegetarian, price, calories);
		menuItems.add(menuItem);
	}
 
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
  
	// other menu methods here
}