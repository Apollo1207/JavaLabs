package ua.lviv.iot.model;

public class SportBuild {
    private int numberOfSeats;
    private int yearOfFoundation;
    private String location;
    private int scaleOfField;
    private String nameOfSport;

    public SportBuild() {
        this(0, 0, null, 0, null);
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
        return "numberOfSeats" + "," + " yearOfFoundation " + "," + " location" + "," + " scaleOfField" + "," + "nameOfSport";
    }

    public String toCSV() {
        return "typeOfProduct = " + getNumberOfSeats() + ","
                + " yearOfFoundation = " + getYearOfFoundation() + ","
                + " location = " + getLocation() + ","
                + " scaleOfField = " + getScaleOfField() + ","
                + "nameOfSport = " + getNameOfSport();
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


}




