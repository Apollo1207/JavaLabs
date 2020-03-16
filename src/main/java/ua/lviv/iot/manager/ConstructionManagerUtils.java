package ua.lviv.iot.manager;

import ua.lviv.iot.model.SortType;
import ua.lviv.iot.model.SportBuild;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ConstructionManagerUtils {
    private static SportBuildSorterByScaleOfField sportBuildSorterByScaleOfField = new ConstructionManagerUtils().new SportBuildSorterByScaleOfField();

    private static Comparator<SportBuild> compareByNameOfSport = new Comparator<SportBuild>() {
        @Override
        public int compare(final SportBuild firstBuild, final SportBuild secondBuild) {
            return firstBuild.getNameOfSport().compareTo(secondBuild.getNameOfSport());
        }
    };

    public final Comparator<SportBuild> getCompareByNameOfSport() {
        return compareByNameOfSport;
    }

    public final void setCompareByNameOfSport(final Comparator<SportBuild> compareViaNameOfSport) {
        compareByNameOfSport = compareViaNameOfSport;
    }

    //method that uses anonymous class with comparator
    public static void sortByNameOfSport(final List<SportBuild> builds, final SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            builds.sort(compareByNameOfSport);
        }
        if (sortType == SortType.DESCENDING) {
            builds.sort(compareByNameOfSport.reversed());
        }
    }
    //  method that uses inner class with comparator

    public static void sortByScaleOfField(final List<SportBuild> builds, final SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            builds.sort(sportBuildSorterByScaleOfField);
        }
        if (sortType == SortType.DESCENDING) {
            builds.sort(sportBuildSorterByScaleOfField);
        }
    }
    //  method that uses static inner class with comparator

    public static void sortByYearOfFoundation(final List<SportBuild> builds, final SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            builds.sort(new SportBuildSorterByYearOfFoundation());
        }
        if (sortType == SortType.DESCENDING) {
            builds.sort(new SportBuildSorterByYearOfFoundation());
        }
    }

    //method that sort with lambda
    public static void sortByNumberOfSeats(final ArrayList<SportBuild> builds, final SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            builds.sort((o1, o2) -> o1.getNumberOfSeats() - o2.getNumberOfSeats());
        }
        if (sortType == SortType.DESCENDING) {
            builds.sort((o1, o2) -> o2.getNumberOfSeats() - o1.getNumberOfSeats());
        }
    }

    // static inner class with comparator
    private static class SportBuildSorterByYearOfFoundation implements Comparator<SportBuild> {
        @Override
        public int compare(final SportBuild firstBuild, final SportBuild secondBuild) {
            return firstBuild.getYearOfFoundation() - secondBuild.getYearOfFoundation();
        }
    }

    // inner class with comparator
    private class SportBuildSorterByScaleOfField implements Comparator<SportBuild> {
        @Override
        public int compare(final SportBuild firstBuild, final SportBuild secondBuild) {
            return firstBuild.getScaleOfField() - secondBuild.getScaleOfField();
        }
    }
}
