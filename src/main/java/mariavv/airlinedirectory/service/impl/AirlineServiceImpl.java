package mariavv.airlinedirectory.service.impl;

import mariavv.airlinedirectory.domain.dto.AirlineResponse;
import mariavv.airlinedirectory.mapper.AirlineMapper;
import mariavv.airlinedirectory.repo.AirlineRepository;
import mariavv.airlinedirectory.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public AirlineResponse getAirlineByName(String name) {
        return airlineRepository.findByName(name)
                .stream()
                .map(airlineMapper::toResponse)
                .collect(Collectors.toList()).get(0);
    }

    @Transactional(readOnly = true)
    @Override
    public AirlineResponse getAirlineByIataCode(String iataCode) {
        return airlineRepository.findByIataCode(iataCode)
                .stream()
                .map(airlineMapper::toResponse)
                .collect(Collectors.toList()).get(0);
    }

    @Transactional(readOnly = true)
    @Override
    public AirlineResponse getAirlineByIcaoCode(String icaoCode) {
        return airlineRepository.findByIcaoCode(icaoCode)
                .stream()
                .map(airlineMapper::toResponse)
                .collect(Collectors.toList()).get(0);
    }
}
