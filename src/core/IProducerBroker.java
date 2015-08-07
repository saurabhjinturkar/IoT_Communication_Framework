/**
 * 
 */
package core;

/**
 * @author Saurabh
 *
 */
public interface IProducerBroker extends IBaseBroker {

	public void publish(String data, String topic);

	// There should be one more publish method with ip address, port etc
	// Above said method is required since it should be flexible for user to
	// pass IP address and port and make a publish call.
}
