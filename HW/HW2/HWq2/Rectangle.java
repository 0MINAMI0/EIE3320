import java.util.*;
public class Rectangle
{
    public Rectangle(double width, double height) {
        System.out.println("The area of a rectangle with width " + width + " and height " + height + " is " + getArea(width, height));
        System.out.print("The perimeter of this rectangle is " + getPerimeter(width, height));
    }
    
    public Rectangle() {
        double width = 1;
        double height = 1;        
    }
    
    static double getArea(double width, double height){
        return width * height;
    }
    
    static double getPerimeter(double width, double height) {
        return width*2+height*2;
    }
    
   public static void main(String[] args) {
        System.out.print("Input the width and height: ");
        Scanner input = new Scanner(System.in);
        double[] inputs = new double[2];
        for(int i = 0; i < 2; i++)
        {
            inputs[i] = input.nextDouble();
        }
        double width = inputs[0];
        double height = inputs[1];
        Rectangle rectangle01 = new Rectangle(width, height);
   }
}
