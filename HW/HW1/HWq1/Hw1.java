import java.util.Scanner;
public class Hw1
{
    public static void main (String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of lines:");
            int rows = input.nextInt();
            System.out.println("Hello: LYU Hao 20042543d");      
            int i;
            int current = rows;// current is current rows
            int index = 0;//index before 1
            int index2 = 0;//index start from 1 in the middle
            int space = 0;
            for (i = 1; i <= rows; i++){
                for ( space = 1; space < current; current--){
                    System.out.print("   ");
                }
                current = rows - i;
                for ( index2 = i; 1 < index2; index2--){
                    if (index2 > 9)
                        System.out.print(" " + index2);
                    else
                        System.out.print("  " + index2);
                }
                
                for ( index = 1; index < (i + 1); index++){
                        if (index > 10)
                        System.out.print(" " + index);
                        else
                        System.out.print("  " + index);
                }
                System.o    ut.print("\n");
            }
    }
}
    


