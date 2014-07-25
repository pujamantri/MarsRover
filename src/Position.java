public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int x() {
		return x;
	}

	public int y() {
		return y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Position)) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		Position pos = (Position) obj;
		if (pos.x() == this.x && pos.y() == this.y) {
			return true;
		}
		return false;
		
	}
}
