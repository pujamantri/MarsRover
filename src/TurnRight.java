public class TurnRight extends RoverCommand {
	
	public TurnRight(MarsRover marsRover) {
		super(marsRover);
	}
	
	@Override
	public void execute() {
		marsRover.turnRight();
	}

}
