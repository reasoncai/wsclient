/**
 * FlightInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface FlightInfo extends javax.xml.rpc.Service {
    public java.lang.String getFlightInfoHttpSoap11EndpointAddress();

    public mypackage.FlightInfoPortType getFlightInfoHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public mypackage.FlightInfoPortType getFlightInfoHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getFlightInfoHttpSoap12EndpointAddress();

    public mypackage.FlightInfoPortType getFlightInfoHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException;

    public mypackage.FlightInfoPortType getFlightInfoHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
