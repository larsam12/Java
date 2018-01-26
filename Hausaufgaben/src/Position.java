
public class Position {

	public Position(int x, int y) {
		if (x <= 8 && y <= 8) {
			Position pos = new Position(x, y);
		} else {
			throw new RuntimeException("Feld existiert nicht");
		}
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public boolean equals(Position p) {
		boolean equal = false;
		if (this.pos == p) {
			equal = true;
			return equal;
		} else {
			return equal;
		}
	}

	public boolean isValid() {
		boolean valid = false;
		Position test = new Position(8, 8);
		if (this.pos <= test) {
			valid = true;
			return valid;
		} else {
			return valid;
		}
	}

	public String toString () {
		String s = ("Position:" x + "/" +  y );
		return s;
     
	}
}
