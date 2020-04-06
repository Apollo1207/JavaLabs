package ua.lviv.iot.model;

import java.util.Objects;

public class AthleticsField extends SportBuild {
    private int countOfSportDisciplines;
    private int countOfRunningTracks;
    private String typeOfField;

    public AthleticsField(final int numberOfSeats, final int yearOfFoundation, final String location,
                          final int scaleOfField, final String nameOfSport, final int countOfSportDisciplines,
                          final int countOfRunningTracks, final String typeOfField) {
        super(numberOfSeats, yearOfFoundation, location, scaleOfField, nameOfSport);
        this.countOfSportDisciplines = countOfSportDisciplines;
        this.countOfRunningTracks = countOfRunningTracks;
        this.typeOfField = typeOfField;
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "CountOfSportDisciplines:" + ", "
                + "CountOfRunningTracks:" + ", " + "TypeOfField:";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getCountOfSportDisciplines()
                + ", " + getCountOfRunningTracks()
                + ", " + getTypeOfField();
    }

    public final int getCountOfSportDisciplines() {
        return countOfSportDisciplines;
    }

    public final void setCountOfSportDisciplines(final int countOfSportDisciplines) {
        this.countOfSportDisciplines = countOfSportDisciplines;
    }

    public final int getCountOfRunningTracks() {
        return countOfRunningTracks;
    }

    public final void setCountOfRunningTracks(final int countOfRunningTracks) {
        this.countOfRunningTracks = countOfRunningTracks;
    }

    public final String getTypeOfField() {
        return typeOfField;
    }

    public final void setTypeOfField(final String typeOfField) {
        this.typeOfField = typeOfField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AthleticsField that = (AthleticsField) o;
        return getCountOfSportDisciplines() == that.getCountOfSportDisciplines() &&
                getCountOfRunningTracks() == that.getCountOfRunningTracks() &&
                getTypeOfField().equals(that.getTypeOfField());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCountOfSportDisciplines(), getCountOfRunningTracks(), getTypeOfField());
    }

    @Override
    public String toString() {
        return "AthleticsField{" +
                "countOfSportDisciplines=" + countOfSportDisciplines +
                ", countOfRunningTracks=" + countOfRunningTracks +
                ", typeOfField='" + typeOfField + '\'' +
                '}';
    }
}