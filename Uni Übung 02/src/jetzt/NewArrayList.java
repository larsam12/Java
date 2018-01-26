package jetzt;
import java.util.ArrayList;

public class NewArrayList { 	

	ArrayList<String> a = new ArrayList<>();
	ArrayList<Integer> b = new ArrayList<>();
	ArrayList<Double> c = new ArrayList<>();
	ArrayList<Integer> d = new ArrayList<>();
	ArrayList<Double> e = new ArrayList<>();
	int StringInt;
	double StringDouble;

	public void add(String x) {
		try {
			StringInt = Integer.parseInt(x);
		} catch (NumberFormatException e) {
			a.add(x);
		}

		try {
			StringDouble = Double.parseDouble(x);
		} catch (NumberFormatException e) {
			a.add(x);
		}
	}

	public void add(int x) {
		b.add(x);
	}

	public void add(double x) {
		c.add(x);
	}
	
	public ArrayList<Integer> getIntegers() {
		if (x instanceof Integer) {
			d.add(x);
		}
	}
	
	public ArrayList<Double> getDoubles(int x) {
		if (x instanceof Double) {
			e.add(x);
		}
	}

}
