package ua.lviv.iot.model;

public class FootballField extends SportBuild {

    private RoofType roofType;
    private String colorOfField;
    private int countOfVipPlaces;

    public FootballField() {
        this(0,0,null,0,null,null,null,0);
    }

    public FootballField(final int numberOfSeats, final int yearOfFoundation, final String location,
                         final int scaleOfField, final String nameOfSport, final RoofType roofType,
                         final String colorOfField, final int countOfVipPlaces) {
        super(numberOfSeats, yearOfFoundation, location, scaleOfField, nameOfSport);
        this.roofType = roofType;
        this.colorOfField = colorOfField;
        this.countOfVipPlaces = countOfVipPlaces;
    }

    public final String getHeaders() {
        return super.getHeaders() + "," + " roofType" + "," + " colorOfField " + "," + "countOfVipPlaces";
    }

    public final String toCSV() {
        return super.toCSV() + "," + " roofType = " + getRoofType() + ","
                + " colorOfField = " + getColorOfField()
                + " countOfVipPlaces = " + getCountOfVipPlaces();
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
}