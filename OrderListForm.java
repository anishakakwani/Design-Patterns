package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Font;

public class OrderListForm {

	private JFrame frame;
	private JTable table;
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderListForm window = new OrderListForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public OrderListForm() {
		initialize();
	}

	private void initialize() { 
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Total number of objects from laptopCount counter: " + LaptopDetails.laptopCount);
				System.out.println("Total number of objects from ArrayList counter: " + LaptopDetails.al.size());
				System.exit(0);
			}
		});
		btnExit.setBounds(177, 210, 89, 23);
		frame.getContentPane().add(btnExit);
		
		String data1[][]={ {"101","Amit","670000"},    
                {"102","Jai","780000"},    
                {"101","Sachin","700000"}};    
		
		String data[][] = new String[LaptopDetails.al.size()][4];
		for(int i = 0; i < LaptopDetails.al.size(); i++){
			LaptopDetails ld = LaptopDetails.al.get(i);
			String dataOfOneObject[] = ld.getData();//new String[4];
			for(int j = 0; j < 4;j++){
				data[i][j] = dataOfOneObject[j];
			}
		}
		String column[]={"BRAND","TYPE","RAM","HDD"};    
		
		table=new JTable(data,column);    
		table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		table.setBounds(10, 11, 414, 177);
		frame.getContentPane().add(table);
		frame.setVisible(true);
	}
}
