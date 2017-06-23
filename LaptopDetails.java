package assignment;

import java.util.ArrayList;

public class LaptopDetails implements Computer {
	private String brand;
	private int ram;
	private int hdd;
	private String type;
	public static int laptopCount;
	public static ArrayList<LaptopDetails> al = new ArrayList<LaptopDetails>();
	public LaptopDetails(String brand) {
		this.brand = brand;
	}
	void setData(int a, int b, int c){
		ram = a;
		hdd = b;
		if(c == 0){
			type = "old";
		} else{
			type = "new";
		}
	}
	String[] getData(){
		String data[] = new String[4];
		data[0] = this.brand;
		data[1] = this.type;
		data[2] = String.valueOf(this.ram);
		data[3] = String.valueOf(this.hdd);
		return data;
	}
	@Override
	public void printTotal() {
		// TODO Auto-generated method stub
		System.out.println("Laptop brand: " + brand + " Type: " + type +", RAM: " + ram + "GB, HDD: " + hdd + "GB");
	}
}
