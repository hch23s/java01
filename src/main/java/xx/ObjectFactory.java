
package xx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the xx package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _HrResponse_QNAME = new QName("http://com/", "hrResponse");
	private final static QName _Hr_QNAME = new QName("http://com/", "hr");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: xx
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Hr }
	 * 
	 */
	public Hr createHr() {
		return new Hr();
	}

	/**
	 * Create an instance of {@link HrResponse }
	 * 
	 */
	public HrResponse createHrResponse() {
		return new HrResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link HrResponse }
	 * {@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://com/", name = "hrResponse")
	public JAXBElement<HrResponse> createHrResponse(HrResponse value) {
		return new JAXBElement<HrResponse>(_HrResponse_QNAME, HrResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Hr }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://com/", name = "hr")
	public JAXBElement<Hr> createHr(Hr value) {
		return new JAXBElement<Hr>(_Hr_QNAME, Hr.class, null, value);
	}

}
