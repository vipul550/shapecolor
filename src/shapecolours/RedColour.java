package shapecolours;

/**
 *
 * @author Vipul_Ashawa
 */
public class RedColour extends Colour implements ShapeTransform {

    public RedColour(String name, String colourCode) {
        super(name, colourCode);
    }

    @Override
    public SquareShape transformSquare() {
        SquareShape square = new SquareShape();
        square.setFill(this.colourCode);
        return square;
    }

    @Override
    public TriangleShape transformCircle() {
        TriangleShape triangle = new TriangleShape();
        triangle.setFill(this.colourCode);
        return triangle;
    }

    @Override
    public RectangleShape transformTriangle() {
        RectangleShape rectangle = new RectangleShape();
        rectangle.setFill(this.colourCode);
        return rectangle;
    }

    @Override
    public SquareShape transformLine() {
        SquareShape square = new SquareShape();
        square.setFill(this.colourCode);
        return square;
    }
    
}
