package no.hib.dat100.prosjekt.modell;

/**
 * Klasse for å‚ representere en bunke kort. Kan om nødvendig inneholde hele
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
	 * Fjerner kortet som ligger på toppen av bunken.
	 * 
	 * @return Kortet på toppen av bunken. Kortet blir fjernet fra bunken.
	 * 
	 */
	public Kort trekk() {
		// Hint: se på metoder i superklassen
		
		// TODO
		
		
		
		throw new RuntimeException("Metode trekk ikke implementert");
	}

	/**
	 * "Ser" på‚ kortet som ligger på toppen av bunken.
	 * 
	 * @return referanse til kortet på toppen av bunken. Kortet blir ikke
	 *         fjernet.
	 * 
	 */
	public Kort topp() {
		
		// TODO
		
		throw new RuntimeException("Metode topp ikke implementert");
	}
}
