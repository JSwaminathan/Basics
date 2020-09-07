package programming;

/**
 * This class maintains a "prioritized" list of items. With same priority the
 * items would behave like a regular queue. But when priority varies, the items
 * with higher priority will be dequeued from the Queue.
 * 
 * @author ash
 *
 */
public class PriorityQueue extends Queue {
	public enum Priority {
		MIN, MEDIUM, MAX
	}

	/**
	 * Enqueue allows you to add an item to this queue with a priority.
	 * 
	 * @param value
	 * @param priority
	 */
	public void enqueue(QueueItem item) {

		assert (item instanceof PriorityQueueItem);

		PriorityQueueItem pqi = (PriorityQueueItem) item;

		if (size() == 0) {
			al.add(item);
			return;
		}

		
		setFirstItemBeforeLowerPriority(item);
	}

	/**
	 * Return true if p1 priority is lower than p2.
	 * 
	 * @param p1
	 * @param p2
	 * @return
	 */
	public boolean isLowerPriority(Priority p1, Priority p2) {
		if (p1 == p2) {
			return false;
		}

		switch (p1) {
		case MAX:
			return (false);
		case MEDIUM:
			if (p2 == Priority.MAX) {
				return (true);
			} else {
				return (false);
			}
		case MIN:
			if (p2 == Priority.MEDIUM || p2 == Priority.MAX) {
				return (true);
			}
			break;
		}
		
		return (false);
	}

	public void setFirstItemBeforeLowerPriority(QueueItem item) {
		PriorityQueueItem pqi = (PriorityQueueItem) item;

		int len = al.size();

		boolean found = false;
		
		for (int i = 0; i < len; i++) {
			PriorityQueueItem currItem = (PriorityQueueItem) al.get(i);
			if (isLowerPriority(currItem.priority, pqi.priority)) {
				// this is the index we are interested in inserting!
				al.add(i, item);
				return;
			}
		}
		
		if (found == false) {
			// Insert at the end since this is the *least* priority now.
			al.add(item);
		}

	}
}
