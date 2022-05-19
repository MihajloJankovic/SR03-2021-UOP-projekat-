package paket1;

/**
 * 
 */
public class Administrator extends Zaposleni {

    /**
     * Default constructor
     */
    public Administrator(String ime,String prezime,String adresa,boolean pol,double plata,String Kime,String Sifra) {
    	this.Ime = ime;
    	this.Prezime=prezime;
    	this.Adresa= adresa;
    	this.Pol= pol;
    	this.plata= plata;
    	this.K_Ime= Kime;
    	this.Sifra = Sifra;
    }

	public Administrator(String ime, String prezime, String adresa, boolean pol, double plata, String kime,
			String sifra, int id) {
		// TODO Auto-generated constructor stub
		this.Ime = ime;
    	this.Prezime=prezime;
    	this.Adresa= adresa;
    	this.Pol= pol;
    	this.plata= plata;
    	this.K_Ime= kime;
    	this.Sifra = sifra;
    	this.oznaka=id;
		
	}
	protected int oznaka;

}