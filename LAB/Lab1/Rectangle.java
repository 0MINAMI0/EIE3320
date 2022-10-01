import java.awt.*;
public class Rectangle extends Shape
{
    private float length;
    private float width;
    
    public Rectangle(){
        
    }
    
    public Rectangle(float l, float w){
        length = l;
        width = w;
    }
    
    public void readShape(){
        
    }
    
    public void computerArea(){
        area = length*width;
    }
    
    public void computerPerimeter(){
        perimeter = 2*(length+width);
    }
    
    public void displayShape(){
        
    }
}
