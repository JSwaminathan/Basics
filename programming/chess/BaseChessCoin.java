package programming.chess;

import programming.chess.ChessCoin.Color;

public class BaseChessCoin {
	private Color color;
	private Location location;

	public BaseChessCoin(Color color, Location location) {
		this.color = color;
		this.location = location;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
