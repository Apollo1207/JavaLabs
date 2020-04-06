package ua.lviv.iot.model;

import javax.persistence.*;
import java.util.Objects;

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


    public final int getNumberOfSeats() {
        return numberOfSeats;
    }

    public final void setNumberOfSeats(final int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public final int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public final void setYearOfFoundation(final int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public final String getLocation() {
        return location;
    }

    public final void setLocation(final String location) {
        this.location = location;
    }

    public final int getScaleOfField() {
        return scaleOfField;
    }

    public final void setScaleOfField(final int scaleOfField) {
        this.scaleOfField = scaleOfField;
    }

    public final String getNameOfSport() {
        return nameOfSport;
    }

    public final void setNameOfSport(final String nameOfSport) {
        this.nameOfSport = nameOfSport;
    }

    public Integer getId() {
        return id;
    }

    public final void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportBuild that = (SportBuild) o;
        return getNumberOfSeats() == that.getNumberOfSeats() &&
                getYearOfFoundation() == that.getYearOfFoundation() &&
                getScaleOfField() == that.getScaleOfField() &&
                getLocation().equals(that.getLocation()) &&
                getNameOfSport().equals(that.getNameOfSport()) &&
                getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfSeats(), getYearOfFoundation(), getLocation(), getScaleOfField(), getNameOfSport(), getId());
    }

    @Override
    public String toString() {
        return "SportBuild{" +
                "numberOfSeats=" + numberOfSeats +
                ", yearOfFoundation=" + yearOfFoundation +
                ", location='" + location + '\'' +
                ", scaleOfField=" + scaleOfField +
                ", nameOfSport='" + nameOfSport + '\'' +
                ", id=" + id +
                '}';
    }
}




