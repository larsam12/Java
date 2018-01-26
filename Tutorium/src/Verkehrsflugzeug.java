
public class Verkehrsflugzeug extends Flugzeug {
       int anzahlPassagiere;
       
       public Verkehrsflugzeug(String hersteller, int maxSpeed, String immatNummer, int anzahlPassagiere) {
    	   super();
    	   this.anzahlPassagiere = anzahlPassagiere;
       }
       
       public int getAnzahlPassagiere() {
    	   return anzahlPassagiere;
       }
       public void setAnuahlPassagiere(int anzahlPassagiere) {
    	   this.anzahlPassagiere = anzahlPassagiere;
       }
 }
