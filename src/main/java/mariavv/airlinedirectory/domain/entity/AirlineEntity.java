package mariavv.airlinedirectory.domain.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "airline")
public class AirlineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "alliance_id", referencedColumnName = "id")
    private AllianceEntity alliance;

    @Column(name = "iata_code")
    private String iataCode;

    @Column(name = "icao_code")
    private String icaoCode;

    @Column(name = "low_cost_carrier")
    private Boolean lowCostCarrier;

    @Column(name = "name")
    private String name;

    @Column(name = "website")
    private String website;

    @CreationTimestamp
    @Column(name = "created")
    private LocalDateTime created;

    public AirlineEntity() {
    }

    public Long getId() {
        return id;
    }

    public AllianceEntity getAlliance() {
        return alliance;
    }

    public String getIataCode() {
        return iataCode;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public Boolean getLowCostCarrier() {
        return lowCostCarrier;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public void setAlliance(AllianceEntity alliance) {
        this.alliance = alliance;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public void setLowCostCarrier(Boolean lowCostCarrier) {
        this.lowCostCarrier = lowCostCarrier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}