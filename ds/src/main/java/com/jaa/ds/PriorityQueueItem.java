package com.jaa.ds;

import com.jaa.ds.PriorityQueue.Priority;

public class PriorityQueueItem extends QueueItem {

	protected Priority priority;

	public PriorityQueueItem(Object value, Priority priority) {
		super(value);
		this.priority = priority;
	}

}
