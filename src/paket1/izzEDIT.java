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

public class izzEDIT {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					izzEDIT window = new izzEDIT(jo);
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
	public izzEDIT(Iznajmljivanje temp) {
		initialize();
		this.jo = temp;
	}
 protected static Iznajmljivanje jo;
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
		frame.setBounds(100, 100, 475, 314);
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
			}
		});
		btnNewButton_1.setBounds(287, 143, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Books:");
		lblNewLabel.setBounds(138, 39, 113, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cstomer :");
		lblNewLabel_1.setBounds(138, 137, 121, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(metode.cc.contains(jo.clan))
				{
					if(jo.ppo.size()>0)
					{
						
						
							
							 for( int i=0; i < jo.ppo.size();i++)
							  {
								  jo.ppo.get(i).Iznajmljena = true;
								  
							  }
							 JOptionPane.showMessageDialog(null, "EDITED");
							try {
							
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
						JOptionPane.showMessageDialog(null, "Chose at least 1 book");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Chose Customer");
				}
				
			}
		});
		btnNewButton_2.setBounds(182, 241, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
