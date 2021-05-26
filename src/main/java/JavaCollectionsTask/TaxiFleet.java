package JavaCollectionsTask;

import java.util.ArrayList;
import java.util.List;

public class TaxiFleet {
    public static int calculateCarsPrice(List <Car> cars){
        int sum = 0;
        for (Car car : cars) {
            sum += car.price;
        }
        return sum;
    }
    public static List <Car> searchCarBySpeed(List <Car> cars, int min, int max){
        List <Car> carsSelectedBySpeed = new ArrayList<>();
        for (Car car : cars) {
            if (car.maxSpeed >= min && car.maxSpeed <= max){
                carsSelectedBySpeed.add(car);
            }
        }
        return carsSelectedBySpeed;
    }
}
