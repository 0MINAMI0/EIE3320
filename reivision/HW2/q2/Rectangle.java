
public class Rectangle
{
    double width;
    double height;
    Rectangle(){
        width=1;
        height=1;
    }

    Rectangle(double w, double h){
        width=w;
        height=h;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (width+height)*2;
    }

    public void printP(){
        System.out.println("width: "+width+" height: "+height+"peremeter: "+getPerimeter());
    }

    public void printA(){
        System.out.println("width: "+width+" height: "+height+"Area: "+getArea());

    }

    public static void main(String[] args){
        Rectangle rec1=new Rectangle(4,40);
        Rectangle rec2=new Rectangle(3.5,35.9);
        rec1.printP();
        rec1.printA();
        rec2.printP();
        rec2.printA();
    }
}

