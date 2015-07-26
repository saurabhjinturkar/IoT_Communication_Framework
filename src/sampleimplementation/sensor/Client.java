/**
 * 
 */
package sampleimplementation.sensor;

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
		
		System.out.println(sensor1.sense());
		System.out.println(sensor2.sense());
		System.out.println(sensor3.sense());
		System.out.println(sensor4.sense());
		System.out.println(sensor5.sense());
	}

}
