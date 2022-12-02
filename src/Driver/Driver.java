package Driver;

import java.util.Objects;


public abstract class   Driver {
    private String fullName;
    private boolean driverLicense;
    private Integer experience;

    public Driver(String fullName, boolean driverLicense, int experience) {
        this.fullName =  fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }



    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experience);
    }


    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuelCar();

}
