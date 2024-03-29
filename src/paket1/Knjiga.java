package paket1;


/**
 * 
 */
public class Knjiga {


    /**
     * Default constructor
     */
    public Knjiga(String naslov,String orignaslov,String pisac,int godina,Jezik jezik,String opisk,Zanr zanrr,int id) {
    	this.Naslov = naslov;
    	this.OriginalniNaslov = orignaslov;
    	this.ImePrezimePisca = pisac;
    	this.GodinaObjavljivanja = godina;
    	this.OpisKnjige = opisk;
    	this.JezikOriginala = jezik;
    	this.Zanr = zanrr;
    	this.oznaka =id;
    	
    }
    public Knjiga(String naslov,String orignaslov,String pisac,int godina,int jezik,String opisk,int zanrr,int id,boolean ob) {
    	this.Naslov = naslov;
    	this.OriginalniNaslov = orignaslov;
    	this.ImePrezimePisca = pisac;
    	this.GodinaObjavljivanja = godina;
    	this.OpisKnjige = opisk;
    	switch(jezik)
		{
		case 1:this.JezikOriginala =Jezik.SRPSKI;break; 
		case 2:this.JezikOriginala = Jezik.ENGLESKI;break;
		case 3:this.JezikOriginala =Jezik.NEMACKI;break;
		case 4:this.JezikOriginala=  Jezik.FRANCUSKI;break;
		case 5:this.JezikOriginala = Jezik.RUSKI;break;
		
		}
    	this.Zanr = metode.zanr.get(zanrr);
    	this.oznaka =id;
    	this.obrisan = ob;
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
    protected int oznaka;
    protected boolean obrisan;

}