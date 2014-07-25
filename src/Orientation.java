
public enum Orientation {
	N {
		@Override
		public Orientation left() {
			return W;
		}

		@Override
		public Orientation right() {
			return E;
		}

		@Override
		public Position move(Position oldPosition, int offset) {
			return new Position(oldPosition.x(), oldPosition.y() + offset);
		}
	},
	E {

		@Override
		public Orientation left() {
			return N;
		}

		@Override
		public Orientation right() {
			return S;
		}

		@Override
		public Position move(Position oldPosition, int offset) {
			return new Position(oldPosition.x() + offset, oldPosition.y());
		}
		 
	},
	W {
		@Override
		public Orientation left() {
			return S;
		}

		@Override
		public Orientation right() {
			return N;
		}

		@Override
		public Position move(Position oldPosition, int offset) {
			return new Position(oldPosition.x() - offset, oldPosition.y());
		}
	}, 
	S {
		@Override
		public Orientation left() {
			return E;
		}

		@Override
		public Orientation right() {
			return W;
		}

		@Override
		public Position move(Position oldPosition, int offset) {
			return new Position(oldPosition.x(), oldPosition.y() - offset);
		}
	};
	
	public abstract Orientation left();
	public abstract Orientation right();
	public abstract Position move(Position oldPosition, int offset);
}
