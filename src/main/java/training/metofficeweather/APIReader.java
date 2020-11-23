package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class APIReader {

    @JsonProperty(value="Locations")
    private Locations locations;
    private String inputData;
    private Client client;
    private ObjectMapper objectMapper;

    public APIReader(){
        objectMapper = new ObjectMapper();
        client = ClientBuilder.newClient();
        inputData = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=42492468-7351-44a8-a25c-b3a7c4f10599")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
        client = ClientBuilder.newBuilder().register(JacksonFeature.class).build();
    }

    public Locations getLocations() throws JsonProcessingException {
        locations = objectMapper.readValue(inputData, Root.class).getLocations();
        return locations;
    }
}
