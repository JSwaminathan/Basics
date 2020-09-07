package programming;

import programming.PriorityQueue.Priority;

public class QueueDriver {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();

		PriorityQueueItem pqi1 = new PriorityQueueItem("Jay", Priority.MAX);
		PriorityQueueItem pqi2 = new PriorityQueueItem("Ashwin", Priority.MIN);
		PriorityQueueItem pqi3 = new PriorityQueueItem("Arjun", Priority.MEDIUM);
		PriorityQueueItem pqi4 = new PriorityQueueItem("Meena", Priority.MAX);

		queue.enqueue(pqi1);
		queue.enqueue(pqi2);
		queue.enqueue(pqi3);
		queue.enqueue(pqi4);

		while (true) {
			try {
				System.out.println("Dequeue:" + queue.dequeue());
				// Expect EmptyQueueError!
				System.out.println("Dequeue:" + queue.dequeue());
			} catch (EmptyQueueException e) {
				System.out.println("Queue is emptied!");
				break;
			}
		}

	}

}
