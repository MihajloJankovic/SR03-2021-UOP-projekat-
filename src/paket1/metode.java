package paket1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class metode {
	static ArrayList<Administrator> aa = new ArrayList<>();
	static ArrayList<Bibliotekar> bb = new ArrayList<>();
	static ArrayList<Knjiga> kk = new ArrayList<>();
	static ArrayList<Clan> cc = new ArrayList<>();
	static ArrayList<Primerak> pp = new ArrayList<>();
	static void NoviClan(String ime,String prezime,String adresa,boolean pol,int tipclanarine,int brojuplacenihmeseci) throws IOException
	{
		Clan Clan1 = new Clan(ime, prezime, adresa, pol,tipclanarine, brojuplacenihmeseci);
		int brojck=0;
		int brojreda=1;
		int idzaposlenog=0,idknjige=0;
		  
		
		FileInputStream fstream = new FileInputStream("./src/paket1/Settings.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
			if(brojreda==1)
			{
				brojck=Integer.parseInt(strLine)+1;
			}
			if(brojreda==2)
			{
			  idzaposlenog=Integer.parseInt(strLine);
			}
			if(brojreda==3)
			{
			 idknjige=Integer.parseInt(strLine);
			}
		
		  brojreda=brojreda+1;
		 
		}
		Clan1.BrojCK=brojck;
		//Close the input stream
		fstream.close();
		
		BufferedWriter myWriter1= new BufferedWriter(new FileWriter("./src/paket1/Settings.txt"));
	    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
	    myWriter1.append(String.valueOf(brojck)+"\n");
	    myWriter1.append(String.valueOf(idzaposlenog)+"\n");
	    myWriter1.append(String.valueOf(idknjige)+"\n");
	    myWriter1.close();
	    System.out.println("uspesno promenjen settings");
	    
	    switch(tipclanarine)
		 {
		 case 1: Clan1.TipClanarine = TipClanarine.PENZIONER;break;
		 case 2: Clan1.TipClanarine = TipClanarine.DETE;break;
		 case 3: Clan1.TipClanarine = TipClanarine.OSOBA;break;

		 }
	    
		BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Clanovi.txt", true));
	    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
	    myWriter.append(Clan1.Ime+"|"+Clan1.Prezime+"|"+Clan1.Adresa+"|"+String.valueOf(Clan1.Pol)+"|"+String.valueOf(tipclanarine)+"|"+String.valueOf(Clan1.Aktivan)+"|"+String.valueOf(Clan1.DatumPoslednjeUplate)+"|"+String.valueOf(Clan1.BrojUplacenihMeseci)+"|"+String.valueOf(Clan1.BrojCK)+"|"+String.valueOf(Clan1.Obrisan)+"\n");
	    myWriter.close();
	    System.out.println("Successfully wrote to the file.");
		
	 
	 
	 
	 
	}
	
	
	
	
	
	
	
	static void CitajClanove() throws IOException
	{
		  BufferedReader br = new BufferedReader(new FileReader("./src/paket1/Clanovi.txt"));

		  // Declaring a string variable
		  String st;
		  // Condition holds true till
		  // there is character in a string
		  while ((st = br.readLine()) != null) {

		  
			  String [] red = st.split("\\|");
			  for(String redd: red) {
		            
		        }
			  
			  String ime = red[0];
			  String prezime =  red[1];
			  String adresa =  red[2];
			  boolean pol = Boolean.parseBoolean(red[3]); 
			  String tipc = red[4];
			  boolean aktivan =  Boolean.parseBoolean(red[5]); 
			  String DATUM=   red[6];
			  int brojum = Integer.parseInt(red[7]);
			  int brojck = Integer.parseInt(red[8]);
			  boolean obrisan =  Boolean.parseBoolean(red[9]); 
			  
			  cc.add(new Clan(ime, prezime, adresa, pol,tipc,aktivan,DATUM,brojum,brojck,obrisan));
			 
			  
		}
		  
			br.close();
	}

	
	static void NoviZaposleni(String ime,String prezime,String adresa,boolean pol,double plata,String Kime,String Sifra,int vrsta) throws IOException
	{
		if(vrsta == 0)
		{
			 Zaposleni Z1 = new Administrator(ime,prezime,adresa,pol,plata,Kime,Sifra);
			 BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Zaposleni.txt", true));
			    
			    myWriter.append(Z1.Ime+"|"+Z1.Prezime+"|"+Z1.Adresa+"|"+String.valueOf(Z1.Pol)+"|"+String.valueOf(Z1.plata)+"|"+Z1.K_Ime+"|"+Z1.Sifra+"|"+"0"+"\n");
			    myWriter.close();
			    System.out.println("Successfully wrote to the file.");
			    
			    
			    int brojck=0;
				int brojreda=1;
				int idzaposlenog=0,idknjige=0;
				  
			    
			    FileInputStream fstream = new FileInputStream("./src/paket1/Settings.txt");
				BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

				String strLine;

				//Read File Line By Line
				while ((strLine = br.readLine()) != null)   {
					if(brojreda==1)
					{
						brojck=Integer.parseInt(strLine);
					}
					if(brojreda==2)
					{
					  idzaposlenog=Integer.parseInt(strLine)+1;
					}
					if(brojreda==3)
					{
					 idknjige=Integer.parseInt(strLine);
					}
				
				  brojreda=brojreda+1;
				 
				}
				Z1.Id = idzaposlenog;
				//Close the input stream
				fstream.close();
				
				BufferedWriter myWriter1= new BufferedWriter(new FileWriter("./src/paket1/Settings.txt"));
			    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
			    myWriter1.append(String.valueOf(brojck)+"\n");
			    myWriter1.append(String.valueOf(idzaposlenog)+"\n");
			    myWriter1.append(String.valueOf(idknjige)+"\n");
			    myWriter1.close();
			    System.out.println("uspesno promenjen settings");


		}
		else
		{
			 Zaposleni Z1 = new Bibliotekar(ime,prezime,adresa,pol,plata,Kime,Sifra);
			 BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Zaposleni.txt", true));
			    
			    myWriter.append(Z1.Ime+"|"+Z1.Prezime+"|"+Z1.Adresa+"|"+String.valueOf(Z1.Pol)+"|"+String.valueOf(Z1.plata)+"|"+Z1.K_Ime+"|"+Z1.Sifra+"|"+"1"+"\n");
			    myWriter.close();
			    System.out.println("Successfully wrote to the file.");
			    
			    
			    int brojck=0;
				int brojreda=1;
				int idzaposlenog=0,idknjige=0;
				  
			    
			    FileInputStream fstream = new FileInputStream("./src/paket1/Settings.txt");
				BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

				String strLine;

				//Read File Line By Line
				while ((strLine = br.readLine()) != null)   {
					if(brojreda==1)
					{
						brojck=Integer.parseInt(strLine);
					}
					if(brojreda==2)
					{
					  idzaposlenog=Integer.parseInt(strLine)+1;
					}
					if(brojreda==3)
					{
					 idknjige=Integer.parseInt(strLine);
					}
				
				  brojreda=brojreda+1;
				 
				}
				Z1.Id = idzaposlenog;
				//Close the input stream
				fstream.close();
				
				BufferedWriter myWriter1= new BufferedWriter(new FileWriter("./src/paket1/Settings.txt"));
			    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
			    myWriter1.append(String.valueOf(brojck)+"\n");
			    myWriter1.append(String.valueOf(idzaposlenog)+"\n");
			    myWriter1.append(String.valueOf(idknjige)+"\n");
			    myWriter1.close();
			    System.out.println("uspesno promenjen settings");


		}
		 
		
	}
	
	static void CitajZaposlene() throws IOException
	{
		
		  BufferedReader br = new BufferedReader(new FileReader("./src/paket1/Zaposleni.txt"));

	  // Declaring a string variable
	  String st;
	  // Condition holds true till
	  // there is character in a string
	  while ((st = br.readLine()) != null) {

	  
		  String [] red = st.split("\\|");
		  for(String redd: red) {
	            
	        }
		  
		  String ime = red[0];
		  String prezime =  red[1];
		  String adresa =  red[2];
		  boolean pol = Boolean.parseBoolean(red[3]); 
		  double plata = Double.parseDouble(red[4]); 
		  String Kime =  red[5];
		  String Sifra=   red[6];
		  int vrsta = Integer.parseInt(red[7]);
		  if(vrsta==0)
		  {
			  aa.add(new Administrator(ime,prezime,adresa,pol,plata,Kime,Sifra));
		  }
		  if(vrsta==1)
		  {
			  bb.add(new Bibliotekar(ime,prezime,adresa,pol,plata,Kime,Sifra));
		  }
		 
		  
	}
	  
		br.close();
	}

	
	static void NovaKnjiga(String naslov,String orignaslov,String pisac,int godina,int jezik,String opisk,int zanr) throws IOException
	{
		
		
		
		
		
		
		
		
		
		  
	    int brojck=0;
		int brojreda=1;
		int idzaposlenog=0,idknjige=0;
		  
	    
	    FileInputStream fstream = new FileInputStream("./src/paket1/Settings.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
			if(brojreda==1)
			{
				brojck=Integer.parseInt(strLine);
			}
			if(brojreda==2)
			{
			  idzaposlenog=Integer.parseInt(strLine);
			}
			if(brojreda==3)
			{
			 idknjige=Integer.parseInt(strLine)+1;
			}
		
		  brojreda=brojreda+1;
		 
		}
		Knjiga k1 = new Knjiga(naslov,orignaslov,pisac,godina,jezik,opisk,zanr,idknjige);
		switch(jezik)
		{
		case 1:k1.JezikOriginala = Jezik.ENGLESKI;break;
		case 2:k1.JezikOriginala = Jezik.FRANCUSKI;break;
		case 3:k1.JezikOriginala = Jezik.NEMACKI;break;
		case 4:k1.JezikOriginala = Jezik.RUSKI;break;
		case 5:k1.JezikOriginala = Jezik.SRPSKI;break;
		}
		switch(zanr)
		{
		case 1:k1.Zanr = Zanr.FANTAZIJA;break;
		case 2:k1.Zanr = Zanr.KOMEDIJA;break;
		case 3:k1.Zanr = Zanr.KRIMI;break;
		case 4:k1.Zanr = Zanr.ROMANTIKA;break;
		case 5:k1.Zanr = Zanr.TRAGEDIJA;break;
		}
		
		//Close the input stream
		kk.add(new Knjiga(naslov,orignaslov,pisac,godina,jezik,opisk,zanr,idknjige));
		fstream.close();
		
		
		
		BufferedWriter myWriter1= new BufferedWriter(new FileWriter("./src/paket1/Settings.txt"));
	    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
	    myWriter1.append(String.valueOf(brojck)+"\n");
	    myWriter1.append(String.valueOf(idzaposlenog)+"\n");
	    myWriter1.append(String.valueOf(idknjige)+"\n");
	    myWriter1.close();
	    System.out.println("uspesno promenjen settings");

		
		
		
		
		
		
		
		
		
		BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Knjige.txt", true));
	    
	    myWriter.append(k1.Naslov+"|"+k1.OriginalniNaslov+"|"+k1.ImePrezimePisca+"|"+String.valueOf(k1.GodinaObjavljivanja)+"|"+String.valueOf(jezik)+"|"+k1.OpisKnjige+"|"+String.valueOf(zanr)+"|"+String.valueOf(k1.id)+"|"+"\n");
	    myWriter.close();
	    System.out.println("Successfully wrote to the file.");
	    
	  
	
	
	
	
	
	}
	static void CitajKnjgie() throws IOException
	{

		  BufferedReader br = new BufferedReader(new FileReader("./src/paket1/Knjige.txt"));

	  // Declaring a string variable
	  String st;
	  // Condition holds true till
	  // there is character in a string
	  while ((st = br.readLine()) != null) {

	  
		  String [] red = st.split("\\|");
		  for(String redd: red) {
	            
	        }
		  
		  String naslov = red[0];
		  String onaslov =  red[1];
		  String imepisca =  red[2];
		  int godina = Integer.parseInt(red[3]);
		  int jezik = Integer.parseInt(red[4]);
		  String opis =  red[5];
		  int zanr =  Integer.parseInt(red[6]);
		  int id = Integer.parseInt(red[7]);
		  
		  kk.add(new Knjiga(naslov,onaslov,imepisca,godina,jezik,opis,zanr,id));
		  
	}
	  
		br.close();
		
	}
	static void NoviPrimerak(int knjiga,int brojstr,boolean tip,int godina,int jezik,boolean iznajmljena) throws IOException
	{
		pp.add(new Primerak(knjiga,brojstr,tip,godina,jezik,iznajmljena));
		BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Primerci.txt", true));
	    
	    myWriter.append(String.valueOf(knjiga)+"|"+String.valueOf(brojstr)+"|"+String.valueOf(tip)+"|"+String.valueOf(godina)+"|"+String.valueOf(jezik)+"|"+String.valueOf(iznajmljena)+"\n");
	    myWriter.close();
	    System.out.println("Successfully wrote to the file. Primerci");
	    
	  
		
	}
	static void CitajPrimerke() throws IOException
	{
		 BufferedReader br = new BufferedReader(new FileReader("./src/paket1/Primerci.txt"));

		  // Declaring a string variable
		  String st;
		  // Condition holds true till
		  // there is character in a string
		  while ((st = br.readLine()) != null) {

		  
			  String [] red = st.split("\\|");
			  for(String redd: red) {
		            
		        }
			  
			  int knjiga = Integer.parseInt(red[0]);
			  int brojstr = Integer.parseInt(red[1]);
			  boolean tip = Boolean.parseBoolean(red[2]); 
			  int godina = Integer.parseInt(red[3]);
			  int jezik = Integer.parseInt(red[4]);
			  boolean iznajmljena = Boolean.parseBoolean(red[5]); 
			 
			 pp.add(new Primerak(knjiga,brojstr,tip,godina,jezik,iznajmljena));
			  
		}
		  
			br.close();
	}
}




