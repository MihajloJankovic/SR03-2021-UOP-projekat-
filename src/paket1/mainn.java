package paket1;

import java.io.IOException;

public class mainn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		metode.NoviClan("pera","petrovic","Fruskogorska54",true,2,6); 
		// ime prezime adresa pol:true musko false zensko 
		 //tip clanarine 1 penzziner 2 dete 3 osoba
		// broj meseci koje korisnik uplacuje u pocetku i ne moze biti manje od 1 .
		// upisivanje u fajl se desava kad je korsnik kreiran .
		metode.CitajClanove();
	
		metode.NoviZaposleni("mIKA","Antic","mAJKE JEVROSIME 2", false,50000,"JOVANA2","SifraSifra",1);
		metode.CitajZaposlene();
		metode.NovaKnjiga("Sabrana dela","Sabrana dela pere","Petar Petrovic",1990,1,"jamo davno malo dete je palo i otac je napiso knjigu.",1);
		System.out.println(metode.aa);
		System.out.println(metode.bb);
		System.out.println(metode.cc);
	}

}
