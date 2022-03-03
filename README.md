# shapecolor

Below is the skeleton I have creted to implement the functionality. 

I have craeted 2 abstract class colour and shape.

All 4 shapes will extends the shape class and override the drawShape method.

Now to transform the shape by adding colour I am using color classes

Shape trasnform the the interface which will have transform method for all shapes. 

Now for each colour we can have a class which will transform shape from one to another by adding color. 

For Example 
YellowColour will extends colour and implements the ShapeTransform interface. 

From ShapeTransform interface we will override method to transform shape when color is yellow. like wise we can add classes for all colours. 

I have added for Yellow and Red. 
