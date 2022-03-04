package shapecolours;

/**
 *
 * @author Vipul_Ashawa
 */
public class LineShape extends Shape {
    
    public LineShape() {
        this.name = "Line";
    }

    @Override
    protected void drawShape() {
        System.out.println("This is a " + this.fill + " " + this.name + ".");
    }
}
