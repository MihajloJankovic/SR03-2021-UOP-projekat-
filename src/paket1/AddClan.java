package paket1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddClan extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddClan window = new AddClan();
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
	public AddClan() {

		initialize();
	}
	
	static Clan jo;
	private JTextField textField_4;
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
		frame.getContentPane().addComponentListener(new ComponentAdapter() {

		});
		frame.setBounds(100, 100, 675, 616);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setBounds(86, 29, 135, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(251, 29, 211, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(251, 77, 211, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(251, 140, 211, 31);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Surname :");
		lblNewLabel_1.setBounds(86, 77, 135, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Adress :");
		lblNewLabel_2.setBounds(86, 135, 135, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sex :");
		lblNewLabel_3.setBounds(86, 192, 156, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Membership Type :");
		lblNewLabel_4.setBounds(86, 247, 156, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		String[] ar = {"Male", "Female"};
		JComboBox comboBox = new JComboBox(ar);
		comboBox.setBounds(251, 192, 211, 31);
		frame.getContentPane().add(comboBox);
		
		
		
		ArrayList<String> arr = new ArrayList<String>();
		for(int i = 0;i < metode.tc.size();i++)
		{
			arr.add(metode.tc.get(i).ime);
		}
		String arrr[] = new String[arr.size()];
		for(int i=0 ;i< arr.size();i++)
		{
			arrr[i]=arr.get(i);
		}
		
		JComboBox comboBox_1 = new JComboBox(arrr);
		comboBox_1.setBounds(251, 247, 211, 31);
		frame.getContentPane().add(comboBox_1);
		
		String[] ag = {"true", "false"};
		
		JLabel lblNewLabel_7 = new JLabel("Number of paid months :");
		lblNewLabel_7.setBounds(86, 309, 135, 31);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(251, 309, 211, 31);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ime1 = (textField.getText());
				String Prezime = (textField_1.getText());
				String Adresa = (textField_2.getText());
				
				String pol = (String.valueOf(comboBox.getSelectedItem()));
				String tipc = String.valueOf(comboBox_1.getSelectedItem());
				String bm = String.valueOf(textField_4.getText());
				boolean pol1;
				if(pol == "Male")
				{
					pol1 = true;
				}
				else
				{
					 pol1 = false;
				}		
				if(ime1.length()>3)
				{
					if(Prezime.length()>3)
					{
						if(Adresa.length()>3)
						{
							if(isNumeric(bm)==true)
							{
								
								
								int  d = Integer.valueOf(bm);
								TipClanarine pera = null;
								for(int i=0;i<metode.tc.size();i++)
								{	
									TipClanarine temp = metode.tc.get(i);
									if(tipc == temp.ime)
									{
										pera = temp;
									}
								}
								JOptionPane.showMessageDialog(null, "ADDED");
								try {
									metode.NoviClan(ime1, Prezime, Adresa, pol1,pera, d);
								} catch (IOException e2) {
									// TODO Auto-generated catch block
									e2.printStackTrace();
								}
								
								try {
									metode.upisiSVE();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Number of paid monts is no Ineger");
							}
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Adress too short");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Surname too short");
					}
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Name too short");
				}
		
			
			}
		});
		btnNewButton.setBounds(225, 402, 123, 45);
		frame.getContentPane().add(btnNewButton);
	}
}
