package mariavv.airlinedirectory.domain.dto;

public class AirlineResponse {
    private final Long id;
    private final Integer allianceId;
    private final String iataCode;
    private final String icaoCode;
    private final Boolean lowCostCarrier;
    private final String name;
    private final String website;

    public AirlineResponse(Long id, Integer allianceId, String iataCode, String icaoCode, Boolean lowCostCarrier, String name, String website) {
        this.id = id;
        this.allianceId = allianceId;
        this.iataCode = iataCode;
        this.icaoCode = icaoCode;
        this.lowCostCarrier = lowCostCarrier;
        this.name = name;
        this.website = website;
    }

    public Long getId() {
        return id;
    }

    public Integer getAllianceId() {
        return allianceId;
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
