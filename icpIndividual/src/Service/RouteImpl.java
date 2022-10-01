package Service;

import Model.Flight;
import Model.Route;

import java.util.*;

public class RouteImpl implements RouteService {

    @Override
    public List<Flight> createFlight(List<Route> routeList) {
        List<Flight> flightList = new ArrayList<>();
        for (Route route: routeList) {
            Flight flight = new Flight();
            flight.setAirlineCode(route.getAirlineCode());
            flight.setSourceAirportCode(route.getSourceAirportCode());
            flight.setDestinationAirportCode(route.getDestinationAirportCode());
            flight.setStops(route.getStops());
            flightList.add(flight);
        }

        return flightList;
    }

    @Override
    public String findPath(List<Flight> flightList, String sourceAirportCode, String destinationAirportCode) {

        Flight sourceFlight;

        while (true){
            sourceFlight = searchSource(flightList, sourceAirportCode);

            if(sourceFlight.getSourceAirportCode() == null || sourceFlight.getDestinationAirportCode() == null) {
                flightList.remove(sourceFlight);
                continue;
            }
            if(sourceFlight.getDestinationAirportCode().equals(destinationAirportCode)) {
                break;
            }
            flightList.remove(sourceFlight);
        }

        return sourceFlight.getSourceAirportCode() + " -> " + sourceFlight.getDestinationAirportCode();
    }

    @Override
    public List<Flight> findPaths(List<Flight> flightList, String sourceAirportCode, String destinationAirportCode) {
        List<Flight> flightPaths = new ArrayList<>();
        Flight sourceFlight = searchSource(flightList, sourceAirportCode);
        Flight destinationFlight = searchDestinationAirportCode(flightList,destinationAirportCode);

        while(true){
            if(sourceFlight.getDestinationAirportCode() == null && destinationFlight.getSourceAirportCode() == null) {
                flightList.remove(sourceFlight);
                flightList.remove(destinationFlight);
                continue;
            }

            if(sourceFlight.getDestinationAirportCode().equals(destinationFlight.getSourceAirportCode())) {
                System.out.println(sourceFlight.getSourceAirportCode() + " -> " + sourceFlight.getDestinationAirportCode());
                System.out.println(destinationFlight.getSourceAirportCode() + " -> " + destinationFlight.getDestinationAirportCode());
                break;
            }

            Flight nextFlight = searchSource(flightList,sourceFlight.getDestinationAirportCode());
            System.out.println(nextFlight.getSourceAirportCode()+ " to "+ nextFlight.getDestinationAirportCode());


            if (nextFlight.getDestinationAirportCode().equals(destinationFlight.getSourceAirportCode())){
                System.out.println(nextFlight.getSourceAirportCode() + " " + nextFlight.getDestinationAirportCode());
                break;
            }

            flightList.remove(nextFlight);


        }
        return new ArrayList<>();
    }

    @Override
    public Flight searchSource(List<Flight> flightList, String sourceAirportCode) {
        for(Flight flight: flightList) {
            if(flight.getSourceAirportCode().equals(sourceAirportCode)) return flight;
        }
        return new Flight();
    }

    @Override
    public Flight searchDestinationAirportCode(List<Flight> flightList, String destinationAirportCode) {
        for(Flight flight: flightList) {
            if(flight.getDestinationAirportCode().equals(destinationAirportCode)) return flight;
        }
        return new Flight();
    }






















}
