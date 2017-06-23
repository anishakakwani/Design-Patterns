package assignment;




import org.junit.Assert;
import org.junit.Test;

public class NumberOfLaptopObjects {

	@Test
	public  void testFactory() {
		Computer laptop = LaptopFactory.getLaptop("DELL_new", "DELL"); 
		Assert.assertTrue(laptop instanceof LaptopDetails); 
	}
	
	@Test
	public  void testFactory1() {
		Computer laptop = LaptopFactory.getLaptop("HP_new","HP");
		laptop = LaptopFactory.getLaptop("DELL_new","DELL");
		laptop = LaptopFactory.getLaptop("DELL_old","DELL");
		Assert.assertEquals(3, LaptopDetails.laptopCount); 

	}
}
