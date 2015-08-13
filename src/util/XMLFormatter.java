/**
 * 
 */
package util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import model.ISensorData;
import sensor_project.IDataFormatter;

/**
 * @author Saurabh
 *
 */
public class XMLFormatter implements IDataFormatter{

	public String format(ISensorData data) {
		try {
		JAXBContext context = JAXBContext.newInstance(data.getClass());

	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    m.marshal(data, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return null;
    }

}
