package paket1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
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
					noviP window = new noviP(jo);
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
	public noviP(Knjiga jo) {
		initialize();
		this.jo = jo;
	}
	protected static Knjiga jo;

	

	/**
	 * Initialize the contents of the frame.
	 */
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Integer d = Integer.valueOf(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	private void initialize() {
	
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 539, 585);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(289, 176, 141, 37);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(289, 241, 141, 37);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Connection type :");
		lblNewLabel.setBounds(154, 120, 97, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number of pages :");
		lblNewLabel_1.setBounds(154, 173, 97, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Year of Printing :");
		lblNewLabel_2.setBounds(154, 241, 109, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		String[] ar = {"soft", "hard"};
		JComboBox comboBox = new JComboBox(ar);
		comboBox.setBounds(289, 115, 141, 37);
		frame.getContentPane().add(comboBox);
		
		String[] agg = {"Serbian", "English","France","German","Russian"};
		JComboBox comboBox_1 = new JComboBox(agg);
		comboBox_1.setBounds(289, 322, 141, 37);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Language :");
		lblNewLabel_4.setBounds(154, 327, 76, 26);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBounds(196, 413, 134, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		
		String[] arr = {"true", "false"};
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String povez =String.valueOf(comboBox.getSelectedItem());
				String jezik =String.valueOf(comboBox_1.getSelectedItem());
				
				String brojstr =String.valueOf(textField_2.getText());
				String godina =String.valueOf(textField_3.getText());
				if(isNumeric(godina)==true)
				{
					if(isNumeric(brojstr)==true)
					{
						int temp = 0;
						switch(jezik)
						{
						case "Serbian": temp=1;break;
						case "English": temp=2;break;
						case "France": temp=3;break;
						case "German": temp=4;break;
						case "Russian": temp=5;break;
						}
					
						try {
							JOptionPane.showMessageDialog(null, "ADDED.", "Error", JOptionPane.WARNING_MESSAGE);
							metode.NoviPrimerak(Integer.valueOf(jo.oznaka), Integer.valueOf(brojstr), Boolean.valueOf(povez), Integer.valueOf(godina), temp, false);
							metode.upisiSVE();
							frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
						} catch (NumberFormatException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					else
					{
					
						JOptionPane.showMessageDialog(null, "Number of pages is not numeric.", "Error", JOptionPane.WARNING_MESSAGE);
					}
				}
				else
				{
				
					JOptionPane.showMessageDialog(null, "Year is not numeric.", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
	}

}
