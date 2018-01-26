package jetzt;

public class Datum {
	public static final int[] monatslaengen = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final String[] wochentage = { "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So" };
	private int tag, monat, jahr;
	Datum datum = new Datum(tag, monat, jahr);
	boolean schaltjahr;
	int x = 31;
	int y = 29;
	int z = 28;
	int a, b, c, d, e, f;

	public int getMonatslaenge(int monat, int jahr) {
		if (monat % 2 != 0 || monat == 8) {
			return x;
		} else {
			if (monat == 2) {
				if (schaltjahr == true) {
					return y;
				} else {
					return z;
				}
			}
		}
	}

	public boolean isSchaltjahr(int jahr) {
		if (jahr % 4 == 0) {
			if (jahr % 100 == 0) {
				schaltjahr = false;
			} else if (jahr % 400 == 0) {
				schaltjahr = true;
			}
			schaltjahr = true;
		}
		return schaltjahr;
	}

	public boolean equals(Datum a) {
		boolean equals;
		if (this.datum == a) {
			equals = true;
		} else {
			equals = false;
		}
		return equals;
	}

	public boolean isGleicherTag(Datum a) {
		boolean gleicherTag;
		if (this.tag == a.tag && this.monat == a.monat) {
			gleicherTag = true;
		} else {
			gleicherTag = false;
		}
		return gleicherTag;
	}

	public String toString() {
		String Datum;
		Datum = "Tag:" + this.tag + "Monat:" + this.monat + "Jahr:" + this.jahr;
		return Datum;
	}

	public Datum(int tag, int monat, int jahr) {
		if (tag > 31) {
			throw new InvalidDateException("Tag nicht zulässig");
		} else if (monat > 12) {
			throw new InvalidDateException("Monat nicht zulässig");
		} else if (jahr < 1800 || jahr > 2100) {
			throw new InvalidDateException("Jahr nicht zulässig");
		}
		Datum d = new Datum(tag, monat, jahr);
	}

	public Datum(int tag, int jahr) {
		if (this.tag < 0 || this.tag > 31) {
			throw new InvalidDateException("Tag nicht zulässig");
		} else {
			Datum datum2 = new Datum(this.tag, this.jahr);
		}
	}

	public Datum morgen() {
		this.tag++;
		Datum datummorgen = new Datum(this.tag, this.monat, this.jahr);
		return datummorgen;
	}

	public Datum gestern() {
		this.tag--;
		Datum datumgestern = new Datum(this.tag, this.monat, this.jahr);
		return datumgestern;
	}

	public String getWochentag() {
		if (jahr > 1800 || jahr < 1900) {
			a = jahr - 1800;
			e = 5;
		} else if (jahr > 1900 || jahr < 2000) {
			a = jahr - 1900;
			e = 3;
		} else if (jahr > 2000 || jahr < 2100) {
			a = jahr - 2000;
			e = 2;
		} else {
			throw new InvalidDateException("Jahreszahl nicht zulässig");
		}
		b = a / 12;
		c = a % 12;
		d = b / 4;
		f = b + c + d + e;
		if (f > 7) {
			f = f - 7;
		}
	}

	public class InvalidDateException extends Exception {
		InvalidDateException() {
			super("Datum nicht zulässig");
		}
	}
}