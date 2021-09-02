package mariavv.airlinedirectory.mapper;

import mariavv.airlinedirectory.domain.dto.AirlineResponse;
import mariavv.airlinedirectory.domain.entity.AirlineEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring", imports = {AirlineEntity.class})
@Component
public interface AirlineMapper {
    AirlineResponse toResponse(AirlineEntity airline);
    List<AirlineResponse> toResponseList(List<AirlineEntity> airlines);
}
