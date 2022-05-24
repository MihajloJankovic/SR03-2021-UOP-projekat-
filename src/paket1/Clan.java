package paket1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    	this.TipClanarine = metode.tc.get(tipclanarine);
    	this.Pol = pol;
    	this.Aktivan = true;
    	this.DatumPoslednjeUplate = LocalDate.now();
    	this.BrojUplacenihMeseci = 0+brojuplacenihmeseci;
    	
    }
    public Clan(String ime,String prezime,String adresa,boolean pol,int tipclanarine,boolean aktive,String datum,int brojuplacenihmeseci,int brojckk,boolean obrisan) {
    	this.Ime = ime;
    	this.Prezime = prezime;
    	this.Adresa = adresa;
    	this.Pol = pol;
    	this.TipClanarine = metode.tc.get(tipclanarine);
    	this.Aktivan = aktive;
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	this.DatumPoslednjeUplate = LocalDate.parse(datum, formatter);
    	this.BrojUplacenihMeseci = 0+brojuplacenihmeseci;
    	this.BrojCK = brojckk;
    	this.Obrisan = obrisan;
    	
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