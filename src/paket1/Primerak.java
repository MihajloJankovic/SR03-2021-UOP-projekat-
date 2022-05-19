package paket1;

/**
 * 
 */
public class Primerak {

    /**
     * Default constructor
     */
    public Primerak(int knjiga,int brojstr,boolean tip,int godina,int jezik,boolean iznajmljena,int id) {
    	
    	this.Knjiga = metode.kk.get(knjiga-1);
    	this.BrojStrana = brojstr;
    	this.TipPoveza = tip;
    	this.GodinaStampanja = godina;
    	switch(jezik)
		{
		case 1:this.JezikStampanja = Jezik.ENGLESKI;break;
		case 2:this.JezikStampanja = Jezik.FRANCUSKI;break;
		case 3:this.JezikStampanja = Jezik.NEMACKI;break;
		case 4:this.JezikStampanja = Jezik.RUSKI;break;
		case 5:this.JezikStampanja = Jezik.SRPSKI;break;
		}
    	this.Iznajmljena = iznajmljena;
    	this.oznaka =id;
    	
    	
    }

    /**
     * 
     */
    protected Knjiga Knjiga;

    /**
     * 
     */
    protected int BrojStrana;

    /**
     * 
     */
    protected boolean TipPoveza;

    /**
     * 
     */
    protected int GodinaStampanja;

    /**
     * 
     */
    protected Jezik JezikStampanja;

    /**
     * 
     */
    protected boolean Iznajmljena;
    protected int oznaka;

    /**
     * 
     */

}