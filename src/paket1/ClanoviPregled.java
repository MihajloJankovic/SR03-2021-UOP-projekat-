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




public class ClanoviPregled extends JDialog {

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
	
	public ClanoviPregled() {
		setModal(true);
		setTitle("Clanovi");
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
	
	
		String[] zaglavlja = new String[] {"Name", "Surname", "Adress","Gender","Card number","Number of paid months","date of last payment","Membership Type","Active","Deleted"};
		Object[][] sadrzaj = new Object[metode.cc.size()][zaglavlja.length];
		
		for(int i=0; i<metode.cc.size(); i++) {
			Clan Clan1 = metode.cc.get(i);
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
