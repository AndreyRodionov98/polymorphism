

package Car;
import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport {
    private Size size;

    public Bus( String brand , String model, double engineVolume,Size size) {
        super (brand, model, engineVolume);
    this.size=size;
    }


    @Override
    public void startDriving() {
        System.out.printf("Автобус %s %s начни движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void finishDriving() {
        System.out.printf("Автобус %s %s закончи движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус!  %s %s Пит-Стоп! ",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public int bestLapTime() {return ThreadLocalRandom.current().nextInt(1, 15);
    }

    @Override
    public int maximumSpeed() { return ThreadLocalRandom.current().nextInt(1, 300);
    }

    @Override
    public void printType() {
        if (size==null){
            System.out.println("данных недостаточно");
        return;
        }


    }

    @Override
    public boolean service() {
        System.out.println("Автобус"+getBrand()+getModel()+"в диагностике не требуется");

        return true;
    }

    @Override
    public void repair() {
        System.out.println("Машина "+getBrand()+getModel()+" исправна");
    }

    public void printBus() {
        System.out.println("Автобус: " + getBrand()+
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л"+", "+size);
    }

}