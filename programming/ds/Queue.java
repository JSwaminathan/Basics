package programming.ds;

import java.util.ArrayList;

/**
 * This class maintains an abstraction of Queue.
 * 
 * @author ash
 *
 */
public class Queue {
	protected ArrayList<QueueItem> al;

	public Queue() {
		al = new ArrayList<QueueItem>();
	}

	/**
	 * Enqueue allows you to add an item to this queue.
	 * 
	 * @param value
	 */
	public void enqueue(QueueItem item) {
		al.add(item);

	}

	/**
	 * Return the first item with the highest priority
	 * 
	 * @return
	 */
	public QueueItem dequeue() throws EmptyQueueException {
		if (al.size() == 0) {
			throw new EmptyQueueException();
		}

		QueueItem item = al.remove(0);

		return (item);
	}

	/**
	 * Return the queue's length
	 * 
	 * @return
	 */
	public int size() {
		return (al.size());
	}

}
