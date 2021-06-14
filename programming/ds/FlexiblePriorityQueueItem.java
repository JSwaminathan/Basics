package programming.ds;

import programming.ds.PriorityQueue.Priority;

public class FlexiblePriorityQueueItem extends PriorityQueueItem {

	protected int intPriority;
	
	public FlexiblePriorityQueueItem(Object value, int priority) {
		super(value, Priority.MAX); // Ignore the priority in the base class
		
		intPriority = priority;
		
	}

}
