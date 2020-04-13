package ua.lviv.iot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "\"country\"")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nameOfCountry;


    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("country")
    private Set<SportBuild> sportBuilds;

    public Country() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public Set<SportBuild> getSportBuilds() {
        return sportBuilds;
    }

    public void setSportBuilds(Set<SportBuild> sportBuilds) {
        this.sportBuilds = sportBuilds;
    }
}
