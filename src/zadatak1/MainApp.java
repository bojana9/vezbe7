package zadatak1;

public class MainApp {
	public static void main (String[] args) {
		
		//Inicijalizacija dva sesira sa slucajnim brojem zeceva
		System.out.println(new MagicniSesir("Crni kaubojski"));
		System.out.println(new MagicniSesir("Crni cilindar"));
		
		//Kreira se novi magicni sesir sombrero, kojem se prosledjuje naziv sombrero
		MagicniSesir sombrero = new MagicniSesir("Sombrero");
		//Na osnovu kreiranog objekta spoljasnje klase - sombrero, kreira se objekat unutrasnje klase - zeka
		MagicniSesir.Zec zeka = sombrero.new Zec();
		
		//Opis MagicnogSesira sombrero i Zeca zeka
		System.out.println(sombrero);
		System.out.println("Novi zec je " + zeka);

	}

}
