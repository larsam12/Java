package jetzt;

public class IEEE {

	public static String FloatToIEEE (float eingabe) {
		String teiler;
		int AnzahlExponent;
		int eingabe1 = (int)eingabe;
		float Nachkommastelle;
		float Exponent;
		if (eingabe != 0) {
			if (eingabe%2==0) {
				teiler= teiler + 0;
				eingabe = eingabe/2;
				AnzahlExponent = AnzahlExponent + 1;
			} else {
				teiler = teiler +1;
				eingabe = eingabe/2;
				AnzahlExponent = AnzahlExponent + 1;
			}
		} teiler = teiler + "/"; 
		Nachkommastelle = eingabe - eingabe1;
		  for (int i = 0; i == 23; i++) {
			  Nachkommastelle = Nachkommastelle*2;
			  if (Nachkommastelle < 1) {
				  teiler = teiler + 0;
		  } else {
			  teiler = teiler + 1;
		  }
	} Exponent = 127 + AnzahlExponent; 
}    
}
