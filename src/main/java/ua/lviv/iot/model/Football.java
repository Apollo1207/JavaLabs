package ua.lviv.iot.model;

public class Football extends SportBuild {

    private RoofType roofType;
    private String typeOfField;
    private String nameOfBuild;

    public Football() {
    }

    public Football(int numberOfSeats, int yearOfFoundation, String loctaion, int scaleOfField, RoofType roofType, String typeOfField, String nameOfBuild) {
        super(numberOfSeats, yearOfFoundation, loctaion, scaleOfField);
        this.roofType = roofType;
        this.typeOfField = typeOfField;
        this.nameOfBuild = nameOfBuild;
    }

    public RoofType getRoofType() {
        return roofType;
    }

    public void setRoofType(RoofType roofType) {
        this.roofType = roofType;
    }

    public String getTypeOfField() {
        return typeOfField;
    }

    public void setTypeOfField(String typeOfField) {
        this.typeOfField = typeOfField;
    }

    public String getNameOfBuild() {
        return nameOfBuild;
    }

    public void setNameOfBuild(String nameOfBuild) {
        this.nameOfBuild = nameOfBuild;
    }
}