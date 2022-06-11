package paket1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class noviP {
	 Knjiga temp = null;

	
	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					noviP window = new noviP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public noviP() {
		initialize();
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Knjiga pros=null;
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(289, 176, 141, 37);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(289, 241, 141, 37);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("chose book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ks cppp1 = new ks(pros);
				cppp1.setVisible(true);
			
			}
		});
		btnNewButton.setBounds(289, 28, 141, 59);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Connection type :");
		lblNewLabel.setBounds(154, 120, 97, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number of pages :");
		lblNewLabel_1.setBounds(154, 173, 97, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Year of Printing :");
		lblNewLabel_2.setBounds(154, 241, 109, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rented :");
		lblNewLabel_3.setBounds(154, 319, 97, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		String[] ar = {"soft", "hard"};
		JComboBox comboBox = new JComboBox(ar);
		comboBox.setBounds(289, 115, 141, 37);
		frame.getContentPane().add(comboBox);
		
		String[] agg = {"Serbian", "English","France","German","Russian"};
		JComboBox comboBox_1 = new JComboBox(agg);
		comboBox_1.setBounds(289, 383, 141, 37);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Language :");
		lblNewLabel_4.setBounds(154, 388, 76, 26);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBounds(187, 470, 134, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		String[] arr = {"true", "false"};
		JComboBox comboBox_2 = new JComboBox(arr);
		comboBox_2.setBounds(289, 314, 141, 37);
		frame.getContentPane().add(comboBox_2);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String povez =String.valueOf(comboBox.getSelectedItem());
				String jezik =String.valueOf(comboBox_1.getSelectedItem());
				String iznajm =String.valueOf(comboBox_2.getSelectedItem());
				String brojstr =String.valueOf(textField_2.getText());
				String godina =String.valueOf(textField_3.getText());
				if(pros == null)
				{
					JOptionPane.showMessageDialog(null, "Chose a row in a table first.", "Error", JOptionPane.WARNING_MESSAGE);
				}
				else
				{
				//	if()
					{
						
					}
			//		else
					{
						
					}
				}
			}
		});
		
	}

}
