package paket1;


/**
 * 
 */
public class Knjiga {


    /**
     * Default constructor
     */
    public Knjiga(String naslov,String orignaslov,String pisac,int godina,int jezik,String opisk,int zanrr,int id) {
    	this.Naslov = naslov;
    	this.OriginalniNaslov = orignaslov;
    	this.ImePrezimePisca = pisac;
    	this.GodinaObjavljivanja = godina;
    	this.OpisKnjige = opisk;
    	switch(jezik)
		{
		case 1:this.JezikOriginala = Jezik.ENGLESKI;break;
		case 2:this.JezikOriginala = Jezik.FRANCUSKI;break;
		case 3:this.JezikOriginala = Jezik.NEMACKI;break;
		case 4:this.JezikOriginala = Jezik.RUSKI;break;
		case 5:this.JezikOriginala = Jezik.SRPSKI;break;
		}
    	this.Zanr = metode.zanr.get(zanrr);
    	
    	
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