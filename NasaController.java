import java.util.HashMap;
import java.util.Map;

public class NasaController {
	private Map<String, MarsRover> marsRovers;
	private Plateau plateau;
	
	public NasaController() {
		marsRovers = new HashMap<String, MarsRover>();
	}
	
	public void addMarsRover(String id, int x, int y, String direction) {
		MarsRover marsRover = new MarsRover(id);
		marsRover.atPosition(x, y, direction);
		marsRover.movesOn(plateau);
		marsRovers.put(id, marsRover);
	}
	
	public void instruct(String id, String commandStrng) {
		MarsRover marsRover = marsRovers.get(id);
		RemoteControl remoteControl = new RemoteControl(marsRover);
		char[] instructions = commandStrng.toCharArray();
		for (Character instruction : instructions) {
			Instruction command = Instruction.valueOf(instruction.toString());
			command.addTo(remoteControl);
		}
		remoteControl.executeCommands();
	}
	
	public MarsRover getMarsRover(String id) {
		return marsRovers.get(id);
	}
	
	public void setPlateau(int x, int y) {
		this.plateau = new Plateau(x, y);
	}
}
