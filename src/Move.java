public class Move extends RoverCommand {
	
	public Move(MarsRover marsRover) {
		super(marsRover);
	}
	
	@Override
	public void execute() {
		marsRover.move();
	}

}
