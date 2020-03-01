package ua.lviv.iot.model;

public class Swimming extends SportBuild {

    private int depthOfPool;
    private int countOfTracks;
    private PurificationSystem purificationSystem;

    public Swimming() {

    }

    public Swimming(int numberOfSeats, int yearOfFoundation, String loctaion, int scaleOfField, int depthOfPool, int countOfTracks, PurificationSystem purificationSystem) {
        super(numberOfSeats, yearOfFoundation, loctaion, scaleOfField);
        this.depthOfPool = depthOfPool;
        this.countOfTracks = countOfTracks;
        this.purificationSystem = purificationSystem;
    }

    public int getDepthOfPool() {
        return depthOfPool;
    }

    public void setDepthOfPool(int depthOfPool) {
        this.depthOfPool = depthOfPool;
    }

    public int getCountOfTracks() {
        return countOfTracks;
    }

    public void setCountOfTracks(int countOfTracks) {
        this.countOfTracks = countOfTracks;
    }

    public PurificationSystem getPurificationSystem() {
        return purificationSystem;
    }

    public void setPurificationSystem(PurificationSystem purificationSystem) {
        this.purificationSystem = purificationSystem;
    }
}