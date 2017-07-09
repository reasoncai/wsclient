/**
 * FlightInfoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class FlightInfoLocator extends org.apache.axis.client.Service implements mypackage.FlightInfo {

    public FlightInfoLocator() {
    }


    public FlightInfoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FlightInfoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FlightInfoHttpSoap11Endpoint
    private java.lang.String FlightInfoHttpSoap11Endpoint_address = "http://219.135.189.180:8080/axis2/services/FlightInfo.FlightInfoHttpSoap11Endpoint/";

    public java.lang.String getFlightInfoHttpSoap11EndpointAddress() {
        return FlightInfoHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FlightInfoHttpSoap11EndpointWSDDServiceName = "FlightInfoHttpSoap11Endpoint";

    public java.lang.String getFlightInfoHttpSoap11EndpointWSDDServiceName() {
        return FlightInfoHttpSoap11EndpointWSDDServiceName;
    }

    public void setFlightInfoHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        FlightInfoHttpSoap11EndpointWSDDServiceName = name;
    }

    public mypackage.FlightInfoPortType getFlightInfoHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FlightInfoHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFlightInfoHttpSoap11Endpoint(endpoint);
    }

    public mypackage.FlightInfoPortType getFlightInfoHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.FlightInfoSoap11BindingStub _stub = new mypackage.FlightInfoSoap11BindingStub(portAddress, this);
            _stub.setPortName(getFlightInfoHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFlightInfoHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        FlightInfoHttpSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for FlightInfoHttpSoap12Endpoint
    private java.lang.String FlightInfoHttpSoap12Endpoint_address = "http://219.135.189.180:8080/axis2/services/FlightInfo.FlightInfoHttpSoap12Endpoint/";

    public java.lang.String getFlightInfoHttpSoap12EndpointAddress() {
        return FlightInfoHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FlightInfoHttpSoap12EndpointWSDDServiceName = "FlightInfoHttpSoap12Endpoint";

    public java.lang.String getFlightInfoHttpSoap12EndpointWSDDServiceName() {
        return FlightInfoHttpSoap12EndpointWSDDServiceName;
    }

    public void setFlightInfoHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        FlightInfoHttpSoap12EndpointWSDDServiceName = name;
    }

    public mypackage.FlightInfoPortType getFlightInfoHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FlightInfoHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFlightInfoHttpSoap12Endpoint(endpoint);
    }

    public mypackage.FlightInfoPortType getFlightInfoHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.FlightInfoSoap12BindingStub _stub = new mypackage.FlightInfoSoap12BindingStub(portAddress, this);
            _stub.setPortName(getFlightInfoHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFlightInfoHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        FlightInfoHttpSoap12Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.FlightInfoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.FlightInfoSoap11BindingStub _stub = new mypackage.FlightInfoSoap11BindingStub(new java.net.URL(FlightInfoHttpSoap11Endpoint_address), this);
                _stub.setPortName(getFlightInfoHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (mypackage.FlightInfoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.FlightInfoSoap12BindingStub _stub = new mypackage.FlightInfoSoap12BindingStub(new java.net.URL(FlightInfoHttpSoap12Endpoint_address), this);
                _stub.setPortName(getFlightInfoHttpSoap12EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FlightInfoHttpSoap11Endpoint".equals(inputPortName)) {
            return getFlightInfoHttpSoap11Endpoint();
        }
        else if ("FlightInfoHttpSoap12Endpoint".equals(inputPortName)) {
            return getFlightInfoHttpSoap12Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Control.nair.com", "FlightInfo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Control.nair.com", "FlightInfoHttpSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://Control.nair.com", "FlightInfoHttpSoap12Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FlightInfoHttpSoap11Endpoint".equals(portName)) {
            setFlightInfoHttpSoap11EndpointEndpointAddress(address);
        }
        else 
if ("FlightInfoHttpSoap12Endpoint".equals(portName)) {
            setFlightInfoHttpSoap12EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
