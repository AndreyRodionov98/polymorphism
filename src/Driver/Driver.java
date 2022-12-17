package Driver;

import Car.Transport;



public abstract class Driver <T extends Transport> {
    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car;

    public Driver(String fullName, String category, int drivingExperience, T car) {
        this.fullName = fullName;
        if (category==null||category.isEmpty()||category.isBlank()){
            try {
                throw new IllegalAccessException("необходимо указать категорию прав");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }else {
            this.category = category;
        }
        this.drivingExperience = drivingExperience;
        this.car = car;
    }
    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void startDriving() {
        System.out.printf("Водитель %s начал двигаться", this.fullName);
        this.car.startDriving();
    }

    public void finishDriving() {
        System.out.printf("Водитель %s закончил движение", this.fullName);
        this.car.finishDriving();
    }

    public void refill() {
        System.out.printf("Водитель %s заправляет  %s %s",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }

    @Override
    public String toString() {
        return String.format(
                "Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }
}

