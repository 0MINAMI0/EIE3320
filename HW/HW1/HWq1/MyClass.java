import java.util.*;
public class MyClass {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in); 
            System.out.print("How many rows do you want: "); 
            int rows = input.nextInt();
            for (int i = 1; i <= rows; i++){
                for (int space = 1; space <= rows-i; space++){
                    System.out.print(" ");
                }
                for (int index = 1; index <= 2*i-1; index++){
                    System.out.print(index);
                }
                System.out.print("\n");
            }

        }
}
