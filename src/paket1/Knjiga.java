package paket1;


/**
 * 
 */
public class Knjiga {


    /**
     * Default constructor
     */
    public Knjiga(String naslov,String orignaslov,String pisac,int godina,String opisk) {
    	this.Naslov = naslov;
    	this.OriginalniNaslov = orignaslov;
    	this.ImePrezimePisca = pisac;
    	this.GodinaObjavljivanja = godina;
    	this.OpisKnjige = opisk;
    	
    	
    	
    	
    }

    /**
     * 
     */
    protected String Naslov;

    /**
     * 
     */
    protected String OriginalniNaslov;

    /**
     * 
     */
    protected String ImePrezimePisca;

    /**
     * 
     */
    protected int GodinaObjavljivanja;

    /**
     * 
     */
    protected Jezik JezikOriginala;

    /**
     * 
     */

    protected String OpisKnjige;

    /**
     * 
     */
    protected Zanr Zanr;

    /**
     * 
     */
    protected int id;

}