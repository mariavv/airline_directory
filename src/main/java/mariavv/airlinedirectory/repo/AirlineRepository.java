package mariavv.airlinedirectory.repo;

import mariavv.airlinedirectory.domain.entity.AirlineEntity;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AirlineRepository extends JpaRepository<AirlineEntity, Integer> {
    PageImpl<List<AirlineEntity>> findByNameContains(String name, Pageable pageable);

    List<AirlineEntity> findByIataCode(String iataCode);

    List<AirlineEntity> findByIcaoCode(String icaoCode);
}