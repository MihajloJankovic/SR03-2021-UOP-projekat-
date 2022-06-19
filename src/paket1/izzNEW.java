package paket1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class izzNEW {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					izzNEW window = new izzNEW();
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
	public izzNEW() {
		initialize();
		this.jo = new Iznajmljivanje();
	}
 protected static Iznajmljivanje jo;
 private JTextField textField;
 
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
	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 510, 377);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Chose");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izzshow df = new izzshow(jo);
			
			}
		});
		btnNewButton.setBounds(287, 61, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Chose");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izzCLAN d = new izzCLAN(jo);
			}
		});
		btnNewButton_1.setBounds(287, 183, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Books:");
		lblNewLabel.setBounds(136, 39, 113, 66);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(245, 116, 181, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cstomer :");
		lblNewLabel_1.setBounds(136, 177, 121, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(metode.cc.contains(jo.clan))
				{
					if(jo.ppo.size()>0)
					{
						if(isNumeric(textField.getText())==true)
						{
							int tip =0;
							int broj = Integer.parseInt(textField.getText());
							 for( int i=0; i < metode.aa.size();i++)
							  {
								  if(metode.aa.get(i).oznaka == metode.templogin )
								  {
									 tip=1;
								  }
								  
							  }
							 for( int i=0; i < metode.bb.size();i++)
							  {
								  if(metode.bb.get(i).oznaka == metode.templogin )
								  {
									 tip=0;
								  }
								  
							  }
							 for( int i=0; i < jo.ppo.size();i++)
							  {
								  jo.ppo.get(i).Iznajmljena = true;
								  
							  }
							 
							try {
								metode.NovoIznajmljivanje(tip,metode.templogin,jo.clan,jo.ppo,broj);
								metode.upisiSVE();
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
							JOptionPane.showMessageDialog(null, "Number of months is not numeric.");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Chose at least 1 book");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Chose Customer");
				}
				
				
				
				
			}
			
		});
		btnNewButton_2.setBounds(220, 270, 113, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		
		JLabel lblNewLabel_2 = new JLabel("Number of months for rent : ");
		lblNewLabel_2.setBounds(88, 121, 181, 24);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
