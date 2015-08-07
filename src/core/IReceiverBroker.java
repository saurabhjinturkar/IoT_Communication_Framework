/**
 * 
 */
package core;

import migration.IReceiver;

/**
 * @author Saurabh
 *
 */
public interface IReceiverBroker extends IBaseBroker {

	public void fetch();

	public void addReceiver(IReceiver receiver);

	public void removeReceiver(IReceiver receiver);
	
	public void removeAllReceivers();
}
