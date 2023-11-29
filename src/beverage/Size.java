package beverage;

public enum Size {
    SHORT(0.8),
    NORMAL(1),
    TALL(1.2),
    GRANDE(1.6);

    private double value;

    Size(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
