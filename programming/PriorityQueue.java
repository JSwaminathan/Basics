package programming;

/**
 * This class maintains a "prioritized" list of items.
 * With same priority the items would behave like a regular queue.
 * But when priority varies, the items with higher priority will be
 * dequeued from the Queue.
 * @author ash
 *
 */
public class PriorityQueue extends Queue {
	public enum Priority { MIN, MEDIUM, MAX }
	
	/**
	 * Enqueue allows you to add an item to this queue with a priority.
	 * @param value
	 * @param priority
	 */
	public void enqueue(QueueItem item) {
		super.enqueue(item);
	}

}
