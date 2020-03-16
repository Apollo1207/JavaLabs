package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.manager.ConstructionManagerUtils;
import ua.lviv.iot.model.SortType;

public class ConstructionManagerUtilsTest extends BaseConstructionManagerTest {

    @Test
    void sortWithAnonClass() {
        ConstructionManagerUtils.sortByNameOfSport(builds, SortType.ASCENDING);
        System.out.println(builds.get(0).getNameOfSport());
        System.out.println(builds.get(1).getNameOfSport());
        System.out.println(builds.get(2).getNameOfSport());
    }

    @Test
    void sortWithInnerClass() {
        ConstructionManagerUtils.sortByScaleOfField(builds, SortType.ASCENDING);
        System.out.println(builds.get(0).getScaleOfField());
        System.out.println(builds.get(1).getScaleOfField());
        System.out.println(builds.get(2).getScaleOfField());
    }

    @Test
    void sortWithStaticInnerClass() {
        ConstructionManagerUtils constructionManagerUtils = new ConstructionManagerUtils();
        constructionManagerUtils.sortByYearOfFoundation(builds, SortType.ASCENDING);
        System.out.println(builds.get(0).getYearOfFoundation());
        System.out.println(builds.get(1).getYearOfFoundation());
        System.out.println(builds.get(2).getYearOfFoundation());
    }

    @Test
    void sortViaLambda() {
        ConstructionManagerUtils.sortByNumberOfSeats(builds, SortType.DESCENDING);
        System.out.println(builds.get(0).getNumberOfSeats());
        System.out.println(builds.get(1).getNumberOfSeats());
        System.out.println(builds.get(2).getNumberOfSeats());
    }


}
