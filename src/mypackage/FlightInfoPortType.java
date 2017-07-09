/**
 * FlightInfoPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface FlightInfoPortType extends java.rmi.Remote {
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public java.lang.String getFlightInfoByNOandSTD(java.lang.String flight_no, java.lang.String std) throws java.rmi.RemoteException;
}
