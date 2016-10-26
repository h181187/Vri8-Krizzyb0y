package no.hib.dat100.prosjekt.modell;

/**
 * Klasse for � representere en bunke kort. Kan om n�dvendig inneholde hele
 * kortstokken. Man kan bare ta ut / trekke fra toppen av bunken.
 *
 */
public class Bunke extends KortSamling {
	/**
	 * Lager en tom bunke.
	 * 
	 */

	public Bunke() {
		super();
	}

	/**
	 * Fjerner kortet som ligger p� toppen av bunken.
	 * 
	 * @return Kortet p� toppen av bunken. Kortet blir fjernet fra bunken.
	 * 
	 */
	public Kort trekk() {
		// Hint: se p� metoder i superklassen
		
		// TODO
		
		
		
		throw new RuntimeException("Metode trekk ikke implementert");
	}

	/**
	 * "Ser" p� kortet som ligger p� toppen av bunken.
	 * 
	 * @return referanse til kortet p� toppen av bunken. Kortet blir ikke
	 *         fjernet.
	 * 
	 */
	public Kort topp() {
		
		// TODO
		
		throw new RuntimeException("Metode topp ikke implementert");
	}
}
