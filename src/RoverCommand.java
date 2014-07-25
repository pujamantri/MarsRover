public abstract class RoverCommand {
	protected MarsRover marsRover;
	
	public RoverCommand(MarsRover marsRover) {
		this.marsRover = marsRover;
	}
	
	public abstract void execute();
}
