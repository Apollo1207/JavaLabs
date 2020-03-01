package ua.lviv.iot.model;

public class Athletics extends SportBuild {
    int countOfSportDisciplines;
    private String nameOfBuild;
    private String typeOfField;

    public Athletics() {

    }

    public Athletics(int numberOfSeats, int yearOfFoundation, String loctaion, int scaleOfField, int countOfSportDisciplines, String nameOfBuild, String typeOfField) {
        super(numberOfSeats, yearOfFoundation, loctaion, scaleOfField);
        this.countOfSportDisciplines = countOfSportDisciplines;
        this.nameOfBuild = nameOfBuild;
        this.typeOfField = typeOfField;
    }

    public int getCountOfSportDisciplines() {
        return countOfSportDisciplines;
    }

    public void setCountOfSportDisciplines(int countOfSportDisciplines) {
        this.countOfSportDisciplines = countOfSportDisciplines;
    }

    public String getNameOfBuild() {
        return nameOfBuild;
    }

    public void setNameOfBuild(String nameOfBuild) {
        this.nameOfBuild = nameOfBuild;
    }

    public String getTypeOfField() {
        return typeOfField;
    }

    public void setTypeOfField(String typeOfField) {
        this.typeOfField = typeOfField;
    }
}