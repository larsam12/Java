import java.io.*;
import java.util.*;

public class JavaCode {
	Scanner sc = new Scanner(System.in);
	PrintWriter pw = new PrintWriter(System.in.getName() + ".out");
	ArrayList<String> Ausgabe = new ArrayList<String>();

	public JavaCode(Scanner sc) {
		this.sc = sc;
	}

	public void ladeCode(Scanner sc) {
		while (sc.hasNextLine()) {
			Ausgabe.add(sc.nextLine());
		}
	}

	public void schreibeCode(PrintWriter pw) {
		pw.println(sc);
		pw.close();
	}

	public void entferneKommentare() {
		  
	}

}

	public static void main(String args[]) {

	}
}
