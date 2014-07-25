
import java.util.LinkedList;
import java.util.Queue;

public class RemoteControl {
	private Queue<RoverCommand> commands;
	private MarsRover marsRover;
	
	public RemoteControl(MarsRover marsRover) {
		commands = new LinkedList<RoverCommand>();
		this.marsRover = marsRover;
	}
	
	public void executeCommands() {
		while(commands.peek() != null) {
			commands.remove().execute();
		}
	}
	
	public void turnLeft() {
		commands.add(new TurnLeft(marsRover));
	}
	
	public void turnRight() {
		commands.add(new TurnRight(marsRover));
	}
	
	public void move() {
		commands.add(new Move(marsRover));
	}
}
