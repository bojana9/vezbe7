package primer;

public class Spoljasnja {

	public void stampajVrednost() {

		int deljenik = 20;

		class Unutrasnja {
			private int delilac;

			public Unutrasnja() {
				delilac = 4;
			}

			public int getSuma() {
				System.out.println("Unutar unutrasnje klase:");
				return deljenik / delilac;
			}
		}
		Unutrasnja unutrasnja = new Unutrasnja();
		System.out.println("Rezultat deljenja je " + unutrasnja.getSuma());
	}

}
