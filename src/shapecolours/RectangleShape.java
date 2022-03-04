package shapecolours;

/**
 *
 * @author Vipul_Ashawa
 */
public class RectangleShape extends Shape {
    
    public RectangleShape() {
        this.name = "Rectangle";
    }

    @Override
    protected void drawShape() {
        System.out.println("This is a " + this.fill + " " + this.name + ".");
    }
    
}
