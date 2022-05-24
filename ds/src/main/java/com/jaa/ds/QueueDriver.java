package com.jaa.ds;

public class QueueDriver {

	public static void main(String[] args) {
		Fpq queue = new Fpq(1, 10);

//		PriorityQueueItem pqi2 = new PriorityQueueItem("Ashwin", Priority.MAX);
//		PriorityQueueItem pqi3 = new PriorityQueueItem("Arjun", Priority.MIN);
//		PriorityQueueItem pqi4 = new PriorityQueueItem("Meena", Priority.MAX);

		PriorityQueueItem pqi2 = new FlexiblePriorityQueueItem("Ashwin", 3);
		PriorityQueueItem pqi3 = new FlexiblePriorityQueueItem("Arjun",1 );
		PriorityQueueItem pqi4 = new FlexiblePriorityQueueItem("Meena", 4);
		PriorityQueueItem pqi5 = new FlexiblePriorityQueueItem("Jay", 2);
		
		
		queue.enqueue(pqi2);
		queue.enqueue(pqi3);
		queue.enqueue(pqi4);
		queue.enqueue(pqi5);

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
