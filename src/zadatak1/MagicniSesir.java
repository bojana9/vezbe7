package zadatak1;

import java.util.Random;

public class MagicniSesir {
	private String nazivSesira;
	private Zec[] zecevi;
	
	//Maksimalan broj dozvoljenih zeceva - pisemo 4 jer pri inicijalizaciji niza krecemo od jedinice
	private static int maxZeceva = 5;
	
	//Dozvoljena imena zeceva
	private static String [] imenaZeceva = { "Lupko", "Traputalo", "Sarenko", "Garavko", "Dugousko"};
	
	//Kreiranje instance objekta random, kako bi se generisao slucajan broj zeceva 
	static Random izbor = new Random();
	
	public MagicniSesir (String nazivSesira) {
		this.nazivSesira = nazivSesira;
		
		//Inicijalizuje se niz zeceva sa brojem elemenata u intervalu od 1 do maxZeceva - na osnovu Random klase generise se slucajan broj do maxZeceva
		zecevi = new Zec [1 + izbor.nextInt(maxZeceva)];

		//Kreiraju se instance Zeca i ubacuju se u niz
		for (int i = 0; i < zecevi.length; i++) {
			zecevi[i] = new Zec();
		}
		
	}
	
	//Niz broj imena zeceva se pravi radi nabrajanja dodeljivanja rednog broja zecu u nizu, kada se budu nabrajala imena
	static private int[] brojImenaZeceva = new int[imenaZeceva.length];
	
	public String toString() {
		//Prva linija na konzoli ispisuje naziv sesira
		String sesirString = "Sesir " + nazivSesira + " sadrzi zeceve: \n";
		//Naredne linije koda ispisuju nazive zeceva iz niza zecevi - koristeci String reprezentaciju za zeca
		for (int i = 0; i < zecevi.length; i++)
			sesirString += "\t" + zecevi[i] + " ";
		return sesirString;
	}
	
	class Zec{
		private String imeZeca;
		
		public Zec() {
			
			//Slucajan odabir imena na osnovu indeksa u nizu imenaZeceva. Bira se slucajan indeks
			int indeks = izbor.nextInt(imenaZeceva.length);
			
			//Ime zeca je sada ime iz niza na izabranom indeksu, a nakon toga dodaje se koji put se kreira zec sa datim imenom - npr Lupko1, Lupko2..
			imeZeca = imenaZeceva[indeks] + (++brojImenaZeceva[indeks]);
		}
		
		public String toString() {
			return imeZeca;
			// return imeZeca + " sesir: " + nazivSesira;
		}
		
	}

}
