package Driver;

import Car.Car;
import Car.Truck;
import Driver.Driver;


public class DriverC extends Driver<Truck> {

    public DriverC(String fullName, int drivingExperience, Truck car) {
        super(fullName, "C", drivingExperience, car);
    }
}


