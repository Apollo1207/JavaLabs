package ua.lviv.iot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class SportBuild {
    private int numberOfSeats;
    private int yearOfFoundation;
    private String location;
    private int scaleOfField;
    private String nameOfSport;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    @JsonIgnoreProperties("sportBuilds")
    private Country country;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "SportBuild_Sponsors", joinColumns = {
            @JoinColumn(name = "sportBuild_id", nullable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "sponsor_id", nullable = true)})
    @JsonIgnoreProperties("sportBuilds")
    private Set<Sponsor> sponsors;

    public SportBuild() {
    }

    public SportBuild(final int numberOfSeats, final int yearOfFoundation,
                      final String location, final int scaleOfField, final String nameOfSport) {
        this.numberOfSeats = numberOfSeats;
        this.yearOfFoundation = yearOfFoundation;
        this.location = location;
        this.scaleOfField = scaleOfField;
        this.nameOfSport = nameOfSport;
    }

    public String getHeaders() {
        return "NumberOfSeats:" + ", " + "YearOfFoundation:" + ", " + "Location:" + ", " + "ScaleOfField:" + ", " + "NameOfSport:";
    }

    public String toCSV() {
        return getNumberOfSeats() + ", " + getYearOfFoundation() + ", "
                + getLocation() + ", " + getScaleOfField()
                + ", " + getNameOfSport();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getScaleOfField() {
        return scaleOfField;
    }

    public void setScaleOfField(int scaleOfField) {
        this.scaleOfField = scaleOfField;
    }

    public String getNameOfSport() {
        return nameOfSport;
    }

    public void setNameOfSport(String nameOfSport) {
        this.nameOfSport = nameOfSport;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setSponsors(Set<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

}




