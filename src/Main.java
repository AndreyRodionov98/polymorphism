import Driver.DriverB;
import Car.Bus;
import Car.Car;
import Car.Truck;
import Car.BodyType;
import Car.Size;
import Car.LoadCapacity;



public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Vesta", 2.0,BodyType.SEDAN);
        Car kia = new Car("KIA", "Cerato", 2.5,BodyType.COUPE);
        Car skoda = new Car("Skoda", "Octavia", 3.0,null);
        Car audi = new Car("Audi", "A3", 3.0,BodyType.HATCHBACK);
        lada.printCar();
        lada.printType();
        kia.printCar();
        kia.printType();
        skoda.printCar();
        skoda.printType();
        audi.printCar();
        audi.printType();


        Bus man = new Bus("MAN", "Lion’s Coach", 5.0, Size.S);
        Bus gaz = new Bus("GAZ", "Вектор Next", 3.3,Size.XL);
        Bus maz = new Bus("MAZ", "232", 3.5,Size.L);
        Bus setra = new Bus("Setra", "Provate", 3.8,null);
        man.printBus();
        maz.printType();
        gaz.printBus();
        gaz.printType();
        maz.printBus();
        maz.printType();
        setra.printBus();
        setra.printType();


        Truck iveco = new Truck("Iveco", "MP 260E38 6x6", 12.0, LoadCapacity.N2);
        Truck mon = new Truck("MON", "41.410 8x4", 10.0,LoadCapacity.N1);
        Truck volvo = new Truck("VOLVO", "FMX-500-10X4", 13.0,null);
        Truck mercedes = new Truck("Mercedes-Benz", "Atego 815", 4.2,LoadCapacity.N3);
        iveco.printTruck();
        iveco.printType();
        mon.printTruck();
        mon.printType();
        volvo.printTruck();
        volvo.printType();
        mercedes.printTruck();
        mercedes.printType();


        Car car = new Car("Kia", "K5", 3.0,BodyType.COUPE);
        DriverB driverB = new DriverB("Роман", 10,car);
        System.out.println(driverB);




    }
}

