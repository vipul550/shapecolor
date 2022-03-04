/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapecolours;

/**
 *
 * @author Vipul_Ashawa
 */
public class SquareShape extends Shape {
    public SquareShape() {
        this.name = "Square";
    }

    @Override
    protected void drawShape() {
        System.out.println("This is a " + this.fill + " " + this.name + ".");
    }
}
