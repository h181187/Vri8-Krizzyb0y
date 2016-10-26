package no.hib.dat100.prosjekt.modell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Struktur for å lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * konstanter i klassen som angir antall kort i hver av de 4 fargene. Når
 * programmet er ferdig settes denne til 13, men under utvikling / testing kan
 * det være praktisk å ha denne mindre.
 * 
 */
public abstract class KortSamling {
	//test Hei

	public static final int MAKS_KORT_FARGE = 3;
	private final int MAKS_KORT = 4 * MAKS_KORT_FARGE;

	// tabell for representasjon av samling av kort
	private Kort[] samling;
	
	// index på forste ledige plass
	private int forsteledig;

	/**
	 * Oppretter en tom Kortsamling med plass til MAKS_KORT (hele kortstokken).
	 */
	public KortSamling() {
		samling = new Kort[MAKS_KORT];
		forsteledig = 0;
		//throw new RuntimeException("Metode KortSamling ikke implementert");
	}

	/**
	 * Sjekker om samlinga er tom.
	 * 
	 * @return true om samlinga er tom, false ellers.
	 */
	public boolean erTom() {
		return (forsteledig == 0);
		//throw new RuntimeException("Metode erTom ikke implementert");
	}

	/**
	 * Returnerer en tabell med kortene i samlinga. Tabellen trenger ikke være
	 * full. Kortene ligger sammenhengende fra starten av tabellen. Kan få
	 * tilgang til antallet ved Ã‚ bruke metoden getAntallKort(). Metoden er
	 * først og fremst ment å brukes i eventuelle subklasser. Om man trenger
	 * kortene utenfor arvehierarkiet, anbefales metoden toArrayList().
	 * 
	 * @return tabell av kort.
	 */
	public Kort[] getSamling() {
		return samling;
		//throw new RuntimeException("Metode getSamling ikke implementert");
	}

	/**
	 * Antall kort i samlingen.
	 * 
	 * @return antall kort i samlinga.
	 */
	public int getAntalKort() {
		return forsteledig;
		
		//throw new RuntimeException("Metode getAntalKort ikke implementert");
	}

	/**
	 * Legger alle korta (hele kortstokken) til i samlinga. Korta vil være sortert
	 * slik at de normalt må stokkes før bruk.
	 */
	public void leggTilAlle() {
		// Hint: Kortfarge.values() gir en tabell med alle kortfarger	
		for (int i = 0; i < Kortfarge.values().length; i++)	{
			for (int j = 0; j < MAKS_KORT_FARGE; j ++)	{
				samling[j] = new Kort(Kortfarge.values()[i],j);
			}
		}
		
//		throw new RuntimeException("Metode leggTilAlle ikke implementert");
	}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {
		Arrays.fill(samling, null);
		
		
//		throw new RuntimeException("Metode fjernAlle ikke implementert");
	}

	/**
	 * Legg et kort til samlinga.
	 * 
	 * @param kort
	 *            er kortet som skal leggast til.
	 */
	public void leggTil(Kort kort) {
		
		// TODO
		
		throw new RuntimeException("Metode leggTil ikke implementert");
	}

	/**
	 * Ser pÃ‚ siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet.
	 */
	public Kort seSiste() {
		
		// TODO
		
		throw new RuntimeException("Metode seSiste ikke implementert");
	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort taSiste() {
		
		// TODO
		
		throw new RuntimeException("Metode taSiste ikke implementert");
	}

	/**
	 * Undersøker om et kort finst i samlinga.
	 * 
	 * @param kort.
	 * 
	 * @return true om kortet finst i samlinga, false ellers.
	 */
	public boolean har(Kort kort) {
		
		// TODO
		
		throw new RuntimeException("Metode har ikke implementert");
	}

	/**
	 * Fjernar et kort frÃ‚ samlinga. Dersom kortet ikke finnest i samlinga,
	 * skjer ingenting.
	 * 
	 * @param kort
	 *            kortet som skal fjernast. Dersom kortet ikke finnes, skjer
	 *            ingenting.
	 */
	public void fjern(Kort kort) {
		// Hint: finn forst ut hvor kortet er i samlingen hvis det finnes 
		
		// TODO
		
		// Hint: fjern kortet - men husk kortet kan sitte pï¿½ en plass i midten
		
		// TODO
		
		throw new RuntimeException("Metode fjernKort ikke implementert");
	}

	/**
	 * Stokkar en kortsamling ved Ã¥ bytte rundt pÃ¥ kort 
	 */
	public void stokk() {
		// Hint: en mulighet er bruk av klassen Random for ï¿½ generere tilfeldige index
		
		// TODO
		
		throw new RuntimeException("Metode stokk ikke implementert");
	}

	/**
	 * Gir kortene som en ArrayList.
	 * 
	 * @return samlinga av kort som en ArrayList. Korta vil ha samme rekkefÂ¯lge
	 *         som i kortsamlinga.
	 */
	public ArrayList<Kort> toArrayList() {
		ArrayList<Kort> list = new ArrayList<Kort>();
		
		// Hint: legg hvert kort fra samling over i arraylisten list
		
		// TODO
		
		throw new RuntimeException("Metode ArrayList ikke implementert");
	}
}
