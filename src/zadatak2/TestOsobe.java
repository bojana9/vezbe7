package zadatak2;

import java.util.Scanner;

public class TestOsobe {
	public static void main(String[] args) {
		Scanner skener = new Scanner(System.in);
		ListaOsoba osobe = new ListaOsoba();
		Osoba osoba;

		// while (true) - uslov koji je uvek ispunjen
		while (true) {
			System.out.println("Unesite: \n" + "1 za unos nove osobe\n" 
					+ "2 za proveru da li se osoba prijavila\n"
					+ "3 za prikaz osoba u abacednom poretku\n"
					+ "9 za kraj programa (automatski se vrsi upis u datoteku)");
			int opcija = skener.nextInt();
			
			switch (opcija) {
			case 1:
				osobe.dodajOsobu(Osoba.ucitajOsobu());
				break;
			case 2:
				osoba = Osoba.ucitajOsobu();
				if (osobe.sadrzi(osoba) == false) {
					System.out.println("Osoba se nije prijavila na konkurs");
				}
				else
						System.out.println("Osoba se prijavila na konkurs");
					break;
			case 3:
				osobe.izlistajOsobe();
				break;
			case 9:
				osobe.sacuvaj();
				System.out.println("Kraj programa");
				return;
			default:
				System.out.println("Neispravan unos, pokusajte ponovo");
				break;
			}
		}

	}

}
