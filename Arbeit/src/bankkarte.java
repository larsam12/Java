import javax.swing.JOptionPane;

public class bankkarte {
	public static void main(String args []) {

	 int pin;
	 double guthaben;
	 double betrag;

	public bankkarte (int pin) {
		SecureRandom random = new SecureRandom();
	    StringBuilder pass = new StringBuilder(length);
	    for (int i = 0; i < length; i++) {
	        pass.append(random.nextInt(10));
	    }
	    return pass.toString();
	}
		guthaben = 0.0;
		System.out.println(pin);
	}

	public void bezahle (double betrag, int pin, int zähler) {
		String Eingabe = JOptionPane.showInputDialog("Bitte pin eingeben");
		int eingabepin = Integer.parseInt(Eingabe);
		if (zähler >= 3) {
			throw new RuntimeException("Konto gesperrt!");
		} else {
			if (pin == eingabepin) {
				System.out.println("Pin korrekt");
			} else {
				zähler++;
				System.out.println("Pin nicht korrekt");
			}
		}
		if (guthaben < betrag) {
			throw new RuntimeException("Guthaben nicht ausreichend!");
		} else {
			guthaben = guthaben - betrag;
		}
	}

	public void ladeAuf (int pin, int zähler) {
		String Eingabe = JOptionPane.showInputDialog("Bitte pin eingeben");
		int eingabepin = Integer.parseInt(Eingabe);
		if (zähler >= 3) {
			throw new RuntimeException("Konto gesperrt!");
		} else {
			if (pin == eingabepin) {
				System.out.println("Pin korrekt");
			} else {
				zähler++;
				System.out.println("Pin nicht korrekt");
			}
		}
		for (int i=0; guthaben <= 50; i++) {
			guthaben++;
		}
	}
	}
}
