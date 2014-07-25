public class TurnLeft extends RoverCommand {
	
	public TurnLeft(MarsRover marsRover) {
		super(marsRover);
	}
	
	@Override
	public void execute() {
		marsRover.turnLeft();
	}

}
