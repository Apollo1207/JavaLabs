package ua.lviv.iot.model;

public class AthleticsField extends SportBuild {
    private int countOfSportDisciplines;
    private int countOfRunningTracks;
    private String typeOfField;

    public AthleticsField() {
        this(0,0,null,0,null,0,0,null);
    }

    public AthleticsField(final int numberOfSeats, final int yearOfFoundation, final String location,
                          final int scaleOfField, final String nameOfSport, final int countOfSportDisciplines,
                          final int countOfRunningTracks, final String typeOfField) {
        super(numberOfSeats, yearOfFoundation, location, scaleOfField, nameOfSport);
        this.countOfSportDisciplines = countOfSportDisciplines;
        this.countOfRunningTracks = countOfRunningTracks;
        this.typeOfField = typeOfField;
    }

    public final String getHeaders() {
        return super.getHeaders() + "," + " countOfSportDisciplines" + "," + " countOfRunningTracks " + "," + "typeOfField";
    }

    public final String toCSV() {
        return super.toCSV() + "," + " countOfSportDisciplines = " + getCountOfSportDisciplines() + ","
                + " countOfRunningTracks = " + getCountOfRunningTracks()
                + " typeOfField = " + getTypeOfField();
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
}