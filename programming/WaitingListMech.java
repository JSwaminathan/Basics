package programming;

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
	private static final int MAXCONFRIMED = 30;
	private static final int MAXWAITING = 20;

	private ArrayDeque<Integer> cl = new ArrayDeque<Integer>();
	private ArrayDeque<Integer> wl = new ArrayDeque<Integer>();

	public int dequeue() {
		if (cl.size() == MAXCONFRIMED && wl.size() != 0) {
			int element = cl.remove();
			int waiting = wl.remove();
			cl.add(waiting);
			return element;
		}
		return 0;

	}

	public void enqueue(int i) {

		int size = cl.size();
		if (size == 30) {
			enqueueWaiting(i);
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

	private void printQueue() {
		System.out.println("CL  "+cl.toString());
		System.out.println("WL  "+wl.toString());
	}

	public static void main(String[] args) {
		WaitingListMech wlm = new WaitingListMech();
		for (int i = 0; i < 35; i++) {
			wlm.enqueue(i);

		}
		wlm.printQueue();
		int element=wlm.dequeue();
		wlm.printQueue();
		System.out.println("removed element  is"+element);
	}

}
