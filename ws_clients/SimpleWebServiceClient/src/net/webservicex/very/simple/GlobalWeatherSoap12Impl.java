
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package net.webservicex.very.simple;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-27T09:17:19.242+02:00
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "GlobalWeather",
                      portName = "GlobalWeatherSoap12",
                      targetNamespace = "http://www.webserviceX.NET",
                      wsdlLocation = "file:/C:/Personal/Web Services Part 1/Source/WebServicesPart1/ws_clients/SimpleWebServiceClient/WeatherWSDL.wsdl",
                      endpointInterface = "net.webservicex.very.simple.GlobalWeatherSoap")
                      
public class GlobalWeatherSoap12Impl implements GlobalWeatherSoap {

    private static final Logger LOG = Logger.getLogger(GlobalWeatherSoap12Impl.class.getName());

    /* (non-Javadoc)
     * @see net.webservicex.very.simple.GlobalWeatherSoap#getCitiesByCountry(java.lang.String countryName)*
     */
    public java.lang.String getCitiesByCountry(java.lang.String countryName) { 
        LOG.info("Executing operation getCitiesByCountry");
        System.out.println(countryName);
        try {
            java.lang.String _return = "_return-1819458384";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.webservicex.very.simple.GlobalWeatherSoap#getWeather(java.lang.String cityName, java.lang.String countryName)*
     */
    public java.lang.String getWeather(java.lang.String cityName, java.lang.String countryName) { 
        LOG.info("Executing operation getWeather");
        System.out.println(cityName);
        System.out.println(countryName);
        try {
            java.lang.String _return = "_return1864873383";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}