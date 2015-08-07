/**
 * 
 */
package core.internal.paho;

import migration.IReceiver;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import core.internal.AbstractBroker;

/**
 * @author Saurabh
 *
 */
public class PahoBroker extends AbstractBroker implements MqttCallback{

	public void addReceiver(IReceiver receiver) {
	    // TODO Auto-generated method stub
	    
    }

	public void removeReceiver(IReceiver receiver) {
	    // TODO Auto-generated method stub
	    
    }

	public void removeAllReceivers() {
	    // TODO Auto-generated method stub
	    
    }

	public void connectionLost(Throwable arg0) {
	    // TODO Auto-generated method stub
	    
    }

	public void deliveryComplete(IMqttDeliveryToken arg0) {
	    // TODO Auto-generated method stub
	    
    }

	public void messageArrived(String arg0, MqttMessage arg1) throws Exception {
	    // TODO Auto-generated method stub
	    
    }
}
