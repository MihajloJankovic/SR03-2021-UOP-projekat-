package paket1;


/**
 * 
 */
public class Zaposleni extends Osoba {

    /**
     * Default constructor
     */
    public Zaposleni(String ime,String prezime,String adresa,boolean pol,double plata,String Kime,String Sifra) {
    	this.Ime = ime;
    	this.Prezime=prezime;
    	this.Adresa= adresa;
    	this.Pol= pol;
    	this.plata= plata;
    	this.K_Ime= Kime;
    	this.Sifra = Sifra;
    	
    	
    }

    /**
     * 
     */
    protected double plata;

    /**
     * 
     */
    protected String K_Ime;

    /**
     * 
     */
    protected String Sifra;
    protected int id;

}
