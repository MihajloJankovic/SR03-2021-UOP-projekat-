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
    public Iznajmljivanje(int tip1,int zapo,Clan clan11,LocalDate Datumm,LocalDate dvracanja,boolean obrisan,int brojiz) {
    	this.tip = tip1;
    	this.zaposleni = zapo;
    	this.clan = clan11;
    	this.DatumIznamljivanja = Datumm;
    	this.DatumVracanja = dvracanja;
    	this.obrisaan = obrisan;
    	this.oznaka =brojiz;
    	
    	
    }
    public Iznajmljivanje()
    {
    	this.clan = null;
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
    protected boolean obrisaan;
    protected int oznaka;

    /**
     * 
     */
     ArrayList<Primerak> ppo = new ArrayList<>();

    /**
     * 
     */
 

 

}