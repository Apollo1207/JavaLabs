package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.model.*;

import java.util.ArrayList;

public abstract class BaseConstructionManagerTest {
    protected ArrayList<SportBuild> builds;

    @BeforeEach
    public void createBuilds() {
        builds = new ArrayList<SportBuild>();
        builds.add(new FootballField(50, 4, "Lviv",
                4,
                "Football", RoofType.OPEN, "Sad", 54));

        builds.add(new AthleticsField(100, 65, "Paris",
                54, "Athletics", 6,
                9, ""));

        builds.add(new SwimmingPool(6, 465, "New-York",
                93, "Swimming", 8,
                9, PurificationSystem.ULTRAVIOLET));
    }
}
