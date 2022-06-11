package paket1;

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
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




public class primercip extends JFrame {

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
	private final JButton btnNewButton_1 = new JButton("Edit");
	
	public primercip(Knjiga temp) {
		this.jo = temp;
		
		setTitle("Adminstrators");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		initGUI();
		initActions();
	}
	protected Knjiga jo;
	private final JButton btnNewButton_2 = new JButton("Add");
	private void initGUI() {
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				noviP df = new noviP();
			}
		});
		
		mainToolbar.add(btnNewButton_2);
		
		
		
		mainToolbar.add(btnEdit);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int red = kompozicijeTabela.getSelectedRow();
				if(red == -1) {
					JOptionPane.showMessageDialog(null, "Chose a row in a table first.", "Error", JOptionPane.WARNING_MESSAGE);
				}else {
					String ID = tableModel.getValueAt(red, 7).toString();
					int iz = Integer.parseInt(ID);
					for(int i=0 ;i<metode.aa.size();i++)
					{
						Administrator temp = metode.aa.get(i);
						if(temp.oznaka==iz)
						{
							temp.obrisan = true;
							JOptionPane.showMessageDialog(null, "User Deleted.");
						}
					}
	
					
					
				}
				
			}
		});
		
		mainToolbar.add(btnNewButton);
		mainToolbar.add(btnDelete);
		getContentPane().add(mainToolbar, BorderLayout.NORTH);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int red = kompozicijeTabela.getSelectedRow();
				if(red == -1) {
					JOptionPane.showMessageDialog(null, "Chose a row in a table first.", "Error", JOptionPane.WARNING_MESSAGE);
				}else {
					String ID = tableModel.getValueAt(red, 7).toString();
					int iz = Integer.parseInt(ID);
					for(int i=0 ;i<metode.aa.size();i++)
					{
						Administrator temp = metode.aa.get(i);
						if(temp.oznaka==iz)
						{
							ZaposleniF df = new ZaposleniF(temp);
						}
					}
	
					
					
				}
			}
		});
		
		mainToolbar.add(btnNewButton_1);
	
	
		String[] zaglavlja = new String[] {"Book", "Connection type", "Year printed","Number of pages","Language of printing","rented","ID"};
		Object[][] sadrzaj = new Object[metode.cc.size()][zaglavlja.length];
		
		for(int i=0; i<metode.pp.size(); i++) {
			Primerak Clan1 = metode.pp.get(i);
			if(Clan1.Knjiga == jo)
			{
				
				sadrzaj[i][0] = Clan1.Knjiga;
				if(Clan1.TipPoveza == true)
				{
					sadrzaj[i][1] = "hard";
				}
				if(Clan1.TipPoveza == false)
				{
					sadrzaj[i][1] = "soft";
				}
			
				sadrzaj[i][2] = String.valueOf(Clan1.GodinaStampanja);
				
				sadrzaj[i][3] = String.valueOf(Clan1.BrojStrana);
				sadrzaj[i][4] = String.valueOf(Clan1.JezikStampanja);
				sadrzaj[i][5] = String.valueOf(Clan1.Iznajmljena);
				sadrzaj[i][6] = String.valueOf(Clan1.oznaka);
				
			}
			
			
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
