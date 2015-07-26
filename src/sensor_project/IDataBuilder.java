/**
 * 
 */
package sensor_project;

/**
 * @author Saurabh
 *
 */
public interface IDataBuilder {

	public AbstractSensorData build(String json, Class<? extends AbstractSensorData> clazz);
}
