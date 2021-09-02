package mariavv.airlinedirectory.domain.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class AirlineRequest {
    @Min(2)
    private final String alliance;
    private final String iataCode;
    private final String icaoCode;
    private final Boolean lowCostCarrier;
    @NotNull
    @Min(2)
    private final String name;
    private final String website;

    @JsonCreator
    public AirlineRequest(String alliance, String iataCode, String icaoCode, Boolean lowCostCarrier, String name, String website) {
        this.alliance = alliance;
        this.iataCode = iataCode;
        this.icaoCode = icaoCode;
        this.lowCostCarrier = lowCostCarrier;
        this.name = name;
        this.website = website;
    }

    public String getAllianceId() {
        return alliance;
    }

    public String getIataCode() {
        return iataCode;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public Boolean getLowCostCarrier() {
        return lowCostCarrier;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }
}
