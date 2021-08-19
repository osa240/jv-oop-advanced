package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBERS = 5;
    private static final int COEFICIENT_RANDOM = 10;
    private String color = new ColorSupplier().getRandomColor();

    private Square getSquare() {
        int side = new Random().nextInt(COEFICIENT_RANDOM);
        return new Square(color, side);
    }

    private Rectangle getRectangle() {
        int sideA = new Random().nextInt(COEFICIENT_RANDOM);
        int sideB = new Random().nextInt(COEFICIENT_RANDOM);
        return new Rectangle(color, sideA, sideB);
    }

    private RightTriangle getRightTriangle() {
        int firstLeg = new Random().nextInt(COEFICIENT_RANDOM);
        int secondLeg = new Random().nextInt(COEFICIENT_RANDOM);
        return new RightTriangle(color,firstLeg, secondLeg);
    }

    private Circle getCircle() {
        int radius = new Random().nextInt(COEFICIENT_RANDOM);
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        int sideA = new Random().nextInt(COEFICIENT_RANDOM);
        int sideB = new Random().nextInt(COEFICIENT_RANDOM);
        int height = new Random().nextInt(COEFICIENT_RANDOM);
        return new IsoscelesTrapezoid(color, sideA, sideB, height);
    }

    public static Figure getRandomFigure() {
        FigureSupplier figure = new FigureSupplier();
        switch (new Random().nextInt(MAX_NUMBERS)) {
            case 0:
                return figure.getSquare();
            case 1:
                return figure.getRectangle();
            case 2:
                return figure.getRightTriangle();
            case 3:
                return figure.getCircle();
            default:
                return figure.getIsoscelesTrapezoid();
        }
    }
}
