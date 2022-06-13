package paket1;

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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




public class pps extends JFrame {

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
	
	public pps() {
		
		setTitle("List");
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
					String ID = tableModel.getValueAt(red, 0).toString();
					
					for(int i=0 ;i<metode.tc.size();i++)
					{
						TipClanarine temp = metode.tc.get(i);
						if(temp.ime==ID)
						{
							temp.obrisan = true;
							JOptionPane.showMessageDialog(null, "DELETED");
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
					String ID = tableModel.getValueAt(red, 0).toString();
					
					for(int i=0 ;i<metode.tc.size();i++)
					{
						TipClanarine temp = metode.tc.get(i);
						if(temp.ime==ID)
						{
							ppsEDIT df = new ppsEDIT(temp);
							
						}
					}
	
					
					
				}
				
			}
		});
		
		mainToolbar.add(btnNewButton_1);
		ArrayList<TipClanarine> tc = new ArrayList<>();
		for(int i = 0;i < metode.tc.size();i++)
		{
			TipClanarine temp = metode.tc.get(i);
			if (temp.obrisan == false)
					{
						tc.add(temp);
					}
		}
	
		String[] zaglavlja = new String[] {"Name", "Cost"};
		Object[][] sadrzaj = new Object[tc.size()][zaglavlja.length];
		
		for(int i=0; i<tc.size(); i++) {
			TipClanarine Clan1 = tc.get(i);
			sadrzaj[i][0] = Clan1.ime;
			sadrzaj[i][1] = String.valueOf(Clan1.cena);
			
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
