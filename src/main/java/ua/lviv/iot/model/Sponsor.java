package ua.lviv.iot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nameOfSponsor;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "SportBuild_Sponsors", joinColumns = {
            @JoinColumn(name = "sponsor_id", nullable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "sportBuild_id", nullable = false)})
    @JsonIgnoreProperties("sponsors")
    private Set<SportBuild> sportBuilds;


    public Sponsor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfSponsor() {
        return nameOfSponsor;
    }

    public void setNameOfSponsor(String nameOfSponsor) {
        this.nameOfSponsor = nameOfSponsor;
    }

    public Set<SportBuild> getSportBuilds() {
        return sportBuilds;
    }

    public void setSportBuilds(Set<SportBuild> sportBuilds) {
        this.sportBuilds = sportBuilds;
    }
}
