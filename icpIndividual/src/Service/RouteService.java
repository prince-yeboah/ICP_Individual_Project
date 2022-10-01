package Service;

import Model.Flight;
import Model.Route;

import java.util.List;

public interface RouteService {

   List<Flight> createFlight(List<Route> routeList);

   String findPath(List<Flight> flightList,  String sourceAirportCode, String destinationAirportCode );

   List<Flight> findPaths(List<Flight> flightList,  String sourceAirportCode, String destinationAirportCode );

   Flight searchSource(List<Flight> flightList, String sourceAirportCode);

   Flight searchDestinationAirportCode(List<Flight> flightList, String destinationAirportCode);

}
