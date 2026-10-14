public class RightTriangle implements Figure {
    public static final int AREA_DIVIDER = 2;

    private final String color;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / AREA_DIVIDER;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + color);
    }
}
