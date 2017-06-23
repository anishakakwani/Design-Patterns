package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Form1 {

	private JFrame frame;
	private static Form1 form1Instance = null;
	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1Instance = getInstance();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static Form1 getInstance(){
		if(form1Instance == null){
			form1Instance = new Form1();
			form1Instance.initialize();
		}
		form1Instance.frame.setVisible(true);
		return form1Instance;
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	private Form1() {
		//initialize();
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setBounds(100, 100, 468, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setBounds(183, 11, 75, 24);
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblNewLabel = new JLabel("Select category:");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(23, 42, 139, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Clothing");
		rdbtnNewRadioButton.setForeground(Color.PINK);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(132, 100, 149, 24);
		frame.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("Clothing");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Laptop");
		rdbtnNewRadioButton_1.setForeground(Color.PINK);
		rdbtnNewRadioButton_1.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnNewRadioButton_1.setBounds(132, 126, 149, 24);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setActionCommand("Laptop");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mobile");
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnNewRadioButton_2.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnNewRadioButton_2.setForeground(Color.PINK);
		rdbtnNewRadioButton_2.setBounds(132, 153, 149, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setActionCommand("Mobile");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Grocery");
		rdbtnNewRadioButton_3.setForeground(Color.PINK);
		rdbtnNewRadioButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		rdbtnNewRadioButton_3.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnNewRadioButton_3.setBounds(132, 179, 149, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setActionCommand("Grocery");
		
		ButtonGroup bG = new ButtonGroup();
		bG.add(rdbtnNewRadioButton);
		bG.add(rdbtnNewRadioButton_1);
		bG.add(rdbtnNewRadioButton_2);
		bG.add(rdbtnNewRadioButton_3);
	     
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cat = bG.getSelection().getActionCommand();
				ShoppingFactory shoppingFactory = new ShoppingFactory();
			    Shopping shopping1 = shoppingFactory.getShoppingCategory(cat);
			    System.out.println(shopping1);
			    shopping1.categorySelected();    
			}
		});
		btnNext.setBackground(UIManager.getColor("Button.background"));
		btnNext.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNext.setBounds(183, 268, 89, 23);
		frame.getContentPane().add(btnNext);
	}
}