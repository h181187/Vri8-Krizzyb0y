package no.hib.dat100.prosjekt.kontroll;

import java.util.ArrayList;

import no.hib.dat100.prosjekt.modell.Bunke;
import no.hib.dat100.prosjekt.modell.Kort;

/**
 * Klassen har objektvariaber som er referanser til de spillerne, nord og syd
 * (type ISpiller). Den har også en bunke man deler/trekker fra og en bunke man
 * spiller til.
 * 
 */
public class Spill {

	// objektvariable for et spill
	
	// de to spillere
	private ISpiller nord;
	private ISpiller syd;
	
	// de to bunker 
	private Bunke bunkeFra;
	private Bunke bunkeTil;

	/**
	 * Gir referanse/peker til syd.
	 * 
	 * @return referanse/peker til syd.
	 */
	public ISpiller getSyd() {

		return syd;
		
//		throw new RuntimeException("Metode getSyd ikke implementert");
	}

	/**
	 * Gir referanse/peker til nord.
	 * 
	 * @return referanse/peker til nord.
	 */
	public ISpiller getNord() {
		
		return nord;
		
//		throw new RuntimeException("Metode getNord ikke implementert");
	}

	/**
	 * Gir peker/referanse til til-bunken.
	 * 
	 * @return referanse/peker til til-bunken.
	 */
	public Bunke getBunkeTil() {
		
		return bunkeTil;
		
//		throw new RuntimeException("Metode getBunkeTil ikke implementert");
	}

	public Bunke getBunkeFra() {
		
		return bunkeFra;
		
//		throw new RuntimeException("Metode getBunkeFra ikke implementert");
	}

	/**
	 * Metoden oppretter to spillere, nord og syd. Det opprettes to bunker, fra
	 * og til. Alle kortene legges til fra. Bunken fra stokkes. Deretter deles
	 * det ut kort fra fra-bunken til nord og syd i henhold til regler. Til
	 * slutt tas øverste kortet fra fra-bunken og legges til til-bunken.
	 * 
	 * Nord har type RandomSpiller (som er forhåndefinert). Syd vil til slutt være spiller
	 * av en klasse laget av gruppen i oppgave 3.
	 */
	public void start() {
		
		// Hint: vurder om andre private metoder i klassen kan brukes her
        // i tilegg til metoder på bunker
		nord = new RandomSpiller(Spillere.NORD);
		syd = new RandomSpiller(Spillere.SYD);
		
		bunkeFra = new Bunke();
		bunkeTil = new Bunke();
		
		bunkeFra.leggTilAlle();
		bunkeFra.stokk();
		delutKort();
		vendOverste();
		
		
		/*nord.hvem();
		syd.hvem();*/
//		throw new RuntimeException("Metode start ikke implementert");
	}

	/**
	 * Deler ut kort til nord og syd.
	 * 
	 */
	private void delutKort() {

		// Husk: Klassen Regler angir hvor mange kort hver spiller skal ha
		
		for (int i = 0; i < Regler.antallKortVedStart(); i++){
			nord.getHand().leggTil(bunkeFra.taSiste());
			syd.getHand().leggTil(bunkeFra.taSiste());
		}
		
//		throw new RuntimeException("Metode delutKort ikke implementert");
	}

	/**
	 * Tar Øverste kortet fra fra-bunken og legger dettte til til-bunken (med
	 * billedsiden opp, men det trenger ikke gruppen tenke på).
	 */
	private void vendOverste() {
		
		bunkeTil.leggTil(bunkeFra.taSiste());
		
//		throw new RuntimeException("Metode vendOverste ikke implementert");
	}

	/**
	 * Når fra-bunken blir tom, tar man vare på kortet på toppen av til-bunken.
	 * Deretter legges alle den andre kortene i til-bunken over i fra-bunken.
	 * Denne stokkes og kortet som man har tatt vare på legges tilbake i
	 * til-bunken. Det vil når vÃŠre det eneste kortet i til-bunken.
	 */
	public void snuTilBunken() {

		Kort siste = bunkeTil.taSiste();
		while (!bunkeTil.erTom())	{
			bunkeFra.leggTil(bunkeTil.trekk());
		}
		bunkeTil.leggTil(siste);
		bunkeFra.stokk();
//		throw new RuntimeException("Metode snuTilBunken ikke implementert");
	}

	/**
	 * Trekker et kort fra fra-bunken til spilleren gitt som parameter. Om
	 * fra-bunken er tom, må man "snu" til-bunken. Se info om metoden
	 * snuTilBunken().
	 * 
	 * @param spiller
	 *            spilleren som trekker.
	 * 
	 * @return kortet som trekkes.
	 */
	public Kort trekkFraBunke(ISpiller spiller) {
		if (!bunkeFra.erTom()){
			Kort trekk = bunkeFra.taSiste();
			spiller.trekker(trekk);
			return trekk;
			
		}	else	{
			snuTilBunken();
			Kort trekk = bunkeFra.trekk();
			spiller.trekker(trekk);
			return trekk;
			
		}
		
				
//		throw new RuntimeException("Metode trekkFraBunke ikke implementert");
	}

	/**
	 * Sjekker om til-bunken er tom.
	 * 
	 * @return true om til-bunken er tom, false ellers.
	 */
	public boolean bunketilTom() {
		
		return bunkeTil.erTom();
		
//		throw new RuntimeException("Metode bunkeTilTom ikke implementert");
	}

	/**
	 * Sjekker om fra-bunken er tom.
	 * 
	 * @return true om fra-bunken er tom, false ellers.
	 */
	public boolean bunkefraTom() {
		
		return bunkeFra.erTom();
		
//		throw new RuntimeException("Metode bunkefraTom ikke implementert");
	}

	/**
	 * Gir antall kort nord har på hånden.
	 * 
	 * @return antall kort nord har på hånden.
	 */
	public int antallNord() {
		
		return nord.getAntallKort();
		
//		throw new RuntimeException("Metode antallNord ikke implementert");
	}

	/**
	 * Gir antall kort i fra-bunken.
	 * 
	 * @return antall kort i fra-bunken.
	 */
	public int antallBunkeFra() {
		
		return bunkeFra.getAntalKort();
		
//		throw new RuntimeException("Metode antallBunkeFra ikke implementert");
	}

	/**
	 * Gir antall kort i til-bunken.
	 * 
	 * @return antall kort i til-bunken.
	 */
	public int antallBunkeTil() {
		
		return bunkeTil.getAntalKort();
		
//		throw new RuntimeException("Metode antallBunkeTil ikke implementert");
	}

	/**
	 * Metode som leser øverste kortet i til-bunken. Kortet vil fremdeles være
	 * Øverst i til-bunken etter at metoden er utført.
	 * 
	 * @return øverste kortet i til-bunken.
	 */
	public Kort seOverste() {
		
		return bunkeTil.seSiste();
		
//		throw new RuntimeException("Metode seOverste ikke implementert");
	}

	/**
	 * Gir syds hand som en ArrayList av Kort.
	 * 
	 * @return syds hand som en ArrayList av Kort.
	 */
	public ArrayList<Kort> getSydHand() {
		
		ArrayList<Kort> sydhand = syd.getHand().toArrayList();
		return sydhand;
		
//		throw new RuntimeException("Metode getSydHand ikke implementert");
	}

	/**
	 * Bestemmer neste handling for en spiller (spilt et kort, trekker et kort, forbi)
	 * 
	 * @param spiller
	 *            spiller som handle.
	 * 
	 * @return handlingen som skal utføres av spillet.
	 */
	public Handling nesteHandling(ISpiller spiller) {
		
		return spiller.nesteHandling(bunkeTil.topp());
		
		// Hint: bruk nesteHandling metoden på en spiller
		
//		throw new RuntimeException("Metode nesteHandling ikke implementert");
	}

	/**
	 * Metoden spiller et kort. Den sjekker at spiller har kortet. Dersom det er
	 * tilfelle, fjernes kortet fra spilleren og legges til til-bunken. Metoden
	 * nullstiller også antall ganger spilleren har trukket kort.
	 * 
	 * @param spiller
	 *            den som spiller.
	 * @param kort
	 *            kort som spilles.
	 * 
	 * @return true dersom spilleren har kortet, false ellers.
	 */
	public boolean leggnedKort(ISpiller spiller, Kort kort) {
		
		if ((spiller.getHand().har(kort)))	{
			spiller.fjernKort(kort);
			bunkeTil.leggTil(kort);
			return true;
		}
		return false;
		
		
//		throw new RuntimeException("Metode leggnedKort ikke implementert");
	}

	/**
	 * Metode for å si forbi. Må nullstille antall ganger spilleren har trukket
	 * kort.
	 * 
	 * @param spiller
	 *            spilleren som er i tur.
	 */
	public void forbiSpiller(ISpiller spiller) {
		
		spiller.setAntallTrekk(0);
		
//		throw new RuntimeException("Metode forbiSpiller ikke implementert");
	}

	/**
	 * Metode for å utføre en handling (trekke, spille, forbi). Dersom hanling
	 * er kort, blir kortet også spilt.
	 * 
	 * @param spiller
	 *            spiller som utfører handlingen.
	 * @param handling
	 *            handling som utføres.
	 * 
	 * @return kort som trekkes, kort som spilles eller null ved forbi.
	 */
	public Kort utforHandling(ISpiller spiller, Handling handling) {

		Kort kort = null;
		
	if (handling.getType().equals(HandlingsType.LEGGNED) && Regler.kanLeggeNed(handling.getKort(), bunkeTil.topp()))	{
			kort = handling.getKort();
			bunkeTil.leggTil(kort);
			spiller.getHand().fjern(kort);
			return kort;
			
		} else if (handling.getType().equals(HandlingsType.TREKK) && spiller.getAntallTrekk() != Regler.maksTrekk())	{
			if (bunkeFra.erTom())	{
				snuTilBunken();
				kort = bunkeFra.trekk();
				spiller.trekker(kort);
				return kort;
			} else { 
				kort = bunkeFra.trekk();
				spiller.trekker(kort);
				return kort;
			}
			
		} else	{
			forbiSpiller(spiller);
			return kort;
			
		}
		
		// Hint: del opp i de tre mulige handlinger og vurder 
		// om noen andre private metoder i klassen kan brukes
		// til å implementere denne metoden
		
//		throw new RuntimeException("Metode utforHandling ikke implementert");
	}

	/**
	 * Spiller et kort fra syd.
	 * 
	 * @param kort
	 *            kort som spilles.
	 * 
	 * @return true dersom kortet er lovlig å spille, false ellers.
	 */
	public boolean nedkortSyd(Kort kort) {
		
		if (Regler.kanLeggeNed(kort, bunkeTil.seSiste())) {
			syd.getHand().fjern(kort);
			bunkeTil.leggTil(kort);
			return true;
		}
		return false;
//		throw new RuntimeException("Metode nedkortSyd ikke implementert");
	}

	/**
	 * Foreslår hva syd skal spille.
	 * 
	 * @return kort som blir foreslått.
	 */
	public Kort foreslaaKortSyd() {
		
		Handling handling = syd.nesteHandling(bunkeTil.seSiste());
		return handling.getKort();
		// Hint: bruk nesteHandling metoden for en spiller
		
//		throw new RuntimeException("Metode foreslqqKortSyd ikke implementert");
	}
}