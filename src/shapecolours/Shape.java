package shapecolours;

/**
 *
 * @author Vipul_Ashawa
 */
public abstract class Shape {
    protected String name;
    protected String fill;

    protected String getName() {
        return name;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }
    
    protected abstract void drawShape();
}
