package shapecolours;

/**
 *
 * @author Vipul_Ashawa
 */
public abstract class Colour {
    protected String name;
    protected String colourCode;
    
    public Colour(String name, String colourCode) {
        this.name = name;
        this.colourCode = colourCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColourCode() {
        return colourCode;
    }

    public void setColourCode(String colourCode) {
        this.colourCode = colourCode;
    }
    
    
}
