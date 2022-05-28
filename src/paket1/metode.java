package paket1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class metode {
	static ArrayList<Administrator> aa = new ArrayList<>();
	static ArrayList<Bibliotekar> bb = new ArrayList<>();
	static ArrayList<Knjiga> kk = new ArrayList<>();
	static ArrayList<Clan> cc = new ArrayList<>();
	static ArrayList<Primerak> pp = new ArrayList<>();
	static ArrayList<Iznajmljivanje> ii = new ArrayList<>();
	static ArrayList<Zanr> zanr = new ArrayList<>();
	static ArrayList<TipClanarine> tc = new ArrayList<>();
	static int templogin =0;
	static void pss()
	{
		System.out.println(templogin);
	}
	static void noviZanr(String ime)
	{
		zanr.add(new Zanr(ime));
	}
	static void noviTipClanarine(String ime,double cena)
	{
		tc.add(new TipClanarine(ime,cena));
	}
	static void CitajZanrove() throws IOException
	{
		  BufferedReader br = new BufferedReader(new FileReader("./src/paket1/Zanrovi.txt"));

		  // Declaring a string variable
		  String st;
		  // Condition holds true till
		  // there is character in a string
		  while ((st = br.readLine()) != null) {

		
			  zanr.add(new Zanr(st));
			 
			  
		}
		  
			br.close();
	}
	static void CitajTipoveC() throws IOException
	{
		  BufferedReader br = new BufferedReader(new FileReader("./src/paket1/TipoviClnarine.txt"));

		  // Declaring a string variable
		  String st;
		  // Condition holds true till
		  // there is character in a string
		  while ((st = br.readLine()) != null) {

			  String [] red = st.split("\\|");
			  tc.add(new TipClanarine(String.valueOf(red[0]),Double.valueOf(red[1])));
			 
			  
		}
		  
			br.close();
	}
	static void NoviClan(String ime,String prezime,String adresa,boolean pol,int tipclanarine,int brojuplacenihmeseci) throws IOException
	{
		Clan Clan1 = new Clan(ime, prezime, adresa, pol,tipclanarine, brojuplacenihmeseci);
		int brojck=0;
		int brojreda=1;
		int idzaposlenog=0,idknjige=0;
		int idprim=0;
		
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
			if(brojreda==4)
			{
			 idprim=Integer.parseInt(strLine)+1;
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
	    myWriter1.append(String.valueOf(idprim)+"\n");
	    myWriter1.close();
	    System.out.println("uspesno promenjen settings");
	    
	    
	    
		
		
	 
	 
	    cc.add(Clan1);
	 
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
			  int tipc = Integer.parseInt(red[4]);
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
			 Administrator Z1 = new Administrator(ime,prezime,adresa,pol,plata,Kime,Sifra);
			    int brojck=0;
				int brojreda=1;
				int idzaposlenog=0,idknjige=0;
				int idprim=0;
			    
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
					if(brojreda==4)
					{
					 idprim=Integer.parseInt(strLine)+1;
					}
				
				  brojreda=brojreda+1;
				 
				}
				Z1.oznaka = idzaposlenog;
				aa.add(Z1);
				//Close the input stream
				fstream.close();
				
				BufferedWriter myWriter1= new BufferedWriter(new FileWriter("./src/paket1/Settings.txt"));
			    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
			    myWriter1.append(String.valueOf(brojck)+"\n");
			    myWriter1.append(String.valueOf(idzaposlenog)+"\n");
			    myWriter1.append(String.valueOf(idknjige)+"\n");
			    myWriter1.append(String.valueOf(idprim)+"\n");
			    myWriter1.close();
			    System.out.println("uspesno promenjen settings");



		}
		else
		{
			 Bibliotekar Z1 = new Bibliotekar(ime,prezime,adresa,pol,plata,Kime,Sifra);

			    int brojck=0;
				int brojreda=1;
				int idzaposlenog=0,idknjige=0;
				  
			    int idprim=0;
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
					if(brojreda==4)
					{
					 idprim=Integer.parseInt(strLine)+1;
					}
				
				  brojreda=brojreda+1;
				 
				}
				Z1.oznaka = idzaposlenog;
				bb.add(Z1);
				//Close the input stream
				fstream.close();
				
				BufferedWriter myWriter1= new BufferedWriter(new FileWriter("./src/paket1/Settings.txt"));
			    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
			    myWriter1.append(String.valueOf(brojck)+"\n");
			    myWriter1.append(String.valueOf(idzaposlenog)+"\n");
			    myWriter1.append(String.valueOf(idknjige)+"\n");
			    myWriter1.append(String.valueOf(idprim)+"\n");
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
		  int Id = Integer.parseInt(red[8]);
		  if(vrsta==0)
		  {
			  aa.add(new Administrator(ime,prezime,adresa,pol,plata,Kime,Sifra,Id));
		  }
		  if(vrsta==1)
		  {
			  bb.add(new Bibliotekar(ime,prezime,adresa,pol,plata,Kime,Sifra,Id));
		  }
		 
		  
	}
	  
		br.close();
	}

	
	static void NovaKnjiga(String naslov,String orignaslov,String pisac,int godina,int jezik,String opisk,int zanrr) throws IOException
	{
		
		
		
		
		
		
		
		
		
		  
	    int brojck=0;
		int brojreda=1;
		int idzaposlenog=0,idknjige=0;
		int idprim=0; 
	    
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
			
			if(brojreda==4)
			{
			 idprim=Integer.parseInt(strLine)+1;
			}
		
		  brojreda=brojreda+1;
		 
		}
		
		//Close the input stream
		kk.add(new Knjiga(naslov,orignaslov,pisac,godina,jezik,opisk,zanrr,idknjige));
		fstream.close();
		
		
		
		BufferedWriter myWriter1= new BufferedWriter(new FileWriter("./src/paket1/Settings.txt"));
	    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
	    myWriter1.append(String.valueOf(brojck)+"\n");
	    myWriter1.append(String.valueOf(idzaposlenog)+"\n");
	    myWriter1.append(String.valueOf(idknjige)+"\n");
	    myWriter1.append(String.valueOf(idprim)+"\n");
	    myWriter1.close();
	    System.out.println("uspesno promenjen settings");

		
		
		
		
		
		
	
		
	  
	
	
	
	
	
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
		  int jezik=0;
		  String naslov = red[0];
		  String onaslov =  red[1];
		  String imepisca =  red[2];
		  int godina = Integer.parseInt(red[3]);
		  String jezik1 = red[4];
		  switch(jezik1)
			{
			case "ENGLESKI":jezik = 1;break;
			case "FRANCUSKI":jezik = 2;break;
			case "NEMACKI":jezik = 3;break;
			case "RUSKI":jezik = 4;break;
			case "SRPSKI":jezik = 5;break;
			}
		  String opis =  red[5];
		  int zanr =  Integer.parseInt(red[6]);
		  int id = Integer.parseInt(red[7]);
		  
		  kk.add(new Knjiga(naslov,onaslov,imepisca,godina,jezik,opis,zanr,id));
		  
	}
	  
		br.close();
		
	}
	static void NoviPrimerak(int knjiga,int brojstr,boolean tip,int godina,int jezik,boolean iznajmljena) throws IOException
	{
		 
	    FileInputStream fstream = new FileInputStream("./src/paket1/Settings.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		 int brojck=0;
			int brojreda=1;
			int idzaposlenog=0,idknjige=0;
			int idprim = 0;
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
			if(brojreda==4)
			{
			 idprim=Integer.parseInt(strLine)+1;
			}
		
		  brojreda=brojreda+1;
		 
		}
		
		
		//Close the input stream
		fstream.close();
		
		
		BufferedWriter myWriter1= new BufferedWriter(new FileWriter("./src/paket1/Settings.txt"));
	    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
	    myWriter1.append(String.valueOf(brojck)+"\n");
	    myWriter1.append(String.valueOf(idzaposlenog)+"\n");
	    myWriter1.append(String.valueOf(idknjige)+"\n");
	    myWriter1.append(String.valueOf(idprim)+"\n");
	    myWriter1.close();
	    System.out.println("uspesno promenjen settings");

		
		
		
		
		pp.add(new Primerak(knjiga,brojstr,tip,godina,jezik,iznajmljena,idprim));
		BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Primerci.txt", true));
	    
	
	    myWriter.append(String.valueOf(knjiga)+"|"+String.valueOf(brojstr)+"|"+String.valueOf(tip)+"|"+String.valueOf(godina)+"|"+String.valueOf(jezik)+"|"+String.valueOf(iznajmljena)+"|"+String.valueOf(idprim)+"\n");
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
			  int id = Integer.parseInt(red[6]);
			 
			 pp.add(new Primerak(knjiga,brojstr,tip,godina,jezik,iznajmljena,id));
			  
		}
		  
			br.close();
	}
	static void citajiznajmljivanje() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("./src/paket1/Iznaj.txt"));
			int iddd = 0;
		  // Declaring a string variable
		  String st;
		  // Condition holds true till
		  // there is character in a string
		  while ((st = br.readLine()) != null) {

		  
			  String [] red = st.split("\\|");
			  for(String redd: red) {
		            
		        }
			  int tip1 = Integer.parseInt(red[0]);
			  if(tip1==1)
			  {	
				  for( int i=0; i < aa.size();i++)
				  {
					  if(aa.get(i).oznaka == Integer.parseInt(red[1]) )
					  {
						 iddd =aa.get(i).oznaka ;
					  }
				  }
				  int zapo = iddd;
				  Clan clan11 = cc.get(Integer.parseInt(red[2])-1);
				  String datum = red[3];
				  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				  LocalDate Datumm = LocalDate.parse(datum, formatter);
				  String datum2 = red[4];
				  LocalDate dvracanja = LocalDate.parse(datum2, formatter);
				  int p1 = Integer.parseInt(red[5]);
				  ii.add(new Iznajmljivanje(tip1,zapo,clan11,Datumm,dvracanja,p1));
				  
			
				  
			  }
			  if(tip1==0)
			  {
				  for( int i=0; i < bb.size();i++)
				  {
					  if(bb.get(i).oznaka == Integer.parseInt(red[1]) )
					  {
						 iddd =aa.get(i).oznaka ;
					  }
				  }
				  int zapo =iddd; 
				  Clan clan11 = cc.get(Integer.parseInt(red[2])-1);
				  String datum = red[3];
				  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				  LocalDate Datumm = LocalDate.parse(datum, formatter);
				  String datum2 = red[4];
				  LocalDate dvracanja = LocalDate.parse(datum2, formatter);
				  int p1 = Integer.parseInt(red[5]);
				  ii.add(new Iznajmljivanje(tip1,zapo,clan11,Datumm,dvracanja,p1));
			  }
	  
		}
		  
			br.close();
		
		
	}
	
	static void NovoIznajmljivanje(int tip1,int zapo1,int clan1,int III)
	{	 
		int zapo2 =0;
		if(tip1==1)
		  {	
			  for( int i=0; i < aa.size();i++)
			  {
				  if(aa.get(i).oznaka == zapo1 )
				  {
					 zapo2 =aa.get(i).oznaka ;
				  }
				  
			  }
			  int zapo = zapo2;
			  Clan clan11 = cc.get(clan1-1);
		      LocalDate datumm = LocalDate.now();
			  LocalDate dvracanja = datumm.plusMonths(3);
			  int p1 = III;
			  ii.add(new Iznajmljivanje(tip1,zapo,clan11,datumm,dvracanja,p1));
			  

		  }
		  if(tip1==0)
		  {
			  for( int i=0; i < bb.size();i++)
			  {
				  if(bb.get(i).oznaka == zapo1  )
				  {
					  zapo2 =bb.get(i).oznaka ;
				  }
				  
			  }
			  int zapo = zapo2;
			  Clan clan11 = cc.get(clan1-1);
		      LocalDate datumm = LocalDate.now();
			  LocalDate dvracanja = datumm.plusMonths(3);
			  int p1 = III;
			  ii.add(new Iznajmljivanje(tip1,zapo,clan11,datumm,dvracanja,p1));
		  }

		 
		
	}
	static void upisiSVE() throws IOException
	{
		File file = new File("./src/paket1/Clanovi.txt");
		PrintWriter writer = new PrintWriter(file);
		writer.print("");
		writer.close();
		for(int i = 0 ;i< cc.size();i++)
		{
			Clan Clan1 = cc.get(i);
		    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
			int idzan1=0;
			
				for(int h = 0 ;h< tc.size();h++)
				{
					if(Clan1.TipClanarine.ime== tc.get(h).ime)
					{
						idzan1=h;break;
					}
				}
			BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Clanovi.txt", true));
		    myWriter.append(Clan1.Ime+"|"+Clan1.Prezime+"|"+Clan1.Adresa+"|"+String.valueOf(Clan1.Pol)+"|"+String.valueOf(idzan1)+"|"+String.valueOf(Clan1.Aktivan)+"|"+String.valueOf(Clan1.DatumPoslednjeUplate)+"|"+String.valueOf(Clan1.BrojUplacenihMeseci)+"|"+String.valueOf(Clan1.BrojCK)+"|"+String.valueOf(Clan1.Obrisan)+"\n");
		    myWriter.close();
		    System.out.println("Successfully wrote to the file.");
			
		}
		

		File file1 = new File("./src/paket1/Zaposleni.txt");
		PrintWriter writer1 = new PrintWriter(file1);
		writer1.print("");
		writer1.close();
		for(int i = 0 ;i< aa.size();i++)
		{
			Administrator Z1 = aa.get(i);
			 BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Zaposleni.txt", true));
			    
			    myWriter.append(Z1.Ime+"|"+Z1.Prezime+"|"+Z1.Adresa+"|"+String.valueOf(Z1.Pol)+"|"+String.valueOf(Z1.plata)+"|"+Z1.K_Ime+"|"+Z1.Sifra+"|"+"0"+"|"+Z1.oznaka+"\n");
			    myWriter.close();
			    System.out.println("Successfully wrote to the file.");
			    
			
		}
		for(int i = 0 ;i< bb.size();i++)
		{
			Bibliotekar Z1 = bb.get(i);
			 BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Zaposleni.txt", true));
			    
			    myWriter.append(Z1.Ime+"|"+Z1.Prezime+"|"+Z1.Adresa+"|"+String.valueOf(Z1.Pol)+"|"+String.valueOf(Z1.plata)+"|"+Z1.K_Ime+"|"+Z1.Sifra+"|"+"1"+"|"+Z1.oznaka+"\n");
			    myWriter.close();
			    System.out.println("Successfully wrote to the file.");
			    
			
		}	
		File file11 = new File("./src/paket1/Iznaj.txt");
		PrintWriter writer11 = new PrintWriter(file11);
		writer11.print("");
		writer11.close();
		for(int i = 0 ;i< ii.size();i++)
		{
			Iznajmljivanje i1 = ii.get(i);
			BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Iznaj.txt", true));
		    
			 myWriter.append(String.valueOf(i1.tip)+"|"+String.valueOf(i1.zaposleni)+"|"+String.valueOf(i1.clan.BrojCK)+"|"+String.valueOf(i1.DatumIznamljivanja)+"|"+String.valueOf(i1.DatumVracanja)+"|"+String.valueOf(i1.Primerak)+"\n");
			 myWriter.close();
			 System.out.println("Successfully wrote to the file.iznaj");
			
		}
		File file111 = new File("./src/paket1/Zanrovi.txt");
		PrintWriter writer111 = new PrintWriter(file111);
		writer111.print("");
		writer111.close();
		for(int i = 0 ;i< zanr.size();i++)
		{
			Zanr i1 = zanr.get(i);
			BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Zanrovi.txt", true));
		    
			 myWriter.append(i1.Zanr+"\n");
			 myWriter.close();
			 System.out.println("Successfully wrote to the file.iznaj");
			
		}
		File file2 = new File("./src/paket1/Knjige.txt");
		PrintWriter writer1111 = new PrintWriter(file2);
		writer1111.print("");
		writer1111.close();
		int idzan=0;
		for(int i = 0 ;i< zanr.size();i++)
		{
			Knjiga i1 = kk.get(i);
			for(int g = 0 ;g< zanr.size();g++)
			{
				if(zanr.get(g).Zanr==i1.Zanr.Zanr)
				{
					idzan=g;
				}
			}
			
			BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Knjige.txt", true));
		    
			myWriter.append(i1.Naslov+"|"+i1.OriginalniNaslov+"|"+i1.ImePrezimePisca+"|"+String.valueOf(i1.GodinaObjavljivanja)+"|"+String.valueOf(i1.JezikOriginala)+"|"+i1.OpisKnjige+"|"+String.valueOf(idzan)+"|"+String.valueOf(i1.id)+"|"+"\n");
			 myWriter.close();
			 System.out.println("Successfully wrote to the file.iznaj");
			
		}
		File file3 = new File("./src/paket1/TipoviClnarine.txt");
		PrintWriter writer11111 = new PrintWriter(file3);
		writer11111.print("");
		writer11111.close();
		for(int i = 0 ;i< tc.size();i++)
		{
			TipClanarine Z1 = tc.get(i);
			 BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/TipoviClnarine.txt", true));
			    
			    myWriter.append(Z1.ime+"|"+String.valueOf(Z1.cena)+"\n");
			    myWriter.close();
			    System.out.println("Successfully wrote to the file.");
			    
			
		}	
	
	 
		
		
		
	}
	
}




