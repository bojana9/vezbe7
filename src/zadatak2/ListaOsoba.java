package zadatak2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class ListaOsoba implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private ArrayList<Osoba> osobe = new ArrayList<Osoba>();
	private File datoteka = new File("C:\\temp\\ListaOsoba.bin"); //Kreiranje novog fajla za zapis ulaznog toka 
	

	public ListaOsoba () {
		//provera da li datoteka postoji
		if (datoteka.exists()) {
		
				try {
					ObjectInputStream ulazniTok = new ObjectInputStream(new FileInputStream(datoteka));
					osobe = (ArrayList<Osoba>) ulazniTok.readObject(); //ucitava objekat iz ulaznog toka u ArrayListu - pravi jednu instancu osobe i ubacuje je u ArrayList-u
					ulazniTok.close();
				} catch (IOException | ClassNotFoundException e) {
					//IOEXception se koristi za Input/Output Stream izuzetke. Izazvana je neuspelim ili prekinutim I/O operacijama
					//ClassNotFoundException za izuzetke kada aplikacija pokusa da ucita klasu preko njenog String-a, ali se ne pronalazi definicija za 
					//klasu sa navedenim imenom
					e.printStackTrace();
					//stampa gresku u standardnom formatu
					System.exit(1);
					//Prekida trenutno pokrenutu JVM. Agument 1 sluzi kao statusni kod; po konvenciji, statusni kod razlicit od nule
					//ukazuje na nenormalan zavrsetak
				}			
		}
	}
	
	public void sacuvaj() {
		System.out.println("Cuvanje liste osoba: ");
		try {
			ObjectOutputStream izlazniTok = new ObjectOutputStream(new FileOutputStream(datoteka));
			//kreiranje izlaznog toka
			izlazniTok.writeObject(osobe);
			//Upis objekata u datoteku vrsi se pozivom metoda writeObject() nad objektom koji predstavlja izlazni tok - to je datoteka u ovom slucaju
			System.out.println("Kraj");
			izlazniTok.close();
		}
		catch (IOException e) {
		e.printStackTrace();	
		System.exit(1);
		}
		
	}
	
	public void izlistajOsobe() {
		//Sortiranje osoba na osnovu imena i prezimena tj na osnovu compareTo metoda iz klase Osoba
		Collections.sort(osobe);
		for (Osoba o : osobe) {
			System.out.println(o);
		}
	}
	
	public void dodajOsobu(Osoba o) {
		osobe.add(o);
	}
	
	public Osoba vratiOsobu(int i) {
		return osobe.get(i);
	}
	
	public boolean sadrzi(Osoba o) {
		return osobe.contains(o);
	}

}
