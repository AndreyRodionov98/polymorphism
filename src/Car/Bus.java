package Car;

import java.sql.SQLOutput;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, String engineVolume) {

        super(brand, model, engineVolume);
    }
    private Integer bestTime;
    private Integer pitStop;
    private Integer maxSpee;


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
       return  "марка авто - "+getBrand()+", модель - "+
                getModel()+", объем двигателя - "+ getEngineVolume()+" л.с";
    }

    @Override
    public boolean pitStop() {
        System.out.println("false" +pitStop  );
        return false;
    }

    @Override
    public double bestTime() {
        System.out.println("best time"+bestTime);
        return 4.00;
    }

    @Override
    public int maxSpee() {
        System.out.println("maxSpeed"+maxSpee);
        return 100;
    }
}
