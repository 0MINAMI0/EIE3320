import java.util.*;
public class Rectangle
{
    public static double creates_rec(double width, double height) {
        double area = width * height;
        return area;
    }
    public double creates_default_rec() {
        double width = 1;
        double height = 1;        
        return width * height;
    }
   public static void main(String[] args) {
        System.out.print("Input the width and height: ");
        Scanner input = new Scanner(System.in);
        double[] inputs = new double[2];
        for(int i = 0; i < 2; i++)
        {
            inputs[i] = input.nextInt();
        }
        double width = inputs[0];
        double height = inputs[1];
        
        System.out.print("The area of a rectangle with width " + width + " and height " + height + " is " + creates_rec(width, height));

       
   }
}
