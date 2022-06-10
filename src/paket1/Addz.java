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

public class Addz extends JFrame {

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
					Addz window = new Addz(broj);
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
	public Addz(int broj) {
		Addz.broj = broj;
		initialize();
	}
	static int broj;
	
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	/**
	 * Initialize the contents of the frame.
	 */
	public static boolean proveriime(String ime)
	{
		for(int i=0;i < metode.bb.size();i++)
		{
			Bibliotekar test = metode.bb.get(i);
			if(test.K_Ime==ime)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Double d = Double.valueOf(strNum);
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
		
		String[] ag = {"true", "false"};
		
		JLabel lblNewLabel_7 = new JLabel("Salary");
		lblNewLabel_7.setBounds(86, 249, 156, 31);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setBounds(251, 249, 211, 31);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ime1 = (textField.getText());
				String Prezime = (textField_1.getText());
				String Adresa = (textField_2.getText());
				String Kkime =(textField_3.getText());
				String sifra = (textField_5.getText());
				String pol =(String.valueOf(comboBox.getSelectedItem()));

				String bm = String.valueOf(textField_4.getText());
				boolean pol1 ;
				if(ime1.length()>3)
				{
					if(Prezime.length()>3)
					{
						if(Adresa.length()>3)
						{
							if(isNumeric(bm)==true)
							{	
								Double  d = Double.valueOf(bm);
								if(d > 100)
								{
									if(Kkime.length() >3)
									{
										if(proveriime(Kkime)==true)
										{
											if(sifra.length() > 3)
											{
												
												if(pol == "Male")
												{
													pol1 = true;
												}
												else
												{
													 pol1 = false;
												}
												if(broj ==1)
												{
													try {
														metode.NoviZaposleni(ime1, Prezime, Adresa, pol1, d, Kkime, sifra,0);
													} catch (IOException e1) {
														// TODO Auto-generated catch block
														e1.printStackTrace();
													}
												}
												else
												{
													try {
														metode.NoviZaposleni(ime1, Prezime, Adresa, pol1, d, Kkime, sifra,1);
													} catch (IOException e1) {
														// TODO Auto-generated catch block
														e1.printStackTrace();
													}
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
												JOptionPane.showMessageDialog(null, "Password too short");
											}
										}
								     	
										else
										{
											JOptionPane.showMessageDialog(null, "That UserName Allready Exists.");
										}
							
									}
									else
									{
										JOptionPane.showMessageDialog(null, "Username too short");
									}
								}
								else
								{
									JOptionPane.showMessageDialog(null, "Salary too small....");
								}
								
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Salary is no Number");
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
		btnNewButton.setBounds(237, 521, 123, 45);
		frame.getContentPane().add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(251, 302, 211, 31);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(251, 349, 211, 31);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("UserName :");
		lblNewLabel_4.setBounds(86, 302, 107, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password :");
		lblNewLabel_5.setBounds(86, 349, 107, 31);
		frame.getContentPane().add(lblNewLabel_5);
	
	}
}
