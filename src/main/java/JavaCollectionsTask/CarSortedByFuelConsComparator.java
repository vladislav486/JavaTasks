package JavaCollectionsTask;

import java.util.Comparator;

public class CarSortedByFuelConsComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.fuelConsumption - o2.fuelConsumption;
    }
}
