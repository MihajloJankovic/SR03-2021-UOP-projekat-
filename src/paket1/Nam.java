package paket1;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.io.Console;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;



public class Nam extends javax.swing.JFrame {

  
	private static final long serialVersionUID = 1L;

	/**
     * Creates new form NewJFrame
     */

    public Nam() {
		setResizable(false);
		setMinimumSize(new Dimension(1000, 500));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Users");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New User");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddClan gg = new AddClan();
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Show List");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClanoviPregled cpp = new ClanoviPregled();
				cpp.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Staff");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add Administrator");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addz cpp = new Addz(1);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Add Librarian");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addz cpp = new Addz(2);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Show Administrators");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				APREGLED cppp = new APREGLED();
				cppp.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Show Librarians");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BPREGLED cppp = new BPREGLED();
				cppp.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Books");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Add book");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Knjgan cppp = new Knjgan();
				
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Show books");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Knjigeshow cppp = new Knjigeshow();
				cppp.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_2 = new JMenu("Library");
		mnNewMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JMenu mnNewMenu_4 = new JMenu("Genre");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Add");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zanradd cppp = new zanradd();
				
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("show List");
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				Zanrp cppp1 = new Zanrp();
				cppp1.setVisible(true);
				
			}
			
			
			
			
			
		});
		mnNewMenu_4.add(mntmNewMenuItem_14);
		
		JMenu mnNewMenu_5 = new JMenu("Membership type");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("add");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ppsADD aoa = new ppsADD();
			//	aoa.setVisible(true);
				
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Show List");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pps gg = new pps();
				gg.setVisible(true);
			}
			
			
		});
		mnNewMenu_5.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_6 = new JMenu("Rents");
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("New");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izzNEW d = new izzNEW();
				
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Show List");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				iiz cppp1 = new iiz();
				cppp1.setVisible(true);
				
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_12);
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Edit Info");
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bf cppp1 = new bf();
				
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_13);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		
		JButton btnNewButton = new JButton("Register Admin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addz cpp = new Addz(1);
			
			}
		});
		JButton btnNewButton_1 = new JButton("Login");
		menuBar.hide();
		if(metode.aa.size()==0)
		{
			btnNewButton.show();
		}
		else
		{
			btnNewButton.hide();
		}
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginDialog loginDlg = new LoginDialog(null);
                loginDlg.setVisible(true);
                if(loginDlg.isSucceeded()){
                	btnNewButton_1.hide();
                	btnNewButton.hide();
                	 
                	for(int i = 0 ;i< metode.aa.size();i++)
            		{
            			Administrator Z1 = metode.aa.get(i);
            			
            			if (Z1.oznaka == metode.templogin) {
            				showAInter();
            				menuBar.show();  
            	        }
            			    
            			
            		}
            		for(int i = 0 ;i< metode.bb.size();i++)
            		{
            			Bibliotekar Z1 = metode.bb.get(i);
            			if (Z1.oznaka == metode.templogin) {
            				showBInter();
            	        }
            			
            		}
                	
                }
				
			}

			private void showBInter() {
				// TODO Auto-generated method stub
				
				
				
			}

			private void showAInter() {
				// TODO Auto-generated method stub
				
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 141, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 371, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -182, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -392, SpringLayout.EAST, getContentPane());
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		getContentPane().add(btnNewButton_1);
		
		
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 33, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -52, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnNewButton);
        initComponents();
    }

                       
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    	 mainn.main(args);;
    	
    	 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Nam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nam().setVisible(true);
                
                
                
            }
        });
        metode.upisiSVE();
    }
}

