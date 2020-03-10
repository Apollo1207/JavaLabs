package ua.lviv.iot.model;

public class FootballField extends SportBuild {

    private RoofType roofType;
    private String typeOfField;
    private int countOfVipPlaces;

    public FootballField() {
    }

    public FootballField(final int numberOfSeats, final int yearOfFoundation, final String location,
                         final int scaleOfField, final String nameOfSport, final RoofType roofType,
                         final String typeOfField, final int countOfVipPlaces) {
        super(numberOfSeats, yearOfFoundation, location, scaleOfField, nameOfSport);
        this.roofType = roofType;
        this.typeOfField = typeOfField;
        this.countOfVipPlaces = countOfVipPlaces;
    }

    public final RoofType getRoofType() {
        return roofType;
    }

    public final void setRoofType(final RoofType roofType) {
        this.roofType = roofType;
    }

    public final String getTypeOfField() {
        return typeOfField;
    }

    public final void setTypeOfField(final String typeOfField) {
        this.typeOfField = typeOfField;
    }

    public final int getCountOfVipPlaces() {
        return countOfVipPlaces;
    }

    public final void setCountOfVipPlaces(final int countOfVipPlaces) {
        this.countOfVipPlaces = countOfVipPlaces;
    }
}