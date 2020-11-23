package training.metofficeweather;

import com.fasterxml.jackson.core.JsonProcessingException;

public class TomosTesting {

    public static void main(String[] args) {
        APIReader reader = new APIReader();

        try {
            Locations locations = reader.getLocations();
            for(Location location: locations.getLocations()){
                System.out.println(location.getName());
            }
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
