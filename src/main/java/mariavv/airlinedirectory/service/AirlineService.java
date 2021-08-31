package mariavv.airlinedirectory.service;

import mariavv.airlinedirectory.domain.dto.AirlineResponse;

public interface AirlineService {
    AirlineResponse getAirlineByName(String name);
    AirlineResponse getAirlineByIataCode(String iataCode);
    AirlineResponse getAirlineByIcaoCode(String icaoCode);
}
