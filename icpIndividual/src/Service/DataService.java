package Service;
import Model.Airline;
import Model.Airport;
import Model.Route;
import java.io.FileNotFoundException;
import java.util.List;

public interface DataService {

    List<Route> readRouteFile(String fileName) throws FileNotFoundException;

    List<Airline> readAirlineFile(String fileName) throws FileNotFoundException;

    List<Airport> readAirportFile(String fileName) throws FileNotFoundException;
}
