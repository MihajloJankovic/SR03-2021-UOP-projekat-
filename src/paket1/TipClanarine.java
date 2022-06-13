package paket1;

public class TipClanarine {
	
	public TipClanarine(String ime,Double Cena,boolean obrisan) {
		this.ime = ime;
		this.cena = Cena;
		this.obrisan = obrisan;
		
	}
	public TipClanarine(String ime,Double Cena) {
		this.ime = ime;
		this.cena = Cena;
		this.obrisan = false;
		
	}
	
	protected String ime;
	protected double cena;
	protected boolean obrisan;
}
