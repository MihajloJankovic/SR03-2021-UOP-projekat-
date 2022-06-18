package paket1;

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
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




public class iiz extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JToolBar mainToolbar = new JToolBar();
	private JButton btnEdit = new JButton();
	private JButton btnDelete = new JButton();
	
	private DefaultTableModel tableModel;
	private JTable kompozicijeTabela;
	private final JButton btnNewButton = new JButton("Delete");
	private final JButton btnNewButton_2 = new JButton("Edit");
	
	public iiz() {
		
		setTitle("Books");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		initGUI();
		initActions();
	}

	private void initGUI() {
		
		
		
		mainToolbar.add(btnEdit);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int red = kompozicijeTabela.getSelectedRow();
				if(red == -1) {
					JOptionPane.showMessageDialog(null, "Chose a row in a table first.", "Error", JOptionPane.WARNING_MESSAGE);
				}else {
					String ID = (String) tableModel.getValueAt(red, 3);
					int iz = Integer.parseInt(ID);
					for(int i=0 ;i<metode.ii.size();i++)
					{
						Iznajmljivanje temp = metode.ii.get(i);
						if(temp.oznaka==iz)
						{
							temp.obrisaan = true;
							try {
								metode.upisiSVE();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(null, "Book Deleted.");
						}
					}
	
					
					
				}
				
			}
		});
		
		mainToolbar.add(btnNewButton);
		mainToolbar.add(btnDelete);
		getContentPane().add(mainToolbar, BorderLayout.NORTH);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int red = kompozicijeTabela.getSelectedRow();
				if(red == -1) {
					JOptionPane.showMessageDialog(null, "Chose a row in a table first.", "Error", JOptionPane.WARNING_MESSAGE);
				}else {
					String ID = tableModel.getValueAt(red, 3).toString();
					int iz = Integer.parseInt(ID);
					for(int i=0 ;i<metode.ii.size();i++)
					{
						Iznajmljivanje temp = metode.ii.get(i);
						if(temp.oznaka==iz)
						{
							izzEDIT df = new izzEDIT(temp);
							
						}
					}
	
					
					
				}
			}
		});
		
		mainToolbar.add(btnNewButton_2);
		ArrayList<Iznajmljivanje> kk = new ArrayList<>();
		for(int i = 0;i < metode.ii.size();i++)
		{
			Iznajmljivanje temp = metode.ii.get(i);
			if (temp.obrisaan == false)
					{
						kk.add(temp);
					}
		}
	
		String[] zaglavlja = new String[] {"Employe", "Member", "Books","ID"};
		Object[][] sadrzaj = new Object[kk.size()][zaglavlja.length];
		
		for(int i=0; i<kk.size(); i++) {
			Iznajmljivanje Clan1 = kk.get(i);
			for(int i1 =0;i1< metode.aa.size();i1++)
			{
				if(metode.aa.get(i1).oznaka== Clan1.zaposleni)
				{
					sadrzaj[i1][0] = String.valueOf(metode.aa.get(i1).oznaka) ;
				}
			}
			for(int i1 =0;i1< metode.bb.size();i1++)
			{
				if(metode.bb.get(i1).oznaka== Clan1.zaposleni)
				{
					sadrzaj[i1][0] = String.valueOf(metode.bb.get(i1).oznaka) ;
				}
			}
			
			sadrzaj[i][1] =  String.valueOf(Clan1.clan.Ime);
			StringBuilder str = new StringBuilder("");
			for(int g = 0;g < Clan1.ppo.size();g++)
			{
				str.append(Clan1.ppo.get(g)+", ");
				 
			}
			sadrzaj[i][1] = str;
			sadrzaj[i][2] = String.valueOf(Clan1.ppo);
			sadrzaj[i][3] = String.valueOf(Clan1.oznaka);
		
		}
		
		tableModel = new DefaultTableModel(sadrzaj, zaglavlja);
		kompozicijeTabela = new JTable(tableModel);
		
		kompozicijeTabela.setRowSelectionAllowed(true);
		kompozicijeTabela.setColumnSelectionAllowed(false);
		kompozicijeTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		kompozicijeTabela.setDefaultEditor(Object.class, null);
		kompozicijeTabela.getTableHeader().setReorderingAllowed(false);
		
		JScrollPane scrollPane = new JScrollPane(kompozicijeTabela);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
	}
	
	private void initActions() {}
}
