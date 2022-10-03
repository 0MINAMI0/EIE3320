import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class Circle extends Shape
{

    private float radius;
    
    public Circle(){
        readShape();
        computeArea();
        computePerimeter();
        displayShape();
    }
    
    public Circle(float r){
        radius = r;
    }
    
    public void readShape(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the radius:");
        System.out.println();

        radius = input.nextFloat();
        System.out.println();
    }
    
    public void computeArea(){
        area = radius*radius*(float)Math.PI;
    }
    
    public void computePerimeter(){
        perimeter = radius*2*(float)Math.PI;
    }    
    public void displayShape(){
        System.out.println("Area of the circle = " + area);
        System.out.println("Perimeter of the circle = " + perimeter);
    
    }
}