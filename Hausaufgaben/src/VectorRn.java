import java.util.Vector;

public class VectorRn {
	int[] v1;
	int[] v2;
	int[] Vectoradd = new int[v1.length];
	double skalarprodukt;
	double skalarprodukt1;
	double skalarprodukt2;
	double skalarprodukt3;
	static double standardskalarpodukt;
	static double standardskalarprodukt1;
	static double standardskalarprodukt2;
	static double standardskalarprodukt3;
	boolean parallel = false;
	double parallel1;
	double parallel2;
	double parallel3;

	public VectorRn(int[] v1, int[] v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public int[] add(int[] v1, int[] v2) {
		if (v1.length == v2.length) {
			for (int i = 0; i < v1.length; i++) {
				Vectoradd[i] = v1[i] + v2[i];
			}
			return Vectoradd;
		} else {
			throw new RuntimeException("Vekotren müssen die selbe Größe haben");
		}
	}

	public double mult(double d) {

		skalarprodukt1 = d * v1[0];
		skalarprodukt2 = d * v1[1];
		skalarprodukt3 = d * v1[2];
		skalarprodukt = skalarprodukt1 + skalarprodukt2 + skalarprodukt3;

		return skalarprodukt;
	}

	public static double scalarProd(int[] v1, int[] v2) {
		standardskalarprodukt1 = v1[0] * v2[0];
		standardskalarprodukt2 = v1[1] * v2[1];
		standardskalarprodukt3 = v1[2] * v2[2];
		standardskalarpodukt = standardskalarprodukt1 + standardskalarprodukt2 + standardskalarprodukt3;

		return standardskalarpodukt;
	}

	public boolean isParalell(int [] v1, int [] v2) {
    	  if (v1.length == v2.length) {
    		  for (int i = 0; i<v1.length; i++) {
    			  if (v1[i]/v2[i]){
    			  int zähler = 0;
    			  zähler++;
    		  
    			  if (zähler == 3) {
    				  parallel = true;
    				  return parallel;
    			  } else {
    				  return parallel;
    			  }
    			  }
    		  }
    	  }else

	{
		throw new RuntimeException("Vektoren müssen die selbe Größe haben");
	}
	}

	public static void main(String args[]) {
		int[] v1 = { 4, 7, 2 };
		int[] v2 = { 1, 3, 2 };
		int[] Vectoradd = add(v1, v2);
		double d = mult(v1, d);
	}
}