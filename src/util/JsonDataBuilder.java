/**
 * 
 */
package util;

import model.AbstractSensorData;
import sensor_project.IDataBuilder;

import com.google.gson.Gson;

/**
 * @author Saurabh
 *
 */
public class JsonDataBuilder implements IDataBuilder {

	/* (non-Javadoc)
	 * @see sensor_project.IDataBuilder#build(java.lang.String, java.lang.Class)
	 */
	public AbstractSensorData build(String json, Class<? extends AbstractSensorData> clazz) {
		Gson gson = new Gson();
		return gson.fromJson(json, clazz);
	}
}
