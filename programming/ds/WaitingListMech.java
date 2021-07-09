/**
 * 
 */
package programming.ds;

import java.util.ArrayDeque;

/**
 * @author ashwi
 *
 *         This class has 2 queue's confirmed and waiting list confirmed list
 *         has a total 30 elements and waiting list has 20 elements if a element
 *         is removed from the confirmed list the first element of the waiting
 *         list is pushed into the confirmed list.
 */
public class WaitingListMech {
	private ArrayDeque<Integer> cl = new ArrayDeque<Integer>();
	private ArrayDeque<Integer> wl = new ArrayDeque<Integer>();

	public void dequeue() {
		if (cl.size() == 30 && wl.size() != 0) {
			cl.remove();
		int waiting = wl.remove();
		cl.add(waiting);
		}

	}

	public void enqueue(int i) {
		WaitingListMech wlm = new WaitingListMech();

		int size = cl.size();
		if (size >= 30) {
			wlm.enqueueWaiting(i);
		} else
			cl.add(i);

	}

	private void enqueueWaiting(int i) {
		int size = wl.size();
		if (size >= 20) {
			System.out.println("Out of tickets");

		} else
			wl.add(i);

	}

	public static void main(String[] args) {
		WaitingListMech wlm = new WaitingListMech();
		for (int i = 0; i <= 30; i++) {
			wlm.enqueue(i);

		}

	}

}
