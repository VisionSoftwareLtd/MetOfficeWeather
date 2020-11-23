package training.metofficeweather;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        APIHandler api = new APIHandler();
        Locations locations = api.getLocations();
        locations.printAll();
    }
}	
