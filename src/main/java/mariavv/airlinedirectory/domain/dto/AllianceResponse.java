package mariavv.airlinedirectory.domain.dto;

public class AllianceResponse {
    private final Long id;
    private final String name;

    public AllianceResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
