package programming.ds;

import programming.ds.PriorityQueue.Priority;

public class PriorityQueueItem extends QueueItem {

	protected Priority priority;

	public PriorityQueueItem(Object value, Priority priority) {
		super(value);
		this.priority = priority;
	}

}
