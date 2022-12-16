import Driver.Driver;
import Driver.DriverB;
import Driver.DriverD;
import Driver.DriverC;
import Car.Bus;
import Car.Car;
import Car.Truck;
import Car.BodyType;
import Car.Size;
import Car.LoadCapacity;
import Car.Transport;
import Car.Mechanic;
import Car.Sponsor;
import Driver.DriverC;
import Car.ServiceStation;

import java.sql.SQLOutput;
import java.util.List;


public class Main {



    public static void main(String[] args) {

        Mechanic<Car> petr=new Mechanic("Petr Petrov","RedBull");
        Mechanic<Truck> ivan=new Mechanic("Ivan Ivanov","Shell");
        Mechanic<Bus> vladimir=new Mechanic("Vladimir Vladimirov","Bus");
        Sponsor lukoil=new Sponsor("lukoil",1000000);
        Sponsor cordiant=new Sponsor("Cordiant",2500000);


        Car lada = new Car("Lada", "Vesta", 2.0, BodyType.SEDAN);
        lada.addDriver(new DriverB("Boris","b",10,lada) );
        lada.addMechanic(petr);
        lada.addSponsor(cordiant);


        Car kia = new Car("KIA", "Cerato", 2.5, BodyType.COUPE);
        Car skoda = new Car("Skoda", "Octavia", 3.0, null);
        Car audi = new Car("Audi", "A3", 3.0, BodyType.HATCHBACK);
        lada.printCar();
        lada.printType();
        kia.printCar();
        kia.printType();
        skoda.printCar();
        skoda.printType();
        audi.printCar();
        audi.printType();



        Bus man = new Bus("MAN", "Lion’s Coach", 5.0, Size.S);
        man.addDriver(new DriverD("Danil","D",3,man));
        man.addMechanic(vladimir);
        man.addSponsor(lukoil);


        Bus gaz = new Bus("GAZ", "Вектор Next", 3.3, Size.XL);
        Bus maz = new Bus("MAZ", "232", 3.5, Size.L);
        Bus setra = new Bus("Setra", "Provate", 3.8, null);
        man.printBus();
        maz.printType();
        gaz.printBus();
        gaz.printType();
        maz.printBus();
        maz.printType();
        setra.printBus();
        setra.printType();



        Truck iveco = new Truck("Iveco", "MP 260E38 6x6", 12.0, LoadCapacity.N2);
        iveco.addDriver(new DriverC("Igor","C",6,iveco));
        iveco.addMechanic(ivan);
        iveco.addSponsor(lukoil);




        Truck mon = new Truck("MON", "41.410 8x4", 10.0, LoadCapacity.N1);
        Truck volvo = new Truck("VOLVO", "FMX-500-10X4", 13.0, null);
        Truck mercedes = new Truck("Mercedes-Benz", "Atego 815", 4.2, LoadCapacity.N3);
        iveco.printTruck();
        iveco.printType();
        mon.printTruck();
        mon.printType();
        volvo.printTruck();
        volvo.printType();
        mercedes.printTruck();
        mercedes.printType();



        Car car = new Car("Kia", "K5", 3.0, BodyType.COUPE);
        Truck truck=new Truck("MON", "41.410 8x4", 10.0, LoadCapacity.N1);
        DriverB driverB = new DriverB("Роман", "b", 10, car);
        DriverB driverBb= new DriverB("Роман","b",10,car);
        System.out.println(driverB);
        System.out.println(driverBb);



        List<Transport> transports= List.of(lada,
                man,
                mercedes);
        List<Mechanic<? extends Transport>> mechanic=List.of(petr,ivan,vladimir);
        List<Sponsor>sponsors=List.of(lukoil,cordiant);

        ServiceStation serviceStation=new ServiceStation();
        serviceStation.addCar(car);
        serviceStation.addTruck(truck);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport: transports){
        printInfo(transport);
        }


    }
    private static void printInfo(Transport transport) {
        System.out.println("информация по автомобилю" + transport.getModel()
                + transport.getBrand());
        System.out.println("Водители:");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getFullName());

        }
        System.out.println("Механики :");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getFullName() + mechanic.getCompany());


        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());


        }
    }

}