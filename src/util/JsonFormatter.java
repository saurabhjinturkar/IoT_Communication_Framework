/**
 * 
 */
package util;

import model.ISensorData;
import sensor_project.IDataFormatter;

import com.google.gson.Gson;

/**
 * @author Saurabh
 *
 */
public class JsonFormatter implements IDataFormatter {

	/* (non-Javadoc)
	 * @see sensor_project.IDataFormatter#format(sensor_project.AbstractSensorData)
	 */
	public String format(ISensorData data) {
		Gson gson = new Gson();
		return gson.toJson(data);
	}
}
