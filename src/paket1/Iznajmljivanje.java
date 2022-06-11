package paket1;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 * 
 */
public class Iznajmljivanje {

    /**
     * Default constructor
     */
    public Iznajmljivanje(int tip1,int zapo,Clan clan11,LocalDate Datumm,LocalDate dvracanja) {
    	this.tip = tip1;
    	this.zaposleni = zapo;
    	this.clan = clan11;
    	this.DatumIznamljivanja = Datumm;
    	this.DatumVracanja = dvracanja;
    	
    	
    	
    }
  

    /**
     * 
     */
    protected int zaposleni;
    protected int tip;

    /**
     * 
     */
    protected Clan clan;

    /**
     * 
     */
    protected LocalDate DatumIznamljivanja;

    /**
     * 
     */
    protected LocalDate DatumVracanja;

    /**
     * 
     */
     ArrayList<Primerak> ppo = new ArrayList<>();

    /**
     * 
     */
 

 

}