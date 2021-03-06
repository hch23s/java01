
package xx;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
* Service01Service service = new Service01Service();
* Service01 portType = service.getService01Port();
* portType.hr(...);
 * </pre>
 * </p>
 * 
 */
@WebServiceClient(name = "Service01Service", targetNamespace = "http://com/", wsdlLocation = "http://10.10.14.51:8787/hello?wsdl")
public class Service01Service extends Service {

	private final static URL SERVICE01SERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(xx.Service01Service.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = xx.Service01Service.class.getResource(".");
			url = new URL(baseUrl, "http://10.10.14.51:8787/hello?wsdl");
		} catch (MalformedURLException e) {
			logger.warning(
					"Failed to create URL for the wsdl Location: 'http://10.10.14.51:8787/hello?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		SERVICE01SERVICE_WSDL_LOCATION = url;
	}

	public Service01Service(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public Service01Service() {
		super(SERVICE01SERVICE_WSDL_LOCATION, new QName("http://com/", "Service01Service"));
	}

	/**
	 * 
	 * @return returns Service01
	 */
	@WebEndpoint(name = "Service01Port")
	public Service01 getService01Port() {
		return super.getPort(new QName("http://com/", "Service01Port"), Service01.class);
	}

}
