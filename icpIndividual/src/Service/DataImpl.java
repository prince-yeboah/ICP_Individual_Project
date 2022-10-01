package Service;
import Model.Airline;
import Model.Airport;
import Model.Route;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataImpl implements DataService{
    //https://www.javatpoint.com/how-to-read-csv-file-in-java

    @Override
    public List<Route> readRouteFile(String fileName) throws FileNotFoundException {
        //Parsing CSV file using Scanner
        Scanner scan = new Scanner(new File( "src/"+fileName));
        List<Route> routeList = new ArrayList<>();

        while (scan.hasNext()) {
            String row = (scan.next());
            String[] data = row.split(",");

            for (int i=0; i< data.length; i++) {
                if(data[i].equals("\\N")) {
                    data[i] = "-1";
                }
            }
            if (data.length == 9) {
                Route route = new Route(data[0], Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), data[4],
                        Integer.parseInt(data[5]), data[6], Integer.parseInt(data[7]), data[8]);
                routeList.add(route);
            }
        }
        scan.close();
        return routeList;
    }

    @Override
    public List<Airline> readAirlineFile(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File( "src/"+fileName));
        scan.useDelimiter("\n");
        List<Airline> airlineList = new ArrayList<>();

        while (scan.hasNext()) {
            String row = (scan.next());
            String[] data = row.split(",");

            for (int i=0; i< data.length; i++) {
                if(data[i].equals("\\N")) {
                    data[i] = "-1";
                }
            }
            if (data.length == 8) {
                Airline airline = new Airline(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4],
                        data[5], data[6], data[7]);
                airlineList.add(airline);
            }
        }
        scan.close();
        return airlineList;
    }

    @Override
    public List<Airport> readAirportFile(String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File( "src/"+fileName));
        scan.useDelimiter("\n");
        List<Airport> airportList = new ArrayList<>();

        while (scan.hasNext()) {
            String row = (scan.next());
            String[] data = row.split(",");

            for (int i=0; i< data.length; i++) {
                if(data[i].equals("\\N")) {
                    data[i] = "-1";
                }
            }
            if (data.length == 14) {
                Airport airport = new Airport(Integer.parseInt(data[0]), data[1], data[2], data[3],
                        data[4],data[5], Double.parseDouble(data[6]), Double.parseDouble(data[7]), Integer.parseInt(data[8]),Double.parseDouble(data[9]),data[10],data[11],data[12],data[13]);
                airportList.add(airport);
            }
        }
        scan.close();
        return airportList;
    }
}
