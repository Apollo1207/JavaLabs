package ua.lviv.iot.manager;

import ua.lviv.iot.model.SportBuild;

import java.util.LinkedList;
import java.util.List;

public class ConstructionManager {
    private List<SportBuild> builds = new LinkedList<>();

    public void addConstructions(List<SportBuild> builds) {
        this.builds.addAll(builds);
    }

    public void addConstruction(SportBuild build) {
        this.builds.add(build);
    }

    public List<SportBuild> findByNumberSeats(int numberOfSeats) {
        List<SportBuild> result = new LinkedList<>();
        for (SportBuild build : builds) {
            if (build.getNumberOfSeats() > numberOfSeats) {
                result.add(build);
            }
        }
        return result;
    }


}