package ua.lviv.iot.manager;

import ua.lviv.iot.model.SportBuild;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConstructionManager {
    private List<SportBuild> builds = new ArrayList<>();

    public final void addConstructions(final List<SportBuild> builds) {
        this.builds.addAll(builds);
    }

    public final void addConstruction(final SportBuild build) {
        this.builds.add(build);
    }

    public final List<SportBuild> findByNumberSeats(final int numberOfSeats) {
        List<SportBuild> result = new LinkedList<>();
        for (SportBuild build : builds) {
            if (build.getNumberOfSeats() > numberOfSeats) {
                result.add(build);
            }
        }
        return result;
    }
}