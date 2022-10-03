import java.util.*;
import java.awt.*;

public class Square extends Shape implements Drawable
{
    private float length;
    
    public Square(){
        readShape();
        computeArea();
        computePerimeter();
        displayShape();
        draw();
    }
    
    public Square(float l){
        length = l;
    }
    
    public void readShape(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the length:");
        System.out.println();

        length = input.nextFloat();
        System.out.println();
    }
    
    public void computeArea(){
        area = length*length;
    }
    
    public void computePerimeter(){
        perimeter = length*4;
    }
    
    public void displayShape(){
        System.out.println("Area of the square = " + area);
        System.out.println("Perimeter of the square = " + perimeter);
    }
    
    public void draw(){
        Canvas canvas = new Canvas.getCanvas();
    }
}
