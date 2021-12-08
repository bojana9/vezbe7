package zadatak2;

import java.io.Serializable;
import java.util.Scanner;

public class Osoba implements Comparable<Osoba>, Serializable{
	private String ime,prezime;
	private static Scanner skener = new Scanner(System.in); //Za citanje linije sa konzole - korisnik unosi imena i prezimena
	private static final long serialVersionUID = 1L;
	
	public Osoba (String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	//poredjenje dve osobe po imenu. Ako je prezime isto dobije se rezultat 0 i ulazi se u if uslov gde se porede imena. Ako su imena ista
	//dobija se takodje rezultat 0. Metod ce vratiti rezultat 0, akko su imena i prezimena osoba ista
	@Override
	public int compareTo(Osoba o) {
		int rezultat = prezime.compareTo(o.prezime);
		if (rezultat == 0) {
			rezultat = ime.compareTo(o.ime);
		}
		return rezultat;
	}
	//Metod koji vraca true samo ako je rezultat poredjenja metoda iznad jednak nula
	public boolean equals (Object obj) { 
		return compareTo((Osoba) obj) == 0;
	}
	
	public String toString() {
		return ime + " " + prezime;
	}
	
	//Metod za ucitavanje imena i prezimena osobe sa konzole
	public static Osoba ucitajOsobu() {
		System.out.println("Unesi ime osobe: ");
		String ime = skener.next();
		System.out.println("Unesi prezime osobe:");
		String prezime = skener.next();
		return new Osoba(ime,prezime);
	}

}
