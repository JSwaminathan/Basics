package programming;

/**
 * Create a queue with flexible priorities , for eg : priorities ranging from p1
 * to p10 while initializing the queue should not affect other classes ,
 * polymorphic behavior , thus should override priorityQueue
 */
public class Fpq extends PriorityQueue {
	private int minPriority;
	private int maxPriority;

	public Fpq(int min, int max) {
		minPriority = min;
		maxPriority = max;

	}

	@Override
	public boolean isLowerPriority(PriorityQueueItem pqi1, PriorityQueueItem pqi2) {
		FlexiblePriorityQueueItem i1 = (FlexiblePriorityQueueItem) pqi1;
		FlexiblePriorityQueueItem i2 = (FlexiblePriorityQueueItem) pqi2;

		int diff = (i1.intPriority - i2.intPriority);

		if (diff >= 0) {
			return (true);
		} else {
			return (false);
		}
//
	}
}
