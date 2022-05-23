package com.jaa.resourcemgmt;

import java.util.ArrayList;
import java.util.Iterator;

public class ReservationManager {

	private ResourceList resources;

	public void setResourceList(ResourceList list) {
		resources = list;
	}

	private int getConfirmationNumber() {
		int value = (int) (Math.random() * (99999 - 10001 + 1) + 10001);
		// System.out.println("Random: " + value);
		return (value);
	}

	/**
	 * Reserve 'n' units of a resource for a given user. Decrement the resource
	 * count after successful reservation If sufficient count is not available, put
	 * the remaining in WL. If WL is also full, throw error that reservation is
	 * denied
	 * 
	 * Returns a reservation confirmation number if successful.
	 * 
	 * @param resource
	 */
	public int reserve(String resourceName, String user, int units) {

		Resource resource = resources.getResource(resourceName);

		int currentCount = resource.reservedList.size();

		int confirmationNumber;
		// Generate a confirmation number.
		confirmationNumber = getConfirmationNumber();

		if ((currentCount + units) <= resource.getAbsoluteLimit()) {
			// Allow
			for (int i = 0; i < units; i++) {
				resource.reservedList.add(new Integer(confirmationNumber));
			}

		} else {
			// Put in WL

			if ((resource.wl.size() + units) <= Resource.WL_MAX_SIZE) {
				// Allow in WL
				for (int i = 0; i < units; i++) {
					resource.wl.add(new Integer(confirmationNumber));
				}
			} else {
				throw new RuntimeException("No space left, including WL!");
			}
		}

		return (confirmationNumber);

	}

	public void printResourceCurrentState(String name) {
		Resource resource = resources.getResource(name);
		System.out.println("Resource name: " + resource.getName() + " Absolute Value: " + resource.getAbsoluteLimit()
				+ " Individual Value: " + resource.getIndividualLimit() + " ReservedList: "
				+ resource.reservedList.toString() + " WL: " + resource.wl.toString());
	}

	/**
	 * Cancel the user 'units' for the given resource. If unsuccessful for whatever
	 * reason, throw an exception
	 * 
	 * @param resource
	 * @param confirmationNumber
	 */
	public void cancel(String resourceName, int confirmationNumber) {		
		// If there are WL elements, moving the corresponding "units" to confirmed list.
		Resource resource = resources.getResource(resourceName);
		Iterator<Integer> iterator = resource.reservedList.iterator();
		int count;
		for (count = 0 ; iterator.hasNext(); ) {
			Integer cn = iterator.next();
			if (cn == confirmationNumber) {
				count++;
			}
		}
		
		ArrayList<Integer> remove = new ArrayList<Integer>();
		remove.add(confirmationNumber);
		System.out.println("RemoveList is" + remove);

		// Remove the requested confirmationNumber.
		resource.reservedList.removeAll(remove);
		
		// Now move from WL to reservedList based on the count we found!
		
		for (int i = 0; i < count && !resource.wl.isEmpty(); i++) {
			int value = resource.wl.remove();
			resource.reservedList.add(value);
		}
		
	}

}
