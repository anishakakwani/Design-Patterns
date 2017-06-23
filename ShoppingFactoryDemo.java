package assignment;

public class ShoppingFactoryDemo {
	 public void category(String cat) {
	      ShoppingFactory shoppingFactory = new ShoppingFactory();
	      Shopping shopping1 = shoppingFactory.getShoppingCategory(cat);
	      System.out.println(shopping1);
	      shopping1.categorySelected();
	   }

}
