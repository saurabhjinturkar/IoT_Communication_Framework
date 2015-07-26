/**
 * 
 */
package sampleimplementation.sensor;

import java.util.UUID;

import model.AbstractSensorData;
import model.ISensorData;
import sensor_project.AbstractSensor;

/**
 * @author Saurabh
 *
 */
public class TemperatureSensor extends AbstractSensor {

	private long sensorId;
	
	public TemperatureSensor() {
		this.sensorId = UUID.randomUUID().getLeastSignificantBits();
	}
	
	public ISensorData sense() {
	    ISensorData data = new TemperatureData(sensorId);
	    return data;
    }
	
	public long getSensorId() {
	    return sensorId;
    }
}
