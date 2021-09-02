package mariavv.airlinedirectory.service;

import mariavv.airlinedirectory.domain.dto.AirlineResponse;

import java.util.List;

public interface AirlineService {
    void overwrite(String name);
    List<AirlineResponse> getByName(String name);
    List<AirlineResponse> getByIataCode(String iataCode);
    List<AirlineResponse> getByIcaoCode(String icaoCode);
}
