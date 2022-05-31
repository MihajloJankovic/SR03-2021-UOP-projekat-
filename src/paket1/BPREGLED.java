package paket1;

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
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




public class BPREGLED extends JDialog {

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
	
	public BPREGLED() {
		setModal(true);
		setTitle("Librarians");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		initGUI();
		initActions();
	}

	private void initGUI() {
		
		
		
		mainToolbar.add(btnEdit);
		
		mainToolbar.add(btnNewButton);
		mainToolbar.add(btnDelete);
		getContentPane().add(mainToolbar, BorderLayout.NORTH);
		
		mainToolbar.add(btnNewButton_1);
	
	
		String[] zaglavlja = new String[] {"Name", "Surname", "Adress","Gender","Login name","Password","income","ID"};
		Object[][] sadrzaj = new Object[metode.cc.size()][zaglavlja.length];
		
		for(int i=0; i<metode.bb.size(); i++) {
			Bibliotekar Clan1 = metode.bb.get(i);
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
			sadrzaj[i][4] = String.valueOf(Clan1.K_Ime);
			sadrzaj[i][5] = String.valueOf(Clan1.Sifra);
			sadrzaj[i][6] = String.valueOf(Clan1.plata);
			sadrzaj[i][7] = String.valueOf(Clan1.oznaka);
			
			
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
