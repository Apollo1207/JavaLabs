package ua.lviv.iot.model;

import java.util.Objects;

public class FootballField extends SportBuild {

    private RoofType roofType;
    private String colorOfField;
    private int countOfVipPlaces;

    public FootballField(final int numberOfSeats, final int yearOfFoundation, final String location,
                         final int scaleOfField, final String nameOfSport, final RoofType roofType,
                         final String colorOfField, final int countOfVipPlaces) {
        super(numberOfSeats, yearOfFoundation, location, scaleOfField, nameOfSport);
        this.roofType = roofType;
        this.colorOfField = colorOfField;
        this.countOfVipPlaces = countOfVipPlaces;
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "RoofType:" + ", " + "ColorOfField:" + ", " + "CountOfVipPlaces:";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getRoofType()
                + ", " + getColorOfField()
                + ", " + getCountOfVipPlaces();
    }

    public final RoofType getRoofType() {
        return roofType;
    }

    public final void setRoofType(final RoofType roofType) {
        this.roofType = roofType;
    }

    public final String getColorOfField() {
        return colorOfField;
    }

    public final void setColorOfField(final String typeOfField) {
        this.colorOfField = typeOfField;
    }

    public final int getCountOfVipPlaces() {
        return countOfVipPlaces;
    }

    public final void setCountOfVipPlaces(final int countOfVipPlaces) {
        this.countOfVipPlaces = countOfVipPlaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FootballField that = (FootballField) o;
        return getCountOfVipPlaces() == that.getCountOfVipPlaces() &&
                getRoofType() == that.getRoofType() &&
                getColorOfField().equals(that.getColorOfField());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRoofType(), getColorOfField(), getCountOfVipPlaces());
    }

    @Override
    public String toString() {
        return "FootballField{" +
                "roofType=" + roofType +
                ", colorOfField='" + colorOfField + '\'' +
                ", countOfVipPlaces=" + countOfVipPlaces +
                '}';
    }
}


