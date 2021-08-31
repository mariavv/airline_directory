package mariavv.airlinedirectory.domain.dto;

public class AllianceResponse {
    private final Integer id;
    private final String name;

    public AllianceResponse(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
