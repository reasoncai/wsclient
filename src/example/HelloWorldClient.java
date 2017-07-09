package example;

import com.sun.corba.se.spi.activation.Activator;
import mypackage.FlightInfoLocator;
import mypackage.FlightInfoPortType;
import mypackage.FlightInfoSoap11BindingStub;


/**
 * Created by reason on 17/7/7.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          FlightInfoLocator locator = new FlightInfoLocator();
          FlightInfoSoap11BindingStub flightInfoHttpSoap11Endpoint = (FlightInfoSoap11BindingStub) locator.getFlightInfoHttpSoap11Endpoint();
          String aq1116 = flightInfoHttpSoap11Endpoint.getFlightInfoByNOandSTD("3", "2017/7/7 9:55:00");
          System.out.println(aq1116);

          FlightInfoPortType flightInfoHttpSoap12Endpoint = locator.getFlightInfoHttpSoap12Endpoint();
          String aq11161 = flightInfoHttpSoap12Endpoint.getFlightInfoByNOandSTD("AQ1115", "2017/7/6 8:15:00");
          System.out.println(aq11161);


          // If authorization is required
          //((FlightInfoSoap12BindingStub)service).setUsername("user3");
          //((FlightInfoSoap12BindingStub)service).setPassword("pass3");
          // invoke business method
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
