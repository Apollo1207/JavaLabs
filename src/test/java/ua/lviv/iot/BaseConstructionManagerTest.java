package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.model.*;

import java.util.ArrayList;

public abstract class BaseConstructionManagerTest {
    protected ArrayList<SportBuild> builds;

    @BeforeEach
    public void createBuilds() {
        builds = new ArrayList<SportBuild>();
        builds.add(new FootballField(50, 2008, "Lviv",
                848,
                "Football", RoofType.OPEN, "green", 54));

        builds.add(new AthleticsField(100, 2005, "Paris",
                953, "Athletics", 6,
                9, "rubber"));

        builds.add(new SwimmingPool(6, 1995, "New-York",
                921, "Swimming", 8,
                9, PurificationSystem.ULTRAVIOLET));
    }


}
