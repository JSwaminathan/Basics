package programming;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

/**
 * 
 * @author ashwi
 * Generic reservation handler class.  
 * This class support both reservation as well waitlisting capabilities.
 *
 */
public class ReservationHandler {

	protected int queueCapacity;
	protected int wlCapacity;

	protected Hashtable<Integer, ResCapacity> capacity;
	protected Hashtable<Integer, ResCapacity> waitList;

	/**
	 * This constructor takes two parameters for Reservation Handler
	 * 
	 * @param queueCapacity - Maximum allowed queue size beyond which the requests
	 *                      for reservation is pushed to waitlist capacity.
	 * 
	 * @param wlCapacity    - Maximum waitlist capcity beyond which this class will
	 *                      throw ReservationException.
	 */
	public ReservationHandler(int qc, int wlc) {
		queueCapacity = qc;
		wlCapacity = wlc;
	}

	/**
	 * this method is to reserve capacity
	 * 
	 * @return Returns a unique ID after the reservation (including waitinglist).
	 *         Subsequent calls must pass this ID to query this system g
	 */
	public int reserveSeats(String name, int count) /* TODO throws ReservationException */ {
		int pnr = pnrGeneration();
		boolean value = checkCapacity(count);
		if (value == true) {
			ResCapacity rc = new ResCapacity();
			rc.setCount(count);
			rc.setId(pnr);
			rc.setName(name);
			capacity.put(pnr, rc);
		} else {
			RuntimeException e = new RuntimeException();
			throw e;
			
		}
		return pnr;
		}

	public boolean checkCapacity(int nc) {

		Enumeration<ResCapacity> values = capacity.elements();
		int total = 0;
		for (; values.hasMoreElements(); ) {
			ResCapacity  rc = values.nextElement();
			total += rc.getCount();
		}

		if ((total + nc) > queueCapacity) {
			return false;
		}
		
		return (true);
		
	}

	/**
	 * this method is to cancel the reserved capacity
	 */
	public int pnrGeneration() {
		Random random = new Random();
		int pnr = random.nextInt(7);
		return pnr;
	}

	public boolean cancelReservation(int id,int pnr) {

		capacity.remove(pnr);

		return (false);
	}

	/**
	 * returns a list of the booked tickets
	 */
	public int[] reservationList() {
		int[] list = null;
		return list;
	}

	/**
	 * when capicity is at maximum and more travelers have booked tickets they will
	 * be added to wait list if a few cancles their reservation wl1 will be provided
	 * with reservtion the emthod checkes for cancelations and adds wl to the
	 * capacity
	 * 
	 */
	private void addToReservation() {

	}
}
