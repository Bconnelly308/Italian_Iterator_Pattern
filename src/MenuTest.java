public class MenuTest {
	public static void main(String args[]) {
		DessertMenu dessertMenu = new DessertMenu();
		EntreeMenu entreeMenu = new EntreeMenu();
		AppetizerMenu appetizerMenu = new AppetizerMenu();
 
		WaitStaff waitStaff = new WaitStaff(appetizerMenu, entreeMenu, dessertMenu);
 
		waitStaff.printMenu();
		waitStaff.printVegetarianMenu();
		waitStaff.printGlutenfreeMenu();

		System.out.println("\nWait Staff asks, what would you like to order today?");
		System.out.println("\nCustomer 1 asks, is the Fish of the Day Gluten Free?");
		System.out.print("Waitress says: ");
		if (waitStaff.isItemGlutenfree("Fish of the Day")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer 2 asks, is the Baked Ziti Vegetarian?");
		System.out.print("Waitress says: ");
		if (waitStaff.isItemVegetarian("Baked Ziti")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer 3 asks, is the Funghi Pizza Gluten Free and Vegetarian?");
		System.out.print("Waitress says: ");
		if (waitStaff.isItemVegetarian("Funghi Pizza") && waitStaff.isItemGlutenfree("Funghi Pizza")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}