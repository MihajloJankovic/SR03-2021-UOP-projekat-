package paket1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		lblNewLabel.setBounds(191, 39, 113, 66);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cstomer :");
		lblNewLabel_1.setBounds(191, 177, 121, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(metode.cc.contains(jo.clan))
				{
					if(jo.ppo.size()>0)
					{
						
						
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
	}
}
