package mariavv.airlinedirectory.service.impl;

import mariavv.airlinedirectory.domain.dto.AirlineResponse;
import mariavv.airlinedirectory.mapper.AirlineMapper;
import mariavv.airlinedirectory.repo.AirlineRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class AirlineServiceImplTest extends BaseTest {
    @InjectMocks
    private AirlineServiceImpl airlineService;

    @Mock
    private AirlineRepository airlineRepository;

    @Mock
    private AirlineMapper airlineMapper;

    private List<AirlineResponse> testData;

    @BeforeEach
    void setUp() {
        prepareTestData();
    }

    private void prepareTestData() {
        testData = new ArrayList<>();
        testData.add(new AirlineResponse(1000L, 1, "AB", "AC", false,
                "BritishAirlines", "britishairlines.com"));
        testData.add(new AirlineResponse(1001L, 1, "BA", "BC", true,
                "Pobeda", "pobeda.com"));
        testData.add(new AirlineResponse(1002L, 2, "CA", "CB", false,
                "AmericanAirlines", "americanairlines.com"));
    }

    @Test
    void getByIataCode() {
        String iataCode = "AB";

        List<AirlineResponse> list = testData.stream()
                .filter(e -> e.getIataCode().equals(iataCode))
                .collect(Collectors.toList());

        when(airlineMapper.toResponseList(airlineRepository.findByIataCode(iataCode)))
                .thenReturn(list);

        List<AirlineResponse> airlines = airlineService.getByIataCode(iataCode);

        assertNotNull(airlines);
        assertEquals(list, airlines);
    }

    @Test
    void getByName() {
        String name = "Air";

        List<AirlineResponse> list = testData.stream()
                .filter(e -> e.getName().contains(name))
                .collect(Collectors.toList());

        when(airlineMapper.toResponseList(airlineRepository.findByNameContains(name)))
                .thenReturn(list);

        List<AirlineResponse> airlines = airlineService.getByName(name);

        assertNotNull(airlines);
        assertEquals(list, airlines);
    }
}
