package paket1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class metode {
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
	    
		BufferedWriter myWriter= new BufferedWriter(new FileWriter("./src/paket1/Clanovi.txt", true));
	    //FileWriter myWriter = new FileWriter("./src/paket1/Clanovi.txt");
	    myWriter.append(Clan1.Ime+"|"+Clan1.Prezime+"|"+Clan1.Adresa+"|"+String.valueOf(Clan1.Pol)+"|"+String.valueOf(Clan1.TipClanarine)+"|"+String.valueOf(Clan1.Aktivan)+"|"+String.valueOf(Clan1.DatumPoslednjeUplate)+"|"+String.valueOf(Clan1.BrojUplacenihMeseci)+"|"+String.valueOf(Clan1.BrojCK)+"\n");
	    myWriter.close();
	    System.out.println("Successfully wrote to the file.");
		
	 
	 switch(tipclanarine)
	 {
	 case 1: Clan1.TipClanarine = TipClanarine.PENZIONER;break;
	 case 2: Clan1.TipClanarine = TipClanarine.DETE;break;
	 case 3: Clan1.TipClanarine = TipClanarine.OSOBA;break;

	 }
	 
	 
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

}




