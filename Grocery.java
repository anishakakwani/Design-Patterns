package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Grocery implements Shopping{

	private JFrame frame;

	private static Grocery groceryInstance = null;

	private Grocery() {
	
	}
	
	public static Grocery getInstance(){
		if(groceryInstance == null){
			groceryInstance = new Grocery();
			groceryInstance.initialize();
			System.out.println("Grocery object created");
		}
		//groceryInstance.frame.setVisible(true);
		return groceryInstance;
	}
	
	@Override
	public void categorySelected() {
		// TODO Auto-generated method stub
		System.out.println("Category selected is Grocery");
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grocery window = new Grocery();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
