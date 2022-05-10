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
	static ArrayList<Zaposleni> zz = new ArrayList<>();
	static ArrayList<Knjiga> kk = new ArrayList<>();
	static ArrayList<Clan> cc = new ArrayList<>();
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

	     
		
			  System.out.println(st);
		  
	}
		br.close();
	}

	
	static void NoviZaposleni(String ime,String prezime,String adresa,boolean pol,double plata,String Kime,String Sifra) throws IOException
	{
		Zaposleni Z1 = new Zaposleni(ime,prezime,adresa,pol,plata,Kime,Sifra);
		
		
		BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Zaposleni.txt", true));
	    
	    myWriter.append(Z1.Ime+"|"+Z1.Prezime+"|"+Z1.Adresa+"|"+String.valueOf(Z1.Pol)+"|"+String.valueOf(Z1.plata)+"|"+Z1.K_Ime+"|"+Z1.Sifra+"\n");
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
		  zz.add(new Zaposleni(ime,prezime,adresa,pol,plata,Kime,Sifra));
		 
		  
	}
	  
		br.close();
	}

	
	static void NovaKnjiga(String naslov,String orignaslov,String pisac,int godina,int jezik,String opisk,int zanr) throws IOException
	{
		
		
		Knjiga k1 = new Knjiga(naslov,orignaslov,pisac,godina,opisk);
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
		k1.id = idknjige;
		//Close the input stream
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
}




