package assignment;

import java.util.HashMap;

public class LaptopFactory {
	private static final HashMap<String, Computer> laptopMap = new HashMap();
	public static Computer getLaptop(String brand_type, String brand){
		LaptopDetails laptop = (LaptopDetails)laptopMap.get(brand_type);
		if(laptop == null) {
	    	  laptop = new LaptopDetails(brand);
	    	  LaptopDetails.laptopCount++;
	    	  laptopMap.put(brand_type, laptop);
    		  System.out.println("Creating laptop object of brand : " + brand_type);
		}
			return laptop;
	}
	
	private int laptopObjectCount(){
		return LaptopDetails.laptopCount;
	}

}
