package paket1;

public class Login {
public static boolean authenticate(String username, String password) {
		
		
		for(int i = 0 ;i< metode.aa.size();i++)
		{
			Administrator Z1 = metode.aa.get(i);
			print(Z1.Sifra);
			print(Z1.K_Ime);
			if (username.equals(Z1.K_Ime) && password.equals(Z1.Sifra)) {
				metode.templogin = Z1.oznaka;
				metode.pss();
	            return true;
	        }
			    
			
		}
		for(int i = 0 ;i< metode.bb.size();i++)
		{
			Bibliotekar Z1 = metode.bb.get(i);
			if (username.equals(Z1.K_Ime) && password.equals(Z1.Sifra)) {
				metode.templogin = Z1.oznaka;
				metode.pss();
	            return true;
	        }
			
		}	
			
			
        
        return false;
    }

private static void print(String sifra) {
	// TODO Auto-generated method stub
	
}
}
