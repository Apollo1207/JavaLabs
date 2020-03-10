package ua.lviv.iot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.manager.ConstructionManager;
import ua.lviv.iot.model.SportBuild;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructionManagerTest extends BaseConstructionManagerTest {


    private ConstructionManager constructionManager;

    @BeforeEach
    public void setUp() {
        constructionManager = new ConstructionManager();
        constructionManager.addConstructions(builds);
    }


    @Test
    public void testFindByNumberSeats() {
        List<SportBuild> builds = constructionManager.findByNumberSeats(20);
        assertEquals(2, builds.size());
        assertEquals(50, builds.get(0).getNumberOfSeats());
        assertEquals(100, builds.get(1).getNumberOfSeats());
    }
}
