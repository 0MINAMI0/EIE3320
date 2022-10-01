import java.awt.*;
import java.awt.geom.*;

abstract public class Circle extends Shape
{

    private float radius;
    
    public Circle(){
        computerArea();
        computerPerimeter();
    }
    
    public Circle(float r){
        radius = r;
    }
    
    public void readShape(){
        
    }
    
    public void computerArea(){
        super.area = radius*radius*Math.PI;
    }
    
    public void computerPerimeter(){
        perimeter = 2*radius*Math.PI;
    }
    
    public void displayShape(){
        
    }
}
