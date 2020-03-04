package ua.lviv.iot.model;

public class SportBuild {
    private int numberOfSeats;
    private int yearOfFoundation;
    private String location;
    private int scaleOfField;

    public SportBuild() {

    }

    public SportBuild(int numberOfSeats, int yearOfFoundation, String location, int scaleOfField) {
        this.numberOfSeats = numberOfSeats;
        this.yearOfFoundation = yearOfFoundation;
        this.location = location;
        this.scaleOfField = scaleOfField;
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
}




