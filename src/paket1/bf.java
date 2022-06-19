package paket1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class bf {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bf window = new bf();
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
	public bf() {
		initialize();
	}

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
	//	zivu, adresi, telefonu i radnom vremenu
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 498, 431);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(284, 39, 151, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(metode.bba.ime);
		textField_1 = new JTextField();
		textField_1.setBounds(284, 104, 151, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(284, 174, 151, 39);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(174, 257, 89, 39);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(301, 257, 134, 39);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_1.setText(metode.bba.adresa);
		textField_2.setText(metode.bba.broj);
		textField_3.setText(String.valueOf(metode.bba.o));
		textField_4.setText(String.valueOf(metode.bba.z));
		JLabel lblNewLabel = new JLabel("Work time from :");
		lblNewLabel.setBounds(88, 254, 86, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("to :");
		lblNewLabel_1.setBounds(279, 269, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setBounds(174, 45, 71, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Adress :");
		lblNewLabel_3.setBounds(174, 110, 86, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone Number :");
		lblNewLabel_4.setBounds(174, 186, 100, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String i = textField.getText();
					String i1 = textField_1.getText();
					String i2 = textField_2.getText();
					String i3 = textField_3.getText();
					String i4 = textField_4.getText();
;				if(i.length() > 3)
						{
							if(i1.length() > 3)
							{
								if(i2.length()>6)
								{
									if(isNumeric(i2)==true)
									{
										if(isNumeric(i3)==true & Integer.valueOf(i3)>0 & Integer.valueOf(i3)<24 )
										{
											if(isNumeric(i4)==true & Integer.valueOf(i4)>0 & Integer.valueOf(i4)<24 )
											{
												if(Integer.valueOf(i4)>Integer.valueOf(i3))
												{
													metode.bba.ime = i;
													metode.bba.adresa = i1;
													metode.bba.broj = i2;
													metode.bba.o = Integer.valueOf(i3);
													metode.bba.z = Integer.valueOf(i4);
													JOptionPane.showMessageDialog(null, "EDITED");
													try {
														metode.upisiSVE();
													} catch (IOException e1) {
														// TODO Auto-generated catch block
														e1.printStackTrace();
													}
													
												}
												else {
													JOptionPane.showMessageDialog(null, "hours are not overlaping");
												}
												
											}
											else {
												JOptionPane.showMessageDialog(null, "Close hour is no in good format.");
											}
											
											
										}
										else {
											JOptionPane.showMessageDialog(null, "Open hour is no in good format.");
										}
									}
									else {
										JOptionPane.showMessageDialog(null, "Number is not numeric.");
									}
								}
								else {
									JOptionPane.showMessageDialog(null, "Number is too short.");
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Adress is too short");
							}
								}
else {
	JOptionPane.showMessageDialog(null, "Name is too short");
}
			}
		});
		btnNewButton.setBounds(218, 337, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
