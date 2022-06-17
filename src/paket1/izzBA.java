package paket1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class izzBA {

	private JFrame frame;
	private static final long serialVersionUID = 1L;
	private JToolBar mainToolbar = new JToolBar();
	private JButton btnEdit = new JButton();
	private JButton btnDelete = new JButton();
	
	private DefaultTableModel tableModel;
	private JTable kompozicijeTabela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					izzBA window = new izzBA(jo);
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
	public izzBA(Iznajmljivanje temp) {
		initialize();
		this.jo =temp;
	}
protected static Iznajmljivanje jo;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ArrayList<Primerak> pp = new ArrayList<>();
		for(int i =0; i < metode.pp.size();i++)
		{
			if(metode.pp.get(i).obrisan != true)
			{
				
				
					pp.add(metode.pp.get(i));
				
			}
			
		}
		String[] zaglavlja = new String[] {"Book", "Connection type", "Year printed","Number of pages","Language of printing","rented","ID"};
		Object[][] sadrzaj = new Object[pp.size()][zaglavlja.length];
		
		
		for(int i=0; i<pp.size(); i++) {
			Primerak Clan1 = pp.get(i);
			
			
		
				sadrzaj[i][0] = Clan1.Knjiga.Naslov;
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
		
		tableModel = new DefaultTableModel(sadrzaj, zaglavlja);
		kompozicijeTabela = new JTable(tableModel);
		
		kompozicijeTabela.setRowSelectionAllowed(true);
		kompozicijeTabela.setColumnSelectionAllowed(false);
		kompozicijeTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		kompozicijeTabela.setDefaultEditor(Object.class, null);
		kompozicijeTabela.getTableHeader().setReorderingAllowed(false);
		
		//JScrollPane scrollPane = new JScrollPane(kompozicijeTabela);
		
	}

}
