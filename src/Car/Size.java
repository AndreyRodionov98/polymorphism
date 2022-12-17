package Car;

public enum Size {
    XS(0, 10),
    S(11, 25),
    M(40, 50),
    L(60, 80),
    XL(100, 120);
    private double min;
    private double max;

    Size(double min, double max) {
        this.min = min;
        this.max = max;
    }

    Size() {

    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public static Size getValue(int value) {
        for (Size e : Size.values()) {
            if (value >= e.getMin() && value <= e.getMax()) {
                System.out.println(e);
                return e;
            }
        }
        return null;
    }
}