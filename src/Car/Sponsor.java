package Car;

public class Sponsor {
    private String name;
    private int summ;

    public Sponsor(String name, int summ) {
        this.name = name;
        this.summ = summ;
    }

    public String getName() {
        return name;
    }

    public int getSumm() {
        return summ;
    }
    public void sponsorTheRace(){
        System.out.printf("Споносор\"%s\" проспонсировал %d ",name, summ) ;
    }

    @Override
    public String toString() {
        return name+", сумма поддержки "+summ;
    }
}
