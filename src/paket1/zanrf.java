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

public class zanrf extends JFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zanrf window = new zanrf(jo);
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
	public zanrf(Zanr jo) {

		this.jo = jo;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	protected static Zanr jo;
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
		frame.setTitle("Add book");
		frame.getContentPane().addComponentListener(new ComponentAdapter() {

		});
		frame.setBounds(100, 100, 675, 616);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setBounds(135, 81, 135, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(209, 81, 211, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		String[] ar = {"Male", "Female"};
		
		
		
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
		
	
		
		String temp3 = jo.Zanr;
		for(int i=0;i < metode.zanr.size();i++)
		{
			Zanr temp1 = metode.zanr.get(i);
			if(temp1.Zanr ==temp3)
			{
				textField.setText(temp3);
			}
		}
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ime1 = (textField.getText());
			
				
				if(ime1.length()>3)
				{
					for(int i=0;i < metode.zanr.size();i++)
					{
						Zanr temp1 = metode.zanr.get(i);
						if(temp1.Zanr ==temp3)
						{
							jo.Zanr = ime1;
							try {
								metode.upisiSVE();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(null, "Saved");
							
						}
					}
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Name too short");
				}
		
			
			}
		});
		btnNewButton.setBounds(240, 239, 123, 45);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
