package Driver;

import Car.Car;
import Driver.Driver;

public class DriverB <T extends Car>extends Driver {
    public DriverB(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("car Start moving");

    }

    @Override
    public void stopMoving() {
        System.out.println(" Car stop moving");

    }

    @Override
    public void refuelCar() {
        System.out.println("car refuel");

    }
    public String getCarMassage(Car car){
        return "Driver B - "+getFullName()+", is driving car - "+car.getBrand()+
                ", "+car.getModel()+", will practipate in race";
    }
}
