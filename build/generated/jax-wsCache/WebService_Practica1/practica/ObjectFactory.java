
package practica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the practica package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AgregarLibro_QNAME = new QName("http://Practica/", "agregar_libro");
    private final static QName _AgregarEstudiante_QNAME = new QName("http://Practica/", "agregar_estudiante");
    private final static QName _AgregarLibroResponse_QNAME = new QName("http://Practica/", "agregar_libroResponse");
    private final static QName _AgregarEstudianteResponse_QNAME = new QName("http://Practica/", "agregar_estudianteResponse");
    private final static QName _AgregarAutorResponse_QNAME = new QName("http://Practica/", "agregar_autorResponse");
    private final static QName _AgregarAutor_QNAME = new QName("http://Practica/", "agregar_autor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: practica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarEstudianteResponse }
     * 
     */
    public AgregarEstudianteResponse createAgregarEstudianteResponse() {
        return new AgregarEstudianteResponse();
    }

    /**
     * Create an instance of {@link AgregarEstudiante }
     * 
     */
    public AgregarEstudiante createAgregarEstudiante() {
        return new AgregarEstudiante();
    }

    /**
     * Create an instance of {@link AgregarLibroResponse }
     * 
     */
    public AgregarLibroResponse createAgregarLibroResponse() {
        return new AgregarLibroResponse();
    }

    /**
     * Create an instance of {@link AgregarLibro }
     * 
     */
    public AgregarLibro createAgregarLibro() {
        return new AgregarLibro();
    }

    /**
     * Create an instance of {@link AgregarAutor }
     * 
     */
    public AgregarAutor createAgregarAutor() {
        return new AgregarAutor();
    }

    /**
     * Create an instance of {@link AgregarAutorResponse }
     * 
     */
    public AgregarAutorResponse createAgregarAutorResponse() {
        return new AgregarAutorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarLibro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Practica/", name = "agregar_libro")
    public JAXBElement<AgregarLibro> createAgregarLibro(AgregarLibro value) {
        return new JAXBElement<AgregarLibro>(_AgregarLibro_QNAME, AgregarLibro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Practica/", name = "agregar_estudiante")
    public JAXBElement<AgregarEstudiante> createAgregarEstudiante(AgregarEstudiante value) {
        return new JAXBElement<AgregarEstudiante>(_AgregarEstudiante_QNAME, AgregarEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarLibroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Practica/", name = "agregar_libroResponse")
    public JAXBElement<AgregarLibroResponse> createAgregarLibroResponse(AgregarLibroResponse value) {
        return new JAXBElement<AgregarLibroResponse>(_AgregarLibroResponse_QNAME, AgregarLibroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Practica/", name = "agregar_estudianteResponse")
    public JAXBElement<AgregarEstudianteResponse> createAgregarEstudianteResponse(AgregarEstudianteResponse value) {
        return new JAXBElement<AgregarEstudianteResponse>(_AgregarEstudianteResponse_QNAME, AgregarEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Practica/", name = "agregar_autorResponse")
    public JAXBElement<AgregarAutorResponse> createAgregarAutorResponse(AgregarAutorResponse value) {
        return new JAXBElement<AgregarAutorResponse>(_AgregarAutorResponse_QNAME, AgregarAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Practica/", name = "agregar_autor")
    public JAXBElement<AgregarAutor> createAgregarAutor(AgregarAutor value) {
        return new JAXBElement<AgregarAutor>(_AgregarAutor_QNAME, AgregarAutor.class, null, value);
    }

}
