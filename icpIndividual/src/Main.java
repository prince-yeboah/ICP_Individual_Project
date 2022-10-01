import Model.Flight;
import Model.Route;
import Service.*;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            ArrayList<Airport> airports = readAirportData();
            // System.out.println(airports.size());
            ArrayList<Airline> airlines = readAirlineData();
            // System.out.println(airlines.size());
            ArrayList<Route> routes = readRouteData();
            // System.out.println(routes.size());
          
            Scanner scanner = new Scanner(System.in);
          
            // Ask for file name from the terminal
            System.out.print("Enter input file name: ");
            String inputFileName = scanner.nextLine();
            scanner.close();
          
            // try to read city names from the file
            try {
             scanner = new Scanner(new File(inputFileName));
             
             String outputFileName = getOutputFileName(inputFileName);
             PrintWriter printWriter = new PrintWriter(new File(outputFileName));
          
             // read start and destination
             String sourceLocation = scanner.nextLine();
             String destinationLocation = scanner.nextLine();
             scanner.close();
          
             // find airports
             Airport sourceAirport = searchAirport(sourceLocation, airports);
             Airport destinationAirport = searchAirport(destinationLocation, airports);
          
             // if either of them is null
             if (sourceAirport == null) {
              printWriter.println("Cannot find airport at " + sourceLocation);
             } else if (destinationAirport == null) {
              printWriter.println("Cannot find airport at " + destinationLocation);
             } else {
              // create graph
              Graph graph = new Graph(airports, routes);
              // find path
              ArrayList<Route> path = graph.findPath(sourceAirport, destinationAirport);
              // print path
              int numAdditionalStops = 0;
              int i = 0;
              int totalDistance = 0;
              for (Route route : path) {
               printWriter.println(
                 "\t" + (++i) + ". " + route.getAirlineCode() + " from " + route.getSourceAirportCode()
                   + " to " + route.getDestinationAirportCode() + " " + route.getStops() + " stops.");
               numAdditionalStops += route.getStops();
               totalDistance += graph.getDistance(
                 graph.findAirportById(Integer.parseInt(route.getSourceAirportID())),
                 graph.findAirportById(Integer.parseInt(route.getDestinationAirportID())));
              }
              printWriter.println("Total flights: " + i);
              printWriter.println("Total additional stops: " + numAdditionalStops);
              printWriter.println("Total distance: " + totalDistance + "km");
             }
        }


}
