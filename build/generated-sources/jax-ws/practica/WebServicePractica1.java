
package practica;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebService_Practica1", targetNamespace = "http://Practica/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServicePractica1 {


    /**
     * 
     * @param radio
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://Practica/", className = "practica.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://Practica/", className = "practica.SumaResponse")
    @Action(input = "http://Practica/WebService_Practica1/sumaRequest", output = "http://Practica/WebService_Practica1/sumaResponse")
    public String suma(
        @WebParam(name = "radio", targetNamespace = "")
        int radio);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://Practica/", className = "practica.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://Practica/", className = "practica.HelloResponse")
    @Action(input = "http://Practica/WebService_Practica1/helloRequest", output = "http://Practica/WebService_Practica1/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
