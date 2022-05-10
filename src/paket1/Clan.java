package paket1;
import java.time.LocalDate;

/**
 * 
 */
public class Clan extends Osoba {

    /**
     * Default constructor
     */
    public Clan(String ime,String prezime,String adresa,boolean pol,int tipclanarine,int brojuplacenihmeseci) {
    	this.Ime = ime;
    	this.Prezime = prezime;
    	this.Adresa = adresa;
    	this.Pol = pol;
    	this.Aktivan = true;
    	this.DatumPoslednjeUplate = LocalDate.now();
    	this.BrojUplacenihMeseci = 0+brojuplacenihmeseci;
    	this.Obrisan = false;
    }

    /**
     * 
     */
    protected int BrojCK;

    /**
     * 
     */
    protected TipClanarine TipClanarine;

    /**
     * 
     */
    protected LocalDate DatumPoslednjeUplate;

    /**
     * 
     */
    protected int BrojUplacenihMeseci;

    /**
     * 
     */
    protected boolean Aktivan;
    protected boolean Obrisan;

}