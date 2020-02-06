public class MenuItem {
	String name;
	String description;
	boolean glutenfree;
	boolean vegetarian;
	double price;
	int calories;
 
	public MenuItem(String name, 
	                String description, 
	            	boolean glutenfree,
	            	boolean vegetarian,
	            	double price,
	            	int calories) 
	{
		this.name = name;
		this.description = description;
		this.glutenfree = glutenfree;
		this.vegetarian = vegetarian;
		this.price = price;
		this.calories = calories;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
	
	public int getCalories() {
		return calories;
		
	}
  
	public boolean isGlutenfree() {
		return glutenfree;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}

}