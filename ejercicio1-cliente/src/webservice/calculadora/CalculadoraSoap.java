package webservice.calculadora;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 3.1.0
 * 2015-05-28T12:59:11.603+02:00
 * Generated source version: 3.1.0
 * 
 */
@WebService(targetNamespace = "calculadora.webservice", name = "CalculadoraSoap")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculadoraSoap {

    @WebMethod
    @WebResult(name = "return", targetNamespace = "calculadora.webservice", partName = "return")
    public float multiply(
        @WebParam(partName = "a", name = "a")
        float a,
        @WebParam(partName = "b", name = "b")
        float b
    );

    @WebMethod
    @WebResult(name = "return", targetNamespace = "calculadora.webservice", partName = "return")
    public float substract(
        @WebParam(partName = "a", name = "a")
        float a,
        @WebParam(partName = "b", name = "b")
        float b
    );

    @WebMethod
    @WebResult(name = "return", targetNamespace = "calculadora.webservice", partName = "return")
    public float divide(
        @WebParam(partName = "a", name = "a")
        float a,
        @WebParam(partName = "b", name = "b")
        float b
    );

    @WebMethod
    @WebResult(name = "return", targetNamespace = "calculadora.webservice", partName = "return")
    public float sum(
        @WebParam(partName = "a", name = "a")
        float a,
        @WebParam(partName = "b", name = "b")
        float b
    );
}
