package mariavv.airlinedirectory.service;

import mariavv.airlinedirectory.domain.dto.AirlineResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AirlineService {
    List<AirlineResponse> getByName(String name, Pageable pageable);
    List<AirlineResponse> getByIataCode(String iataCode);
    List<AirlineResponse> getByIcaoCode(String icaoCode);
}
