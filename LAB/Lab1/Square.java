import java.awt.*;

public class Square extends Shape
{
    private float length;
    
    public Square(){
        
    }
    
    public Square(float l){
        length = l;
    }
    
    public void readShape(){
        
    }
    
    public void computerArea(){
        area = length*length;
    }
    
    public void computerPerimeter(){
        perimeter = length*4;
    }
    
    public void displayShape(){
        
    }
}
