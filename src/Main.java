import Car.Car;
import Car.CargoCar;
import Car.Transport;
import Car.Bus;
import Car.Competing;
import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
public class Main {
    public static void main(String[] args) {

        Car Lada=new Car("Lada","Vesta","180");
        System.out.println(Lada.toString());
        Lada.startMoving();
        Lada.stopMoving();
        Lada.bestTime();
        Lada.maxSpee();
        Lada.pitStop();
        Car Huyndai=new Car("Huyndai","Sanata","240");
        System.out.println(Huyndai.toString());
        Huyndai.startMoving();
        Huyndai.stopMoving();
        Huyndai.bestTime();
        Huyndai.maxSpee();
        Huyndai.pitStop();
        Car Mazda= new Car("Mazda","cx-6","300");
        System.out.println(Mazda.toString());
        Mazda.startMoving();
        Mazda.stopMoving();
        Mazda.bestTime();
        Mazda.maxSpee();
        Mazda.pitStop();
        Car BMW=new Car("BMW","M-6","500");
        System.out.println(BMW.toString());
        BMW.startMoving();
        BMW.stopMoving();
        BMW.bestTime();
        BMW.maxSpee();
        BMW.pitStop();



        Bus Zaz=new Bus("Zaz","xz232","150");
        System.out.println(Zaz.toString());
        Zaz.startMoving();
        Zaz.stopMoving();
        Zaz.bestTime();
        Zaz.maxSpee();
        Zaz.pitStop();
        Bus Honda=new Bus("Honda","fg12","180");
        System.out.println(Honda.toString());
        Honda.startMoving();
        Honda.stopMoving();
        Honda.bestTime();
        Honda.maxSpee();
        Honda.pitStop();
        Bus Ford=new Bus("Ford","www222","200");
        System.out.println(Ford.toString());
        Ford.startMoving();
        Ford.stopMoving();
        Ford.bestTime();
        Ford.maxSpee();
        Ford.pitStop();
        Bus Shkoda=new Bus("Shkoda","xz232","180");
        System.out.println();
        Shkoda.startMoving();
        Shkoda.stopMoving();
        Shkoda.bestTime();
        Shkoda.maxSpee();
        Shkoda.pitStop();



        CargoCar Zil=new CargoCar("Zil","xz232","150");
        System.out.println(Zil.toString());
        Zil.startMoving();
        Zil.stopMoving();
        Zil.bestTime();
        Zil.maxSpee();
        Zil.pitStop();
        CargoCar Yral=new CargoCar("Yral","xz232","150");
        System.out.println(Yral.toString());
        Yral.startMoving();
        Yral.stopMoving();
        Yral.bestTime();
        Yral.maxSpee();
        Yral.pitStop();
        CargoCar Mercedez=new CargoCar("Mercedez","xz232","210");
        System.out.println(Mercedez.toString());
        Mercedez.startMoving();
        Mercedez.stopMoving();
        Mercedez.bestTime();
        Mercedez.maxSpee();
        Mercedez.pitStop();
        CargoCar Sayong=new CargoCar("Sayong","xz232","150");
        System.out.println(Sayong.toString());
        Sayong.startMoving();
        Sayong.stopMoving();
        Sayong.bestTime();
        Sayong.maxSpee();
        Sayong.pitStop();


        DriverB <Car>driverB=new DriverB<Car>("Ivan",true,4);
        System.out.println( driverB.getCarMassage(new Car("Lada","Vesta","180")));
        DriverC<CargoCar>driverC=new DriverC<CargoCar>("Danil",true,3);
        System.out.println(driverC.getCarMassage(new CargoCar("Zil","xz232","150")));
        DriverD<Bus>driverD=new DriverD<Bus>("Danil",true,7);
        System.out.println(driverD.getCarMassage(new Bus("Honda","fg12","180")));

    }

}