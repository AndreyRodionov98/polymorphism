package Driver;

import Car.Car;

public class DriverB extends Driver<Car> {
    public DriverB(String fullName,String category, int drivingExperience, Car car) {
        super(fullName, "B", drivingExperience, car);
    }
}
