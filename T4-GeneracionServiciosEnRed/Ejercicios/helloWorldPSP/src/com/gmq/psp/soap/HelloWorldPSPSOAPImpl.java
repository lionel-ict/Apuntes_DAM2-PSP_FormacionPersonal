
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.gmq.psp.soap;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-02-20T09:18:10.388+01:00
 * Generated source version: 3.3.5
 *
 */

@javax.jws.WebService(
                      serviceName = "helloWorldPSP",
                      portName = "helloWorldPSPSOAP",
                      targetNamespace = "http://www.example.org/helloWorldPSP/",
                      wsdlLocation = "file:/Users/Raul.Camarero/Documents/PSP/T4-GeneracionServiciosEnRed/Ejercicios/helloWorldPSP/helloWorldPSP.wsdl",
                      endpointInterface = "com.gmq.psp.soap.HelloWorldPSP")

public class HelloWorldPSPSOAPImpl implements HelloWorldPSP {

    private static final Logger LOG = Logger.getLogger(HelloWorldPSPSOAPImpl.class.getName());

    /* (non-Javadoc)
     * @see com.gmq.psp.soap.HelloWorldPSP#goodbye(java.lang.String name, java.lang.String procedence)*
     */
    public java.lang.String goodbye(java.lang.String name, java.lang.String procedence) {
        LOG.info("Executing operation goodbye");
        System.out.println(name);
        System.out.println(procedence);
        try {
            java.lang.String _return = "_return1472620685";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.gmq.psp.soap.HelloWorldPSP#hello(java.lang.String name)*
     */
    public java.lang.String hello(java.lang.String name) {
        LOG.info("Executing operation hello");
        System.out.println(name);
        try {
            java.lang.String _return = "_return1888889259";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}