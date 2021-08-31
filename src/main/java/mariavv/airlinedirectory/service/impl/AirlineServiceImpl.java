package mariavv.airlinedirectory.service.impl;

import com.sun.istack.NotNull;
import mariavv.airlinedirectory.domain.dto.AirlineResponse;
import mariavv.airlinedirectory.mapper.AirlineMapper;
import mariavv.airlinedirectory.repo.AirlineRepository;
import mariavv.airlinedirectory.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AirlineServiceImpl implements AirlineService {
    private final AirlineRepository airlineRepository;
    private final AirlineMapper airlineMapper;

    @Autowired
    public AirlineServiceImpl(AirlineRepository airlineRepository, AirlineMapper airlineMapper) {
        this.airlineRepository = airlineRepository;
        this.airlineMapper = airlineMapper;
    }

    @Transactional(readOnly = true)
    @Override
    public List<AirlineResponse> getAirlineByName(@NotNull String name) {
        return airlineRepository.findByName(name)
                .stream()
                .map(airlineMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Override
    public List<AirlineResponse> getAirlineByIataCode(@NotNull String iataCode) {
        return airlineRepository.findByIataCode(iataCode)
                .stream()
                .map(airlineMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Override
    public List<AirlineResponse> getAirlineByIcaoCode(@NotNull String icaoCode) {
        return airlineRepository.findByIcaoCode(icaoCode)
                .stream()
                .map(airlineMapper::toResponse)
                .collect(Collectors.toList());
    }
}
