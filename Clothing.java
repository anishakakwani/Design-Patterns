package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Clothing implements Shopping{

	private JFrame frame;

	private static Clothing clothingInstance = null;

	private Clothing() {
	
	}
	
	public static Clothing getInstance(){
		if(clothingInstance == null){
			clothingInstance = new Clothing();
			clothingInstance.initialize();
			System.out.println("Clothing object created");
		}
		//clothingInstance.frame.setVisible(true);
		return clothingInstance;
	}
	
	@Override
	public void categorySelected() {
		// TODO Auto-generated method stub
		System.out.println("Category selected is Clothing");
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clothing window = new Clothing();
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
