package paket1;


/**
 * 
 */
public class Bibliotekar extends Zaposleni {

    /**
     * Default constructor
     */
    public Bibliotekar(String ime,String prezime,String adresa,boolean pol,double plata,String Kime,String Sifra) {
    	this.Ime = ime;
    	this.Prezime=prezime;
    	this.Adresa= adresa;
    	this.Pol= pol;
    	this.plata= plata;
    	this.K_Ime= Kime;
    	this.Sifra = Sifra;
    	this.obrisan = false;
    }

	public Bibliotekar(String ime, String prezime, String adresa, boolean pol, double plata, String kime, String sifra,
			int id,boolean obrisan) {
		// TODO Auto-generated constructor stub
		this.Ime = ime;
    	this.Prezime=prezime;
    	this.Adresa= adresa;
    	this.Pol= pol;
    	this.plata= plata;
    	this.K_Ime= kime;
    	this.Sifra = sifra;
    	this.oznaka=id;
    	this.obrisan = obrisan;
	}
	protected int oznaka;
	protected boolean obrisan;

}