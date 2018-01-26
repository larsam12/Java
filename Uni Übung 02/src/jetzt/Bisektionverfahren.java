package jetzt;

import java.lang.Math;

public class Bisektionverfahren {

	double xm;

	public double getNullstelle(Funktion f, double xMin, double xMax) {
		while (xMax - xMin > 1e-10) {
			if (Math.abs(xm) < 1e-10) {
				System.out.println(xm);
			} else if (xMin * xm < 0) {
				xMax = xm;
			} else if (xMax * xm < 0) {
				xMin = xm;
			}
			xm = (xMin + xMax) / 2;

			if (getY(xMin) - getY(xm) > 0) {
				xm = (xm + xMax) / 2;
			} else {
				xm = getY(xMax) - getY(xm);
			}
		}
	}
}
