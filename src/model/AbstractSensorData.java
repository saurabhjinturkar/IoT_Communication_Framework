package model;

import java.io.Serializable;

/**
 * 
 * @author Saurabh
 *
 */
public abstract class AbstractSensorData implements Serializable, ISensorData {

	protected static final long serialVersionUID = 1L;
	protected int priority;

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
