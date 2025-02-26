public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;

    private static int shapeCountAll = 0;
    private static int countAllLimit = 5;

    private static int countCircle = 0;
    private static int circleLimit = 2;

    private static int countRectangle = 0;
    private static int rectangleLimit = 2;

    private static int countSquare = 0;
    private static int squareLimit = 2;

    public static Shape getShape(int type) {
        if (shapeCountAll >= countAllLimit) {
            return null;
        }

        switch (type) {
            case TYPE_CIRCLE:
                if (countCircle < circleLimit) {
                    countCircle++;
                    shapeCountAll++;
                    return new Circle();
                }
                break;

            case TYPE_RECTANGLE:
                if (countRectangle < rectangleLimit) {
                    countRectangle++;
                    shapeCountAll++;
                    return new Rectangle();
                }
                break;

            case TYPE_SQUARE:
                if (countSquare < squareLimit) {
                    countSquare++;
                    shapeCountAll++;
                    return new Square();
                }
                break;
        }
        return null;
    }
}
