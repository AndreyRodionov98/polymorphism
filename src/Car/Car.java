package Car;

public class Car extends Transport implements Competing {
    private Integer bestTime;
    private Integer pitStop;
    private Integer maxSpee;

    public Car(String brand, String model, String engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("стартуем");
    }

    @Override
    public void stopMoving() {
        System.out.println("тормозим");

    }

    @Override
    public String toString() {
        return "марка авто - "+getBrand()+", модель - "+
                getModel()+", объем двигателя - "+ getEngineVolume()+" л.с";
    }

    @Override
    public boolean pitStop() {
        System.out.println("pitstop-"+pitStop);
        return false;
    }

    @Override
    public double bestTime() {
        System.out.println("besttime"+bestTime);
        return 2.35;
    }

    @Override
    public int maxSpee() {
        System.out.println("maxspeed"+maxSpee);
        return 210;
    }
}
