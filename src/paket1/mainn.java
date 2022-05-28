package paket1;

import java.io.IOException;

public class mainn {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		metode.CitajZanrove();
		metode.CitajTipoveC();
		metode.CitajClanove();
		metode.CitajKnjgie();
		metode.CitajPrimerke();
		metode.CitajZaposlene();
		metode.citajiznajmljivanje();
		//Citanej iz fajla i konstuisanje objekata.
		
		
		 metode.NoviZaposleni("mIKA","Antic","mAJKE JEVROSIME 2", false,50000,"JOVANA2","SifraSifra",0);
		 metode.NoviZaposleni("mIKA","Antic","mAJKE JEVROSIME 2", false,50000,"JOVANA2","SifraSifra",1);
		metode.NoviPrimerak(1, 100, false, 1990, 2, false);
		metode.NoviClan("pera","petrovic","Fruskogorska54",true,2,6);
		metode.NoviClan("pera","petrovic","Fruskogorska54",true,2,6); 
		metode.NovoIznajmljivanje(1, 61, 1, 77);
		
		//metode.noviTipClanarine("Vip clan premium", 500);
		//metode.noviZanr("komedija");
		// ove dve metode su samo pokazne...
		
		// tip onog koji je iznajmio admin/bib     ; jedinstveni id zaposlenog ; brojck osobe; jedinstveni id primerka;
		
		
		// ime prezime adresa pol:true musko false zensko 
		 //tip clanarine 1 penzziner 2 dete 3 osoba
		// broj meseci koje korisnik uplacuje u pocetku i ne moze biti manje od 1 .
		// upisivanje u fajl se desava kad je korsnik kreiran .
		
		metode.NovaKnjiga("Sabrana dela","Sabrana dela pere","Petar Petrovic",1990,1,"jamo davno malo dete je palo i otac je napiso knjigu.",1);
		metode.NoviPrimerak(1, 100, false, 1990, 2, false);
		

		metode.upisiSVE();
		
		
		
		
		
		
		
		// ispis listi u kojima se nalaze objekti to jest zaposleni knjige priemrci itd... 
		// u listu se upisuju i novo napravljeni objekti i objekti vec procitani iz fajla.
		// mere kontrole pristupa ce biti sprovedene kroz drugu kontrolnu tacku.
		System.out.println(metode.aa);
		System.out.println(metode.bb);
		System.out.println(metode.cc);
		System.out.println(metode.kk);
		System.out.println(metode.pp);
		System.out.println(metode.ii);
		
		
	}

}
