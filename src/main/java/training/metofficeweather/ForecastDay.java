package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastDay {
    @JsonProperty(value="Rep")
    private ForecastBlock[] forecastBlocks;
    @JsonProperty(value="value")
    private String date;


    public ForecastBlock[] getForecastBlocks() {
        return forecastBlocks;
    }

    public String getDate() {
        return date;
    }
}
