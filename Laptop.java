package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;

public class Laptop implements Shopping{

	private JFrame frame;

	private static Laptop laptopInstance = null;

	private Laptop() {
	
	}
	
	public static Laptop getInstance(){
		if(laptopInstance == null){
			laptopInstance = new Laptop();
			laptopInstance.initialize();
			System.out.println("Laptop object created");
		}
		laptopInstance.frame.setVisible(true);
		return laptopInstance;
	}
	
	@Override
	public void categorySelected() {
		// TODO Auto-generated method stub
		System.out.println("Category selected is Laptop");
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Laptop window = new Laptop();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblBrand.setForeground(Color.CYAN);
		lblBrand.setBounds(10, 36, 46, 14);
		frame.getContentPane().add(lblBrand);
		
		JRadioButton rdbtnDell = new JRadioButton("DELL");
		rdbtnDell.setSelected(true);
		rdbtnDell.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnDell.setForeground(Color.PINK);
		rdbtnDell.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnDell.setBounds(83, 32, 69, 23);
		frame.getContentPane().add(rdbtnDell);
		rdbtnDell.setActionCommand("DELL");
		
		JRadioButton rdbtnHp = new JRadioButton("HP");
		rdbtnHp.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnHp.setForeground(Color.PINK);
		rdbtnHp.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnHp.setBounds(166, 32, 57, 23);
		frame.getContentPane().add(rdbtnHp);
		rdbtnHp.setActionCommand("HP");
		
		JRadioButton rdbtnSony = new JRadioButton("SONY");
		rdbtnSony.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtnSony.setForeground(Color.PINK);
		rdbtnSony.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtnSony.setBounds(236, 32, 75, 23);
		frame.getContentPane().add(rdbtnSony);
		rdbtnSony.setActionCommand("SONY");
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 61, 434, 14);
		frame.getContentPane().add(separator);
		
		JSlider slider = new JSlider();
		slider.setMaximum(1);
		slider.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		slider.setBackground(UIManager.getColor("Button.darkShadow"));
		slider.setBounds(116, 86, 51, 23);
		frame.getContentPane().add(slider);
		
		JLabel lblRam = new JLabel("RAM");
		lblRam.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblRam.setForeground(Color.CYAN);
		lblRam.setBackground(UIManager.getColor("Button.darkShadow"));
		lblRam.setBounds(10, 133, 57, 14);
		frame.getContentPane().add(lblRam);
		
		JLabel lblHdd = new JLabel("HDD");
		lblHdd.setForeground(Color.CYAN);
		lblHdd.setBackground(UIManager.getColor("Button.darkShadow"));
		lblHdd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblHdd.setBounds(10, 169, 46, 14);
		frame.getContentPane().add(lblHdd);
		
		JRadioButton rdbtngb = new JRadioButton("2GB");
		rdbtngb.setSelected(true);
		rdbtngb.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtngb.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtngb.setForeground(Color.PINK);
		rdbtngb.setBounds(83, 131, 69, 23);
		frame.getContentPane().add(rdbtngb);
		rdbtngb.setActionCommand("2");
		
		JRadioButton rdbtngb_1 = new JRadioButton("4GB");
		rdbtngb_1.setForeground(Color.PINK);
		rdbtngb_1.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtngb_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtngb_1.setBounds(166, 129, 69, 23);
		frame.getContentPane().add(rdbtngb_1);
		rdbtngb_1.setActionCommand("4");
		
		JRadioButton rdbtngb_2 = new JRadioButton("256GB");
		rdbtngb_2.setSelected(true);
		rdbtngb_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtngb_2.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtngb_2.setForeground(Color.PINK);
		rdbtngb_2.setBounds(83, 167, 75, 23);
		frame.getContentPane().add(rdbtngb_2);
		rdbtngb_2.setActionCommand("256");
		
		JRadioButton rdbtntb = new JRadioButton("512GB");
		rdbtntb.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbtntb.setBackground(UIManager.getColor("Button.darkShadow"));
		rdbtntb.setForeground(Color.PINK);
		rdbtntb.setBounds(166, 165, 75, 23);
		frame.getContentPane().add(rdbtntb);
		rdbtntb.setActionCommand("512");
		
		ButtonGroup bGBrand = new ButtonGroup();
		bGBrand.add(rdbtnDell);
		bGBrand.add(rdbtnHp);
		bGBrand.add(rdbtnSony);
		
		ButtonGroup bGRam = new ButtonGroup();
		bGRam.add(rdbtngb);
		bGRam.add(rdbtngb_1);
		
		ButtonGroup bGHdd = new ButtonGroup();
		bGHdd.add(rdbtngb_2);
		bGHdd.add(rdbtntb);
		
		JButton btnNewButton = new JButton("Show Order List");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OrderListForm olf = new OrderListForm();
			}
		});
		btnNewButton.setBounds(236, 227, 134, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnChangeCatepgry = new JButton("Change Category");
		btnChangeCatepgry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Form1 formInstance  = Form1.getInstance();
			System.out.println(formInstance);
			laptopInstance.frame.setVisible(false);
			}
		});
		btnChangeCatepgry.setBounds(83, 227, 140, 23);
		frame.getContentPane().add(btnChangeCatepgry);
		
		JButton btnAddToCart = new JButton("Add to cart");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String brand = bGBrand.getSelection().getActionCommand();
				int type = slider.getValue();
				int ram = Integer.parseInt(bGRam.getSelection().getActionCommand());
				int hdd = Integer.parseInt(bGHdd.getSelection().getActionCommand());
				String brand_type;
				if(type == 0){
					brand_type = brand.concat("_old");
				} else{
					brand_type= brand.concat("_new");
				}
				LaptopDetails laptop = (LaptopDetails)LaptopFactory.getLaptop(brand_type, brand);
				laptop.setData(ram, hdd, type);
				LaptopDetails.al.add(laptop);
				laptop.printTotal();
			}
		});
		btnAddToCart.setBounds(177, 193, 102, 23);
		frame.getContentPane().add(btnAddToCart);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 118, 445, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblType = new JLabel("Type");
		lblType.setForeground(Color.CYAN);
		lblType.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblType.setBackground(UIManager.getColor("Button.darkShadow"));
		lblType.setBounds(10, 84, 46, 23);
		frame.getContentPane().add(lblType);
		
		JLabel lblOld = new JLabel("Old");
		lblOld.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblOld.setForeground(Color.PINK);
		lblOld.setBounds(83, 86, 46, 21);
		frame.getContentPane().add(lblOld);
		
		JLabel lblNew = new JLabel("New");
		lblNew.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNew.setForeground(Color.PINK);
		lblNew.setBounds(177, 77, 46, 38);
		frame.getContentPane().add(lblNew);
	}
}
