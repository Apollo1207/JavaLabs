package ua.lviv.iot.model;

public class SwimmingPool extends SportBuild {

    private int depthOfPool;
    private int countOfTracks;
    private PurificationSystem purificationSystem;

    public SwimmingPool(final int numberOfSeats, final int yearOfFoundation, final String location,
                        final int scaleOfField, final String nameOfSport, final int depthOfPool,
                        final int countOfTracks, final PurificationSystem purificationSystem) {
        super(numberOfSeats, yearOfFoundation, location, scaleOfField, nameOfSport);
        this.depthOfPool = depthOfPool;
        this.countOfTracks = countOfTracks;
        this.purificationSystem = purificationSystem;
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "depthOfPool:" + ", "
                + "CountOfTracks:" + ", " + "PurificationSystem:";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getDepthOfPool()
                + ", " + getCountOfTracks()
                + ", " + getPurificationSystem();
    }

    public final int getDepthOfPool() {
        return depthOfPool;
    }

    public final void setDepthOfPool(final int depthOfPool) {
        this.depthOfPool = depthOfPool;
    }

    public final int getCountOfTracks() {
        return countOfTracks;
    }

    public final void setCountOfTracks(final int countOfTracks) {
        this.countOfTracks = countOfTracks;
    }

    public final PurificationSystem getPurificationSystem() {
        return purificationSystem;
    }

    public final void setPurificationSystem(final PurificationSystem purificationSystem) {
        this.purificationSystem = purificationSystem;
    }
}