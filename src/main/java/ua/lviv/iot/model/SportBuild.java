package ua.lviv.iot.model;

public class SportBuild {
    private int numberOfSeats;
    private int yearOfFoundation;
    private String loctaion;
    private int scaleOfField;

    public SportBuild() {

    }

    public SportBuild(int numberOfSeats, int yearOfFoundation, String loctaion, int scaleOfField) {
        this.numberOfSeats = numberOfSeats;
        this.yearOfFoundation = yearOfFoundation;
        this.loctaion = loctaion;
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

    public String getLoctaion() {
        return loctaion;
    }

    public void setLoctaion(String loctaion) {
        this.loctaion = loctaion;
    }

    public int getScaleOfField() {
        return scaleOfField;
    }

    public void setScaleOfField(int scaleOfField) {
        this.scaleOfField = scaleOfField;
    }
}




