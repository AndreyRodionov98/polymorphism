package Driver;

import Car.Car;
import Driver.Driver;

import java.awt.image.BufferStrategy;
import Car.Bus;
import Driver.Driver;
import Car.Car;
public class DriverD <D extends Bus>extends Driver {
    public DriverD(String fullName, boolean driverLicense, int experience) {
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
    public String getCarMassage(Bus bus){
        return "Driver D - "+getFullName()+", is driving car"+bus.getBrand()+
                ", "+bus.getModel()+", will practipate in race";
    }

}
