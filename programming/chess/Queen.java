package programming.chess;

import java.util.ArrayList;

public class Queen implements ChessCoin {
	protected Color color;
	protected Location location;

	public Color getColor() {
		return (color);
	}
	
	public Location getLocation() {
		return (location);
	}
	
	@Override
	public ArrayList<Location> getPossibleLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMoveLegal(Location target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(Location target) {
		// TODO Auto-generated method stub

	}

	@Override
	public ChessCoin kill(Location target) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return ("Queen: " + color + " "+ location);
	}
}
