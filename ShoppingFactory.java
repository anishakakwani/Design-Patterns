package assignment;

public class ShoppingFactory {
	public Shopping getShoppingCategory(String category){
		if(category.equalsIgnoreCase("Clothing")){
			return Clothing.getInstance();
		} else if(category.equalsIgnoreCase("Laptop")){
			return Laptop.getInstance();
		} else if(category.equalsIgnoreCase("Mobile")){
			return Mobile.getInstance();
		} else if(category.equalsIgnoreCase("Grocery")){
			return Grocery.getInstance();
		} else{
			return null;
		}
	}
}
