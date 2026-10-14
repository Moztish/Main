public class IsoscelesTrapezoid implements Figure {
    public static final int AREA_DIVIDER = 2;

    private final String color;
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        this.color = color;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / AREA_DIVIDER;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, firstBase: " + firstBase
                + " units, secondBase: " + secondBase
                + " units, height: " + height
                + " units, color: " + color);
    }
}
