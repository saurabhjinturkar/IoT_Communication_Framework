package sensor_project;

import java.io.Serializable;

/**
 * 
 * @author Saurabh
 *
 */
public abstract class AbstractSensorData implements Serializable, ISensorData {
	private PriorityLevel priority;
	
	public PriorityLevel getPriority() {
	    return priority;
    }
	
	public void setPriority(PriorityLevel priority) {
	    this.priority = priority;
    }
}
