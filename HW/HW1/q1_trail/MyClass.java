import java.util.*;
public class MyClass {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in); 
            System.out.print("How many rows do you want: "); 
            int rows = input.nextInt();
            int index = 0;
            int k = 1;
            for (int i = 1; i <= rows; i++){
                for (int space = 1; space <= rows-i; space++){
                    System.out.print(" ");
                } 
                for (index = i, k = i + 1; index > 0; index--){
                    System.out.print(index);
                    System.out.print(" ");
                    k--;
                    if (k == 1){
                        for (index = 2; index < rows; index ++){
                        System.out.print(index);
                        System.out.print(" ");   
                        }
                    }
                }System.out.print("\n");
                /*if (k == rows){
                    for (index = 2; index<rows;index++){
                    System.out.print(index);
                    System.out.print(" ");
                }*/
                }
                System.out.print("\n");
            }

        }

