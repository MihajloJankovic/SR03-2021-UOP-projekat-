
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

			public class zanradd extends JFrame {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				private JFrame frame;
				private JTextField textField;

				/**
				 * Launch the application.
				 */
				public static void main(String[] args) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								zanradd window = new zanradd();
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
				public zanradd() {

				
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
					
			
					
				
					JButton btnNewButton = new JButton("Save");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String ime = textField.getText();		
						
							
							if(ime.length()>3)
							{
										
		
								
									metode.zanr.add(new Zanr(ime));
									try {
										metode.upisiSVE();
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									JOptionPane.showMessageDialog(null, "Saved");
								
							
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

		
