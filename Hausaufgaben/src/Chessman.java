
public class Chessman {
	
	public Chessman(Position pos) {
		if (pos<=8) {
		this.pos = pos;
		} else {
			throw new RuntimeException("Feld existiert nicht");
		}
	}
	
	public Position getPosition() {
		return this.pos;
	}
	
	public void moveTo(Position pos)
	{
		
	}
}
