
public class Binaerzahl {
	String[] Binaerzahl = new String[maxStellen];
	int zaehler;
	int binaersumme;
	int zahl2;
	int maxStellen;
	int nulll = 0;
	int einss = 1;
	String nul = String.valueOf(nulll);
	String eins = String.valueOf(einss);

	public Binaerzahl(int zahl, int maxStellen) {

		while (zahl > 0) { // Umwandeln in Binärdarstellung
			if (zahl % 2 == 0) {
				Binaerzahl[zaehler] = nul;
			} else {
				Binaerzahl[zaehler] = eins;
			}
			zaehler++;
			zahl = zahl % 2;
		}
		if (Binaerzahl.length > maxStellen || Binaerzahl.length < 0) {
			throw new ArithmeticException("Binärzahl zu lang/darf nicht negativ sein");
		}

	}

	public Integer add(int Binaerzahl, int zahl2) {
		binaersumme = Binaerzahl + zahl2;
		if (binaersumme > maxStellen) {
			throw new ArithmeticException("Binärzahl zu lang");
			return binaersumme;
		}
	}
		
		public void zweierKomplement() {
			if ( )
		}

	}

}
