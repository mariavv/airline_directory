package mariavv.airlinedirectory.service;

import mariavv.airlinedirectory.domain.dto.AirlineResponse;

import java.util.List;

public interface AirlineService {
    List<AirlineResponse> getAirlineByName(String name);
    List<AirlineResponse> getAirlineByIataCode(String iataCode);
    List<AirlineResponse> getAirlineByIcaoCode(String icaoCode);
}
