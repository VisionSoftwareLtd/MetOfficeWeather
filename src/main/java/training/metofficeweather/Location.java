package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    public void display() {
        System.out.println(name);
    }
}
