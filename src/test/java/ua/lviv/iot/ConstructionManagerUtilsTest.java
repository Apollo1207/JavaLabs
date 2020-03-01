package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.manager.ConstructionManagerUtils;
import ua.lviv.iot.model.SortType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructionManagerUtilsTest extends BaseConstructionManagerTest {

    @Test
    public void testSortByNameOfSport() {
        ConstructionManagerUtils.sortByNameOfSport(builds, SortType.DESC);
        assertEquals(50, builds.get(0).getNumberOfSeats());
        assertEquals(100, builds.get(1).getNumberOfSeats());
        assertEquals(6, builds.get(2).getNumberOfSeats());
    }


}
