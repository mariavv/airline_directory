package mariavv.airlinedirectory.service.impl;

import mariavv.airlinedirectory.domain.dto.AllianceResponse;
import mariavv.airlinedirectory.repo.AllianceRepository;
import mariavv.airlinedirectory.service.AllianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AllianceServiceImpl implements AllianceService {
    private final AllianceRepository allianceRepository;

    @Autowired
    public AllianceServiceImpl(AllianceRepository allianceRepository) {
        this.allianceRepository = allianceRepository;
    }

    @Override
    public List<AllianceResponse> getAlliances() {
        return allianceRepository.findAll()
                .stream()
                .map(a -> new AllianceResponse(a.getId(), a.getName()))
                .collect(Collectors.toList());
    }
}
