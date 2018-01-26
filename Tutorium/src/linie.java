

import java.awt.Point;

//Linie zwischen zwei Punkten
public class Linie extends Figur {

	private Point[] punkte;

	@Override
	/**
	 * Gibt die Anzahl an Punkten zurueck
	 * 
	 * Überschreibt die abstrakte Methode der Basisklasse
	 */
	public int getPunktCount() {
		return punkte.length;
	}

	@Override
	/**
	 * Gibt die Anzahl an Punkten zurueck
	 * 
	 * Überschreibt die abstrakte Methode der Basisklasse
	 * 
	 * @param i
	 *            index des gewuenschten Punktes
	 */
	public Point getPunkt(int i) {
		return punkte[i];
	}

	/**
	 * Erstelle eine Linien Object mit den uebergeben Punkten
	 * 
	 * @param x1
	 * @param x2
	 */
	public Linie(Point x1, Point x2) {
		punkte = new Point[] { x1, x2 };
	}
}