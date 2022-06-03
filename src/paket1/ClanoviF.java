package paket1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JDialog;

public class ClanoviF extends JDialog {

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
					ClanoviF window = new ClanoviF(jo);
					window.frame.setVisible(true);
					window.setModal(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClanoviF(Clan pera) {
	 this.jo = pera;
		initialize();
	}
	
	static Clan jo;
	private JTextField textField_3;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().addComponentListener(new ComponentAdapter() {

		});
		frame.setBounds(100, 100, 675, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setBounds(86, 29, 135, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(251, 34, 211, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(251, 82, 211, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(251, 140, 211, 20);
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
		
		JLabel lblNewLabel_5 = new JLabel("Active :");
		lblNewLabel_5.setBounds(86, 298, 156, 31);
		frame.getContentPane().add(lblNewLabel_5);
		
		String[] ar = {"Male", "Female"};
		JComboBox comboBox = new JComboBox(ar);
		comboBox.setBounds(251, 196, 211, 22);
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
		comboBox_1.setBounds(251, 250, 211, 22);
		frame.getContentPane().add(comboBox_1);
		
		String[] ag = {"True", "False"};
		JComboBox comboBox_2 = new JComboBox(ag);
		comboBox_2.setBounds(251, 302, 211, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel_6 = new JLabel("Card number :");
		lblNewLabel_6.setBounds(86, 349, 135, 31);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(251, 354, 211, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.setEnabled(false);
		
	
		
	}
}
