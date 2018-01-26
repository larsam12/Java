
abstract class Flugzeug {
	private String hersteller;
	private int maxSpeed;
	private String immatNummer;
	private int anzahlFluegel;
	int loopingspeed = 320;
	boolean looping;

	public Flugzeug(String hersteller, int maxSpeed, int anzahlFluegel) {
		this.hersteller = hersteller;
		this.maxSpeed = maxSpeed;
		this.anzahlFluegel = anzahlFluegel;
	}

	public String getImmatNummer() {
		return immatNummer;
	}

	protected void setImmatNummer(String ImmatNummer) {
		this.immatNummer = immatNummer;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public boolean getLooping() {
		if (anzahlFluegel >= 1) {
			if (maxSpeed >= loopingspeed) {
				looping = true;
			} else {
				looping = false;
			}
		}
		return looping;
	}
}
