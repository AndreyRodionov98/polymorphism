package Car;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing{
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType= bodyType;
    }

    public void startDriving() {
        System.out.printf("Автомобиль %s %s начни движение",
                this.getBrand(),
                this.getModel());
    }
    public void finishDriving() {
        System.out.printf("Автомобиль %s %s закончи движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s Пит-Стоп! ",
                this.getBrand(),
                this.getModel());
    }

    public void printType(){
    if (bodyType==null){
            System.out.println("недостаточно данных");
            return;
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.5;
    }

    @Override
    public void repair() {
        System.out.println("Машина "+getBrand()+getModel()+" исправна");
    }

    @Override
    public int bestLapTime() {return ThreadLocalRandom.current().nextInt(1, 10);
    }

    @Override
    public int maximumSpeed() {return  ThreadLocalRandom.current().nextInt(1,400);
    }

    public void printCar() {
        System.out.println("Легковой автомобиль: " + getBrand()+
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л"+", "+bodyType);
    }
}

