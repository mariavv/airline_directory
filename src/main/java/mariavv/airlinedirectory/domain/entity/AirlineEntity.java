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
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "alliance_id", referencedColumnName = "id")
    private AllianceEntity alliance;

    @Column(name = "iata_code")
    private Integer iataCode;

    @Column(name = "icao_code")
    private Integer icaoCode;

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

    public Integer getId() {
        return id;
    }

    public AllianceEntity getAlliance() {
        return alliance;
    }

    public Integer getIataCode() {
        return iataCode;
    }

    public Integer getIcaoCode() {
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

    public void setIataCode(Integer iataCode) {
        this.iataCode = iataCode;
    }

    public void setIcaoCode(Integer icaoCode) {
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