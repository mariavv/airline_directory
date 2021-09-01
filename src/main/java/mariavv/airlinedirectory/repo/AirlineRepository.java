package mariavv.airlinedirectory.repo;

import mariavv.airlinedirectory.domain.entity.AirlineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirlineRepository extends JpaRepository<AirlineEntity, Integer> {
    List<AirlineEntity> findByNameContains(String name);

    List<AirlineEntity> findByIataCode(String iataCode);

    List<AirlineEntity> findByIcaoCode(String icaoCode);
}