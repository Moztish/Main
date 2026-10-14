import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int SQUARE_TYPE = 0;
    public static final int RECTANGLE_TYPE = 1;
    public static final int RIGHT_TRIANGLE_TYPE = 2;
    public static final int CIRCLE_TYPE = 3;
    public static final int MAX_RANDOM_SIZE = 20;
    public static final int MIN_RANDOM_SIZE = 1;
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final String DEFAULT_COLOR = "white";

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case SQUARE_TYPE:
                int side = getRandomSize();
                return new Square(color, side);
            case RECTANGLE_TYPE:
                int width = getRandomSize();
                int height = getRandomSize();
                return new Rectangle(color, width, height);
            case RIGHT_TRIANGLE_TYPE:
                int firstLeg = getRandomSize();
                int secondLeg = getRandomSize();
                return new RightTriangle(color, firstLeg, secondLeg);
            case CIRCLE_TYPE:
                int radius = getRandomSize();
                return new Circle(color, radius);
            default:
                int firstBase = getRandomSize();
                int secondBase = getRandomSize();
                int trapezoidHeight = getRandomSize();
                return new IsoscelesTrapezoid(color, firstBase, secondBase, trapezoidHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private int getRandomSize() {
        return random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
    }
}
