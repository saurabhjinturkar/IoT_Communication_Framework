/**
 * 
 */
package sensor_project;

import model.AbstractSensorData;

/**
 * @author Saurabh
 *
 */
public interface IDataBuilder {

	public AbstractSensorData build(String json, Class<? extends AbstractSensorData> clazz);
}
