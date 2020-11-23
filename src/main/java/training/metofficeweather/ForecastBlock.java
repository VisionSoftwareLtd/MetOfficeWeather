package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastBlock {
    @JsonProperty(value="F")
    private String f;

    public String getF() {
        return f;
    }
}
