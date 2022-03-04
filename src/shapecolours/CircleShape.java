package shapecolours;

/**
 *
 * @author Vipul_Ashawa
 */
public class CircleShape extends Shape {
    
    public CircleShape() {
        this.name = "Circle";
    }

    @Override
    protected void drawShape() {
        System.out.println("This is a " + this.fill + " " + this.name + ".");
    }
}
