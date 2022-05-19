package paket1;
import java.time.LocalDate;
/**
 * 
 */
public class Iznajmljivanje {

    /**
     * Default constructor
     */
    public Iznajmljivanje(int tip1,int zapo,Clan clan11,LocalDate Datumm,LocalDate dvracanja,int p1) {
    	this.tip = tip1;
    	this.zaposleni = zapo;
    	this.clan = clan11;
    	this.DatumIznamljivanja = Datumm;
    	this.DatumVracanja = dvracanja;
    	this.Primerak = p1;
    	
    	
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
    public int Primerak;

    /**
     * 
     */
 

 

}