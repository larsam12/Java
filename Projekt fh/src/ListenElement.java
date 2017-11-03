import javax.swing.JOptionPane;

public class ListenElement {
	private String oberthema;
	private ListenElement next;
	private ListenElement anfang;
	private int groesse;
	String Eingabe1 = JOptionPane.showInputDialog("1. Oberthema eingeben");
	String Eingabe2 = JOptionPane.showInputDialog("2. Oberthema eingeben");
	String Eingabe3 = JOptionPane.showInputDialog("3. Oberthema eingeben");
	String Eingabe4;
	String Eingabe5;

	public ListenElement(String oberthema) {
		this.oberthema = oberthema;
	}

	public String getOberthema() {
		return oberthema;
	}

	public ListenElement getNext() {
		return next;
	}
	public int getGroesse() {
		return groesse;
	}

	public void setNext(ListenElement next) {
		this.next = next;
	}

	public static void main(String args[]) {
           
	}

	public boolean hinzufuegen(String thema) {
		boolean erfolgreich = false;
		ListenElement pos = new ListenElement(thema);
		pos.setNext(anfang);
		anfang = pos;
		erfolgreich = true;
		groesse++;
		return erfolgreich;
	}
	
}
