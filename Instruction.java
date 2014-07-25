public enum Instruction {
	L {
		@Override
		public void addTo(RemoteControl remoteControl) {
			remoteControl.turnLeft();
		}
	},
	R {
		@Override
		public void addTo(RemoteControl remoteControl) {
			remoteControl.turnRight();
		}
	},
	M {
		@Override
		public void addTo(RemoteControl remoteControl) {
			remoteControl.move();
		}
	};
	
	public abstract void addTo(RemoteControl remoteControl);
}
