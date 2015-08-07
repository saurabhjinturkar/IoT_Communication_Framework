/**
 * 
 */
package core.internal;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import migration.IReceiver;
import core.IProducerBroker;
import core.IReceiverBroker;

/**
 * @author Saurabh
 *
 */
public abstract class AbstractBroker implements IProducerBroker,
    IReceiverBroker {

	protected List<IReceiver> receivers;
	private static final Logger log = Logger.getLogger(AbstractBroker.class
	    .getName());

	/**
	 * 
	 */
	public AbstractBroker() {

		receivers = new LinkedList<IReceiver>();
	}

	public void init() {
		// TODO Auto-generated method stub

	}

	public void close() {
		// TODO Auto-generated method stub

	}

	public void fetch() {
		// TODO Auto-generated method stub

	}

	public void addReceiver(IReceiver receiver) {
		receivers.add(receiver);
		log.log(Level.INFO, receiver + " added to " + this);
	}

	public void removeReceiver(IReceiver receiver) {
		receivers.remove(receiver);
		log.log(Level.INFO, receiver + "removed from " + this);

	}

	public void removeAllReceivers() {
		receivers.clear();
		log.log(Level.INFO, "Receivers cleared from" + this);
	}

	public void publish(String data, String topic) {
		// TODO Auto-generated method stub

	}

}
