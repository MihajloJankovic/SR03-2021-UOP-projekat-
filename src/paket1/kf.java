package paket1;

import java.awt.EventQueue;
import java.awt.TextArea;

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
import javax.swing.JTextArea;

public class kf extends JFrame {

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
					kf window = new kf(jo);
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
	public kf(Knjiga pera) {
	 this.jo = pera;
		initialize();
	}
	
	static Knjiga jo;
	private JTextField textField_4;
	private JTextField textField_5;
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
		textField_2.setBounds(251, 135, 211, 31);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Original Name  :");
		lblNewLabel_1.setBounds(86, 77, 135, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Writer :");
		lblNewLabel_2.setBounds(86, 135, 135, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Year of publication :");
		lblNewLabel_3.setBounds(86, 192, 156, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Language  :");
		lblNewLabel_4.setBounds(86, 247, 156, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Genre :");
		lblNewLabel_5.setBounds(86, 298, 156, 31);
		frame.getContentPane().add(lblNewLabel_5);
		
		String[] ar = {"Male", "Female"};
		
		textField.setText(jo.Naslov);
		textField_1.setText(jo.OriginalniNaslov);
		textField_2.setText(jo.ImePrezimePisca);
		
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
		
	
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setBounds(251, 192, 211, 31);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		
		textField_4.setText(String.valueOf(jo.GodinaObjavljivanja));
		
		textField_5 = new JTextField();
		textField_5.setBounds(251, 351, 211, 31);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		textField_5.setEnabled(false);
		textField_5.setText(String.valueOf(jo.oznaka));
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(251, 410, 211, 76);
		frame.getContentPane().add(textArea);
		textArea.setText(jo.OpisKnjige);
		JLabel lblNewLabel_6 = new JLabel("Description :");
		lblNewLabel_6.setBounds(86, 404, 111, 36);
		frame.getContentPane().add(lblNewLabel_6);
		
		String[] agg = {"Serbian", "English","France","German","Russian"};
		

		ArrayList<String> arr1 = new ArrayList<String>();
		for(int i = 0;i < metode.zanr.size();i++)
		{
			arr1.add(metode.zanr.get(i).Zanr);
		}
		String arrr1[] = new String[arr1.size()];
		for(int i=0 ;i< arr1.size();i++)
		{
			arrr1[i]=arr1.get(i);
		}
		JComboBox comboBox_3_1 = new JComboBox(arrr1);
		comboBox_3_1.setBounds(251, 298, 211, 31);
		frame.getContentPane().add(comboBox_3_1);
		comboBox_3_1.setSelectedItem(jo.Zanr.Zanr);
		
		JComboBox comboBox_3 = new JComboBox(agg);
		comboBox_3.setBounds(251, 247, 211, 31);
		frame.getContentPane().add(comboBox_3);
		String odabir = "";
		
		if(jo.JezikOriginala.name() =="SRPSKI")
		{
			odabir = "Serbian";
		}
		if(jo.JezikOriginala.name() =="ENGLESKI")
		{
			odabir = "English";
		}
		if(jo.JezikOriginala.name() =="NEMACKI")
		{
			odabir = "German";
		}
		if(jo.JezikOriginala.name() =="FRANCUSKI")
		{
			
			odabir = "France";
		}
		if(jo.JezikOriginala.name() =="RUSKI")
		{
			odabir = "Russian";
		}
		
		comboBox_3.setSelectedItem(odabir);
		JLabel lblNewLabel_8 = new JLabel("ID :");
		lblNewLabel_8.setBounds(86, 351, 123, 31);
		frame.getContentPane().add(lblNewLabel_8);
		
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ime1 = (textField.getText());
				String ime2 = (textField_1.getText());
				String imepisca = (textField_2.getText());
				String opis = String.valueOf(textArea.getText());
				Jezik temp = null;
				String temp3 = String.valueOf(comboBox_3_1.getSelectedItem());
				Zanr fin = null ;
				
				String Jez =(String.valueOf(comboBox_3.getSelectedItem()));
				switch(Jez)
				{
				case "Serbian": temp = Jezik.SRPSKI;break;
				case "English":temp = Jezik.ENGLESKI;break;
				case "German":temp = Jezik.NEMACKI;break;
				case "France":temp = Jezik.FRANCUSKI;break;
				case "Russian":temp = Jezik.RUSKI;break;
				}
				String bm = String.valueOf(textField_4.getText());
				for(int i=0;i < metode.zanr.size();i++)
				{
					Zanr temp1 = metode.zanr.get(i);
					if(temp1.Zanr ==temp3)
					{
						fin = temp1;
					}
				}
				if(ime1.length()>3)
				{
					if(ime2.length()>3)
					{
						if(imepisca.length()>3)
						{
							if(isNumeric(bm)==true)
							{
								int  d = Integer.valueOf(bm);
								if( d <= 2022)
								{
									if(opis.length() > 5)
									{
										jo.Naslov = ime1;
										jo.OriginalniNaslov = ime2;
										jo.ImePrezimePisca =imepisca;
										jo.JezikOriginala = temp;
										jo.Zanr =fin;
										jo.OpisKnjige =opis;
									
										jo.GodinaObjavljivanja = d;
										try {
											metode.upisiSVE();
										} catch (IOException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									}
									else
									{
										JOptionPane.showMessageDialog(null, "Discription too short");
									}
								}
								
								else
								{
									JOptionPane.showMessageDialog(null, "Year is in the future");
								}
								
								
								
								
								
								
								
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Year is not number");
							}
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Writer Name too short");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Origin Name  too short");
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
		
		
	}
}
