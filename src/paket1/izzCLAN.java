package paket1;

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class izzCLAN extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JToolBar mainToolbar = new JToolBar();
	private JButton btnEdit = new JButton();
	private JButton btnDelete = new JButton();
	
	private DefaultTableModel tableModel;
	private JTable ttt;
	private final JButton btnNewButton = new JButton("Delete");
	
	public izzCLAN(Iznajmljivanje temp) {
		
		this.jo = temp;
		setTitle("Clanovi");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		initGUI();
		initActions();
	}
	protected Iznajmljivanje jo;
	private void initGUI() {
		
		mainToolbar.add(btnEdit);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int red = ttt.getSelectedRow();
				if(red == -1) {
					JOptionPane.showMessageDialog(null, "Chose a row in a table first.", "Error", JOptionPane.WARNING_MESSAGE);
				}else {
					int ID = Integer.valueOf((String) tableModel.getValueAt(red, 4));
					
					for(int i =0;i < metode.cc.size();i++)
					{
						Clan pera = metode.cc.get(i);
						if(pera.BrojCK == ID)
						{
							jo.clan = pera;
							
							try {
								metode.upisiSVE();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(null, "User Selected.");
						}
					}
	
					
					
				}
			}
		});
		
		mainToolbar.add(btnNewButton);
		mainToolbar.add(btnDelete);
		getContentPane().add(mainToolbar, BorderLayout.NORTH);
	
	
		ArrayList<Clan> kk = new ArrayList<>();
		for(int i = 0;i < metode.cc.size();i++)
		{
			Clan temp = metode.cc.get(i);
			if (temp.Obrisan == false)
					{
						kk.add(temp);
					}
		}
		String[] zaglavlja = new String[] {"Name", "Surname", "Adress","Gender","Card number","Number of paid months","date of last payment","Membership Type","Active","Deleted"};
		Object[][] sadrzaj = new Object[kk.size()][zaglavlja.length];
		
		for(int i=0; i<kk.size(); i++) {
			Clan Clan1 = kk.get(i);
			sadrzaj[i][0] = Clan1.Ime;
			sadrzaj[i][1] = Clan1.Prezime;
			sadrzaj[i][2] = Clan1.Adresa;
			if(Clan1.Pol == true)
			{
				sadrzaj[i][3] = "Male";
			}
			else
			{
				sadrzaj[i][3] = "Female";
			}
			sadrzaj[i][4] = String.valueOf(Clan1.BrojCK);
			sadrzaj[i][5] = String.valueOf(Clan1.BrojUplacenihMeseci);
			sadrzaj[i][6] = String.valueOf(Clan1.DatumPoslednjeUplate);
			sadrzaj[i][7] = Clan1.TipClanarine.ime;
			sadrzaj[i][8] = Clan1.Aktivan;
			sadrzaj[i][9] = Clan1.Obrisan;
			
		}
		
		tableModel = new DefaultTableModel(sadrzaj, zaglavlja);
		ttt = new JTable(tableModel);
		
		ttt.setRowSelectionAllowed(true);
		ttt.setColumnSelectionAllowed(false);
		ttt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ttt.setDefaultEditor(Object.class, null);
		ttt.getTableHeader().setReorderingAllowed(false);
		
		JScrollPane scrollPane = new JScrollPane(ttt);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		
		
		
	}
	
	private void initActions() {
		
	}
}
