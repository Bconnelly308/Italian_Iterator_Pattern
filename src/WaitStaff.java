import java.util.Iterator;
  
public class WaitStaff {
	Menu appetizerMenu;
	Menu entreeMenu;
	Menu dessertMenu;
 
	public WaitStaff(Menu appetizerMenu, Menu entreeMenu, Menu dessertMenu) {
		this.appetizerMenu = appetizerMenu;
		this.entreeMenu = entreeMenu;
		this.dessertMenu = dessertMenu;
	}
 
	public void printMenu() {
		Iterator<MenuItem> appetizerIterator = appetizerMenu.createIterator();
		Iterator<MenuItem> entreeIterator = entreeMenu.createIterator();
		Iterator<MenuItem> dessertIterator = dessertMenu.createIterator();

		System.out.println("ITALIAN MENU\n----\nAPPETIZERS");
		printMenu(appetizerIterator);
		System.out.println("\nENTREES");
		printMenu(entreeIterator);
		System.out.println("\nDESSERTS");
		printMenu(dessertIterator);
	}
 
	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getCalories() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
 
	public void printVegetarianMenu() {
		System.out.println("\nVEGETARIAN MENU\n---------------");
		printVegetarianMenu(appetizerMenu.createIterator());
		printVegetarianMenu(entreeMenu.createIterator());
		printVegetarianMenu(dessertMenu.createIterator());
	}
	
	public void printGlutenfreeMenu() {
		System.out.println("\nGLUTEN FREE MENU\n---------------");
		printGlutenfreeMenu(appetizerMenu.createIterator());
		printGlutenfreeMenu(entreeMenu.createIterator());
		printGlutenfreeMenu(dessertMenu.createIterator());
	}
 
	public boolean isItemVegetarian(String name) {
		Iterator<MenuItem> appetizerIterator = appetizerMenu.createIterator();
		if (isVegetarian(name, appetizerIterator)) {
			return true;
		}
		Iterator<MenuItem> entreeIterator = entreeMenu.createIterator();
		if (isVegetarian(name, entreeIterator)) {
			return true;
		}
		Iterator<MenuItem> dessertIterator = dessertMenu.createIterator();
		if (isVegetarian(name, dessertIterator)) {
			return true;
		}
		return false;
	}
	
	public boolean isItemGlutenfree(String name) {
		Iterator<MenuItem> appetizerIterator = appetizerMenu.createIterator();
		if (isGlutenfree(name, appetizerIterator)) {
			return true;
		}
		Iterator<MenuItem> entreeIterator = entreeMenu.createIterator();
		if (isGlutenfree(name, entreeIterator)) {
			return true;
		}
		Iterator<MenuItem> dessertIterator = dessertMenu.createIterator();
		if (isGlutenfree(name, dessertIterator)) {
			return true;
		}
		return false;
	}


	private void printVegetarianMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.isVegetarian()) {
				System.out.print(menuItem.getName() + ", ");
				System.out.print(menuItem.getCalories() + ", ");
				System.out.print(menuItem.getPrice() + " -- ");
				System.out.println(menuItem.getDescription());
			}
		}
	}
	
	private void printGlutenfreeMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.isGlutenfree()) {
				System.out.print(menuItem.getName() + ", ");
				System.out.print(menuItem.getCalories() + ", ");
				System.out.print(menuItem.getPrice() + " -- ");
				System.out.println(menuItem.getDescription());
			}
		}
	}

	private boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean isGlutenfree(String name, Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isGlutenfree()) {
					return true;
				}
			}
		}
		return false;
	}
}