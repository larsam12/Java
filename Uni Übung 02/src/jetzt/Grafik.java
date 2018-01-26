package jetzt;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * Zweck: Fuer Praesenzuebung zu verwendende Klasse,
 * die den Rahmen bietet, um geometrische Figuren auf dem Bildschirm anzeigen zu lassen.</br>
 * Der Rahmen besteht dabei aus den Klassen Grafik und Figur.
 * 
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Grafik {

	private JFrame frame;
	private JPanel panel;
	private ArrayList<Figur> figuren = new ArrayList<Figur>();

	/**
	 * Oeffnet ein Grafikfenster mit einer Zeichenflaeche der angegebenen Breite und
	 * Hoehe.
	 * 
	 * @param width
	 *            Breite der Zeichenflaeche
	 * @param height
	 *            Hoehe der Zeichenflaeche
	 */
	public Grafik(int width, int height) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		panel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				for (int i = 0; i < figuren.size(); i++) {
					figuren.get(i).paint(g);
				}
			}
		};
		panel.setPreferredSize(new Dimension(width, height));
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Aktualisiert die Zeichenflaeche. Aenderungen werden erst sichtbar, nachdem
	 * diese Methode aufgerufen wurde. Vor der Aktualisierung wird ms Milisekunden
	 * gewartet.</br>
	 * Damit ist eine einfache Animation moeglich.
	 * 
	 * @param verzoegerung
	 *            Zeit in Milisekunden, die vor der Aktualisierung gewartet wird.
	 */
	public void aktualisiere(int verzoegerung) {
		// frame.repaint();
		try {
			Thread.sleep(verzoegerung);
			SwingUtilities.invokeAndWait(new Runnable() {
				@Override
				public void run() {
					panel.paint(panel.getGraphics());
				}
			});
		} catch (InterruptedException e) {
		} catch (InvocationTargetException e) {
		}
	}

	/**
	 * Diese Methode fuegt die uebergebene Figur in die Zeichenflaeche ein.
	 * 
	 * @param f
	 *            In die Zeichenflaeche einzufuegende Figur.
	 */
	public void add(Figur f) {
		figuren.add(f);
	}

	/**
	 * Mit dieser Methode wird die uebergebene Figur von der Zeichenflaeche entfernt
	 * 
	 * @param f
	 */
	public void remove(Figur f) {
		figuren.remove(f);
	}
}

abstract class Figur {

	/**
	 * Gibt die Anzahl an Punkten zurueck. Es handelt sich um eine abstrakte Methode
	 * die in allen Unterklassen von Figur ueberschrieben werden muss
	 * 
	 * @return
	 */
	public abstract int getPunktCount();

	/**
	 * Gibt den zum index gehoerenden Punkt zurueck. Es handelt sich um eine
	 * abstrakte Methode die in allen Unterklassen von Figur ueberschrieben werden
	 * muss
	 * 
	 * @param i
	 * @return
	 */
	public abstract Point getPunkt(int i);

	/**
	 * Diese Methode zeichnet zwischen den jeweils benachbarten Punkten der Liste
	 * eine Verbindungslinie.
	 * 
	 * @param g
	 *            Graphicobjekt, auf dem die Punkte der Figur eingezeichnet werden
	 */
	public void paint(Graphics g) {
		for (int i = 0; i < getPunktCount() - 1; i++) {
			g.drawLine(getPunkt(i).x, getPunkt(i).y, getPunkt(i + 1).x, getPunkt(i + 1).y);
		}
	}

	/**
	 * Alle Punkte der Figur werden um die angegebenen Werte verschoben.
	 * 
	 * @param x
	 *            Verschiebungswert in x-Richtung
	 * @param y
	 *            Verschiebungswert in y-Richtung
	 */
	public void verschiebe(int x, int y) {
		for (int i = 0; i < getPunktCount(); i++) {
			getPunkt(i).translate(x, y);
		}
	}

	@Override
	public String toString() {
		return "Leere Figur:";
	}
}