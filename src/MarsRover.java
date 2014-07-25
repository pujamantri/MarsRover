public class MarsRover {
	private String id;
	private Position position;
	private Orientation orientation;
	private Plateau plateau;
	
	public MarsRover(String id) {
		this.id = id;
	}

	public Position getPosition() {
		return position;
	}
	
	public Orientation getOrientation() {
		return orientation;
	}
	
	public String getId() {
		return id;
	}
	
	public void move() {
		this.position = plateau.getNextPosition(position, orientation, 1);
	}
	
	public void turnLeft() {
		this.orientation = orientation.left();
	}
	
	public void turnRight() {
		this.orientation = orientation.right();
	}
	
	public void movesOn(Plateau plateau) {
		this.plateau = plateau;
	}
	
	public void atPosition(int x, int y, String direction){
		this.position = new Position(x, y);
		this.orientation = Orientation.valueOf(direction);
	}
}
