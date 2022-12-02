package Driver;

import Car.Car;
import Car.CargoCar;
import Driver.Driver;

public class DriverC <C extends CargoCar>extends Driver {
    public DriverC(String fullName, boolean driverLicense, int experience) {
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
    public String getCarMassage(CargoCar cargoCar){
        return "Driver C - "+getFullName()+", is driving ca - r"+cargoCar.getBrand()+
                ",  "+cargoCar.getModel()+" , will practipate in race";
    }
}
