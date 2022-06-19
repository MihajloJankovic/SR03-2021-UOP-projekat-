package paket1;


/**
 * 
 */
public class Biblioteka {

    /**
     * Default constructor
     */
    public Biblioteka(String ime,String adresa,String broj,int o,int z) {
    this.ime = ime;
    this.adresa= adresa;
    this.broj = broj;
    this.o=o;
    this.z=z;
    }

	
	protected int o;
	protected int z;
	protected String ime;
	protected String adresa;
	protected String broj;

}