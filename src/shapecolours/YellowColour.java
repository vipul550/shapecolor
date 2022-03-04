package shapecolours;

/**
 *
 * @author Vipul_Ashawa
 */
public class YellowColour extends Colour implements ShapeTransform {

    public YellowColour(String name, String colourCode) {
        super(name, colourCode);
    }

    @Override
    public RectangleShape transformSquare() {
        RectangleShape rectangle = new RectangleShape();
        rectangle.setFill(this.colourCode);
        return rectangle;
    }

    @Override
    public TriangleShape transformCircle() {
        TriangleShape triangle = new TriangleShape();
        triangle.setFill(this.colourCode);
        return triangle;
    }

    @Override
    public LineShape transformTriangle() {
        LineShape line = new LineShape();
        line.setFill(this.colourCode);
        return line;
    }

    @Override
    public CircleShape transformLine() {
        CircleShape circle = new CircleShape();
        circle.setFill(this.colourCode);
        return circle;
    }
}
