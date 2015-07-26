/**
 * 
 */
package sampleimplementation.sensor;

import util.JsonFormatter;

/**
 * @author Saurabh
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creating 5 temperature sensors
		
		TemperatureSensor sensor1 = new TemperatureSensor();
		TemperatureSensor sensor2 = new TemperatureSensor();
		TemperatureSensor sensor3 = new TemperatureSensor();
		TemperatureSensor sensor4 = new TemperatureSensor();
		TemperatureSensor sensor5 = new TemperatureSensor();
		
		JsonFormatter formatter = new JsonFormatter();
		
		System.out.println(formatter.format(sensor1.sense()));
		System.out.println(formatter.format(sensor2.sense()));
		System.out.println(formatter.format(sensor3.sense()));
		System.out.println(formatter.format(sensor4.sense()));
		System.out.println(formatter.format(sensor5.sense()));
	}
}
