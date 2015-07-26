/**
 * 
 */
package sampleimplementation.sensor;

import java.util.Date;

import model.AbstractSensorData;
import sensor_project.PriorityLevel;

/**
 * @author Saurabh
 *
 */
public class TemperatureData extends AbstractSensorData {

	private static final long serialVersionUID = 1L;

	private double temperature;
	private Date timestamp;
    private long sensorId;
	
	public TemperatureData(long sensorID) {
		priority = PriorityLevel.MEDIUM;
		timestamp = new Date();
		senseTemperature();
		this.sensorId = sensorID;
	}

	private void senseTemperature() {
		temperature = Math.random() * (10* Math.random());
	}
	
	public double getTemperature() {
	    return temperature;
    }
	
	public void setTemperature(double temperature) {
	    this.temperature = temperature;
    }
	
	public Date getTimestamp() {
	    return timestamp;
    }

	@Override
    public String toString() {
	    return "TemperatureData [temperature=" + temperature + ", timestamp="
	        + timestamp + ", sensorId=" + sensorId + "Priority=" + priority +"]";
    }
}
