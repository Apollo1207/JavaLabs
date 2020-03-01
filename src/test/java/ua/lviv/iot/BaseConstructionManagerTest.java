package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.model.*;

import java.util.LinkedList;
import java.util.List;

public abstract class BaseConstructionManagerTest {
    protected List<SportBuild> builds;

    @BeforeEach
    public void createBuilds() {
        builds = new LinkedList<SportBuild>();

        builds.add(new Football(50,
                1998, "Lviv", 235,
                RoofType.OPEN, "natural",
                "Marco"));
        builds.add(new Athletics(100,
                2001, "New-York", 54,
                26, "sada",
                "artificial"));
        builds.add(new Swimming(6,
                1976, "Paris", 54,
                3, 9,
                PurificationSystem.ULTRAVIOLET));
    }
}
