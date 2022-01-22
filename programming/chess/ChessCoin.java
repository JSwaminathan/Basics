package programming.chess;

import java.util.ArrayList;

/**
 * Representation of a chess coin.
 * 
 * @author ashwi
 *
 */
public interface ChessCoin {
	enum Color {BLACK, WHITE };

	/**
	 * Return all possible locations that the current coin can move
	 * 
	 * @return
	 */
	public ArrayList<Location> getPossibleLocation();

	/**
	 * Return true if the target location is valid for the current coin; false
	 * otherwise.
	 * 
	 * @param target
	 * @return
	 */
	public boolean isMoveLegal(Location target);

	/**
	 * Move to the target location. If successful the coin will be in the target
	 * location.
	 * 
	 * @param target
	 * @return
	 * @exception IllegalStateException if the move is not allowed by chess rules.
	 */
	public void move(Location target);

	/**
	 * Kill the coin in the target location and return the coin. Return null if
	 * there is no coin in the target location.
	 * 
	 * @param target
	 * @return
	 */
	public ChessCoin kill(Location target);

	/**
	 * Get the location of the current coin.
	 * 
	 * @return
	 */
	public Location getLocation();

	/**
	 * Get coin's color.
	 * 
	 * @return
	 */
	public Color getColor();
}
