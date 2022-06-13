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




public class Knjigeshow extends JFrame {

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
	private final JButton btnNewButton_2 = new JButton("Copies");
	
	public Knjigeshow() {
		
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
					String ID = (String) tableModel.getValueAt(red, 7);
					int iz = Integer.parseInt(ID);
					for(int i=0 ;i<metode.kk.size();i++)
					{
						Knjiga temp = metode.kk.get(i);
						if(temp.oznaka==iz)
						{
							temp.obrisan = true;
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int red = kompozicijeTabela.getSelectedRow();
				if(red == -1) {
					JOptionPane.showMessageDialog(null, "Chose a row in a table first.", "Error", JOptionPane.WARNING_MESSAGE);
				}else {
					String ID = tableModel.getValueAt(red, 7).toString();
					int iz = Integer.parseInt(ID);
					for(int i=0 ;i<metode.kk.size();i++)
					{
						Knjiga temp = metode.kk.get(i);
						if(temp.oznaka==iz)
						{
							kf df = new kf(temp);
						}
					}
	
					
					
				}
				
			}
		});
		
		mainToolbar.add(btnNewButton_1);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int red = kompozicijeTabela.getSelectedRow();
				if(red == -1) {
					JOptionPane.showMessageDialog(null, "Chose a row in a table first.", "Error", JOptionPane.WARNING_MESSAGE);
				}else {
					String ID = tableModel.getValueAt(red, 7).toString();
					int iz = Integer.parseInt(ID);
					for(int i=0 ;i<metode.kk.size();i++)
					{
						Knjiga temp = metode.kk.get(i);
						if(temp.oznaka==iz)
						{
							primercip df = new primercip(temp);
							df.setVisible(true);
						}
					}
	
					
					
				}
			}
		});
		
		mainToolbar.add(btnNewButton_2);
		ArrayList<Knjiga> kk = new ArrayList<>();
		for(int i = 0;i < metode.kk.size();i++)
		{
			Knjiga temp = metode.kk.get(i);
			if (temp.obrisan == false)
					{
						kk.add(temp);
					}
		}
	
		String[] zaglavlja = new String[] {"Name", "Original Name", "writer","Year of publication","Language","Description","Genre","ID","deleted"};
		Object[][] sadrzaj = new Object[kk.size()][zaglavlja.length];
		
		for(int i=0; i<kk.size(); i++) {
			Knjiga Clan1 = kk.get(i);
			sadrzaj[i][0] = Clan1.Naslov;
			sadrzaj[i][1] = Clan1.OriginalniNaslov;
			sadrzaj[i][2] = Clan1.ImePrezimePisca;
			
			sadrzaj[i][3] = String.valueOf(Clan1.GodinaObjavljivanja);
			
			sadrzaj[i][4] = String.valueOf(Clan1.JezikOriginala);
			sadrzaj[i][5] = String.valueOf(Clan1.OpisKnjige);
			sadrzaj[i][6] = String.valueOf(Clan1.Zanr.Zanr);
			sadrzaj[i][7] = String.valueOf(Clan1.oznaka);
			sadrzaj[i][8] = String.valueOf(Clan1.obrisan);
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
