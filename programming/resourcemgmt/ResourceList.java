package programming.resourcemgmt;

import java.util.Hashtable;

public class ResourceList {
	
	// Name of the resource is the key, value is the actual resource
	private Hashtable<String, Resource> resources;
	
	public ResourceList() {
		resources = new Hashtable<String, Resource>();
	}
	
	public void createResource(String resourceName, int absLimit, int indvlLimit) {
		Resource resource = new Resource();
		
		resource.setName(resourceName);
		resource.setAbsoluteLimit(absLimit);
		resource.setIndividualLimit(indvlLimit);
		
		resources.put(resourceName, resource);
		
	}
	
	public Resource getResource(String name) {
		return (resources.get(name));
	}

}
