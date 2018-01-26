package jetzt;

import java.awt.*;

public class Rechteck {

	private Point[] p1 = { new Point(0, 0) };
	private Point[] p2;
	private Point[] p3 = { new Point(5, 10) };
	private Point[] p4;

	public Rechteck(Point p1, Point p2) {
		Point[] p3;
		Point[] p4;
		Rechteck r = new Rechteck(p1, p2);
		p3[0] = p1[0];
		p3[1] = p2[1];
		p4[0] = p2[0];
		p4[1] = p1[1];
	}

	public Rechteck(Rechteck r) {
		Rechteck re = new Rechteck();
		try {
			return r.clone(re);
		} catch (CloneNotSupportedException e) {
		}
	}

	public void skaliere(double d) {
		for (int i = 0; i >= p1.length; i++) {
			p1[i] = p1[i] * d;
		}
		for (int i = 0; i >= p2.length; i++) {
			p2[i] = p2[i] * d;
		}
		for (int i = 0; i >= p3.length; i++) {
			p3[i] = p3[i] * d;
		}
		for (int i = 0; i > p4.length; i++) {
			p4[i] = p4[i] * d;
		}
	}

	public Rechteck vereinige(Rechteck r) {

	}
}
