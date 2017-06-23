package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Mobile implements Shopping{

	private JFrame frame;

	private static Mobile mobileInstance = null;

	private Mobile() {
	
	}
	
	public static Mobile getInstance(){
		if(mobileInstance == null){
			mobileInstance = new Mobile();
			mobileInstance.initialize();
			System.out.println("Mobile object created");
		}
		//mobileInstance.frame.setVisible(true);
		return mobileInstance;
	}
	
	@Override
	public void categorySelected() {
		// TODO Auto-generated method stub
		System.out.println("Category selected is Mobile");
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mobile window = new Mobile();
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
