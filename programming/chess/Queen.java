package programming.chess;

import java.util.ArrayList;

public class Queen extends BaseChessCoin implements ChessCoin {
	public Queen(Color color, Location location) {
		super(color, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Location> getPossibleLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMoveLegal(Location target) {
		//TODO	havent checked for coins in the path of the queen 
		Location location = getLocation();
		int col=location.getCol();
		int row=location.getRow();
		
		if(col==target.getCol()) {
			return true;
		}
		else if(row==target.getRow()) {
			return true;
		}
		else if((row+col)==(target.getRow()+target.getCol())) {
			return true;
		}
		else if(target.getRow()==target.getCol()) {
			return true;
			
		}else
			return false;		//Move invalid
	}
		
	@Override
	public void move(Location target) {

	}

	@Override
	public ChessCoin kill(Location target) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
		return ("Queen: " + super.getColor() + " " + super.getLocation());
	}
}
