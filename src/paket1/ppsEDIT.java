package paket1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ppsEDIT {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ppsEDIT window = new ppsEDIT(jo);
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
	public ppsEDIT(TipClanarine temp) {
		this.jo = temp;
		initialize();
	}
	protected static TipClanarine jo;

	/**
	 * Initialize the contents of the frame.
	 */
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setBounds(120, 36, 82, 55);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(238, 43, 143, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(238, 132, 143, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Price :");
		lblNewLabel_1.setBounds(120, 122, 82, 48);
		frame.getContentPane().add(lblNewLabel_1);
		textField.setText(jo.ime);
		textField_1.setText(String.valueOf(jo.cena));
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ime =  textField.getText();
				String cena = textField_1.getText();
				if(ime.length()>3)
				{
					if(isNumeric(cena)==true)
					{
						Double cena1 = Double.valueOf(textField_1.getText());
						jo.ime = ime;
						jo.cena = cena1;
						try {
							metode.upisiSVE();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "SAVED");
						
						
						frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Price is not number.");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Name too short");
				}
			}
		});
		btnNewButton.setBounds(150, 198, 113, 31);
		frame.getContentPane().add(btnNewButton);
	}
}
