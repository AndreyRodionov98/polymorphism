package Car;

import Car.Transport;

public class Mechanic<T extends Transport> {
    private String fullName;
    private String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }
    public boolean service(T t){
       return t.service();
    }
    public void repair(T t){
        t.repair();
    }

}
