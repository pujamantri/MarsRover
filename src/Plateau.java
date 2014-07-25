
public class Plateau {
	private Position startPosition;
	private Position endPosition;
	
	public Plateau(int x, int y) {
		this.startPosition = new Position(0, 0);
		this.endPosition = new Position(x, y);
	}
	
	public Position getNextPosition(Position oldPostion, Orientation orientation, int offset) {
		Position  newPosition  = orientation.move(oldPostion, offset);
		if (startPosition.x() <= newPosition.x() && newPosition.x() <= endPosition.x() && 
				      startPosition.y() <= newPosition.y() && newPosition.y() <= endPosition.y()) {
			return newPosition;
		} else {
			return oldPostion;
		}
	}
	
}
