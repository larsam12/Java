
public class GefDilemma {
	
	private Spieler s1;
	private Spieler s2;
	
	public GefDilemma(GefStrategie gs1, GefStrategie gs2) {
       this.s1 = new Spieler (gs1);
       this.s2 = new Spieler (gs2);
	}
	
	public void getStrategie1() {
		return gs1;
	}
	
	public void getStrategie2() {
		return gs2;
	}
	
	public void spiele (int n) {
		getStrategie1();
		getStrategie2();
		
		for (int i = ; i<n; i++) {
			
		}
	}

