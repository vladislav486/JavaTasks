package JavaCollectionsTask;

import java.util.ArrayList;
import java.util.List;

public class CarMainProgram {
    public static void main(String[] args) {
        List <Car> allTaxiCars = new ArrayList<>();
        Car firstTaxiCar = new Car(Manufacturer.ACURA, Type.SEDAN, "TSX", 10000, 2007, 200, 5, 7 , true);
        Car secondTaxiCar = new Car(Manufacturer.AUDI, Type.COUPE, "TT", 45000, 2020, 350, 2, 13 , true);
        Car thirdTaxiCar = new Car(Manufacturer.VOLKSWAGEN, Type.HATCHBACK, "Polo", 14000, 2015, 160, 5, 8, true);
        Car forthTaxiCar = new Car (Manufacturer.FORD, Type.HATCHBACK, "Fusion", 6000, 2005, 140, 5, 10, false);
        allTaxiCars.add(firstTaxiCar);
        allTaxiCars.add(secondTaxiCar);
        allTaxiCars.add(thirdTaxiCar);
        allTaxiCars.add(forthTaxiCar);


        int carsCost = TaxiFleet.calculateCarsPrice(allTaxiCars);
        System.out.println("All cars` price is " + carsCost);
        System.out.println();
        allTaxiCars.sort(new CarSortedByFuelConsComparator());
        System.out.println("Cars list, sorted by fuel consumption : ");
        for (Car cars : allTaxiCars) {
            System.out.println(cars);
        }
        System.out.println();

        System.out.println("Searching cars by the required speed limit: ");
        List <Car> carsBySpeed = TaxiFleet.searchCarBySpeed(allTaxiCars, 120, 170);
        if (carsBySpeed.size() == 0){
            System.out.println("There are no cars meeting the requirements.");
        } else {
            for (Car car : carsBySpeed) {
                System.out.println(car);
            }
        }
    }
}
