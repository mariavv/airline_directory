package mariavv.airlinedirectory.domain.dto;

public class AirlineResponse {
    private final Integer id;
    private final Integer allianceId;
    private final Integer iataCode;
    private final Integer icaoCode;
    private final Boolean lowCostCarrier;
    private final String name;
    private final String website;

    public AirlineResponse(Integer id, Integer allianceId, Integer iataCode, Integer icaoCode, Boolean lowCostCarrier, String name, String website) {
        this.id = id;
        this.allianceId = allianceId;
        this.iataCode = iataCode;
        this.icaoCode = icaoCode;
        this.lowCostCarrier = lowCostCarrier;
        this.name = name;
        this.website = website;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAllianceId() {
        return allianceId;
    }

    public Integer getIataCode() {
        return iataCode;
    }

    public Integer getIcaoCode() {
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
