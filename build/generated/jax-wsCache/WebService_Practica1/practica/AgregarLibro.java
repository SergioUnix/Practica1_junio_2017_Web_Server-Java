
package practica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agregar_libro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agregar_libro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="no_ejemplar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paginas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cod_autor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cod_estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agregar_libro", propOrder = {
    "nombre",
    "noEjemplar",
    "paginas",
    "tema",
    "codAutor",
    "codEstado"
})
public class AgregarLibro {

    protected String nombre;
    @XmlElement(name = "no_ejemplar")
    protected int noEjemplar;
    protected int paginas;
    protected String tema;
    @XmlElement(name = "cod_autor")
    protected int codAutor;
    @XmlElement(name = "cod_estado")
    protected int codEstado;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad noEjemplar.
     * 
     */
    public int getNoEjemplar() {
        return noEjemplar;
    }

    /**
     * Define el valor de la propiedad noEjemplar.
     * 
     */
    public void setNoEjemplar(int value) {
        this.noEjemplar = value;
    }

    /**
     * Obtiene el valor de la propiedad paginas.
     * 
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * Define el valor de la propiedad paginas.
     * 
     */
    public void setPaginas(int value) {
        this.paginas = value;
    }

    /**
     * Obtiene el valor de la propiedad tema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTema() {
        return tema;
    }

    /**
     * Define el valor de la propiedad tema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTema(String value) {
        this.tema = value;
    }

    /**
     * Obtiene el valor de la propiedad codAutor.
     * 
     */
    public int getCodAutor() {
        return codAutor;
    }

    /**
     * Define el valor de la propiedad codAutor.
     * 
     */
    public void setCodAutor(int value) {
        this.codAutor = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstado.
     * 
     */
    public int getCodEstado() {
        return codEstado;
    }

    /**
     * Define el valor de la propiedad codEstado.
     * 
     */
    public void setCodEstado(int value) {
        this.codEstado = value;
    }

}
