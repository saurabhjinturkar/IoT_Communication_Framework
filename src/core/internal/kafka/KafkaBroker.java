/**
 * 
 */
package core.internal.kafka;

import java.util.Properties;
import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import core.internal.AbstractBroker;

/**
 * @author Saurabh
 *
 */
public class KafkaBroker extends AbstractBroker {
	private static KafkaProducer<String, String> producer;

	@Override
	public void init() {
		super.init();
		Properties props = new Properties();
		props.put("bootstrap.servers", "54.69.1.169:9092");
		props.put("key.serializer",
		    "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer",
		    "org.apache.kafka.common.serialization.StringSerializer");
		props.put("request.required.acks", "1");
		producer = new KafkaProducer<String, String>(props);
	}

	@Override
	public void close() {
		super.close();
		producer.close();
	}

	@Override
	public void publish(String data, String topic) {
		super.publish(data, topic);
		ProducerRecord<String, String> datapacket = new ProducerRecord<String, String>(
		    topic, "1", data);

		Future<RecordMetadata> rs = producer.send(datapacket,
		    new org.apache.kafka.clients.producer.Callback() {

			    @Override
			    public void onCompletion(RecordMetadata recordMetadata,
			        Exception arg1) {
				    System.out.println("Record stored successfully!");
			    }
		    });

		String msg = null;
		try {
			RecordMetadata rm = rs.get();
			msg = msg + " partition = " + rm.partition() + " offset ="
			    + rm.offset();
			System.out.println(msg);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void fetch() {
	    super.fetch();
	    
	}
}
