package Car;

public  class CargoCar extends Transport implements Competing {


    private Integer bestTime;
    private Integer pitStop;
    private Integer maxSpee;
    public CargoCar(String brand, String model, String engineVolume) {
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
        return "марка авто - "+getBrand()+", модель - "+getModel()+", объем двигателя - "+ getEngineVolume()+" л.с";
    }

    @Override
    public boolean pitStop() {
        System.out.println(""+pitStop);
        return true;
    }

    @Override
    public double bestTime() {
        System.out.println("besttime"+bestTime);
        return 3.55;
    }

    @Override
    public int maxSpee() {
        System.out.println("maxSpeed"+maxSpee);
        return 110;
    }
}
