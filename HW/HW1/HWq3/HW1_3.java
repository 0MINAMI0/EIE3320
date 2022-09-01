import java.util.*;
public class HW1_3 {
        public static int getTriangularNumber(int n){
        return n;
        }
        public static void main(String[] args) {
            int data = 0;
            int flag = 0;
            int i = 1;
            Scanner input=new Scanner(System.in);
            System.out.println("How many triangular number: ");
            int num = input.nextInt();
            System.out.println("The first" + num +" triangular numbers are:");
            for (; i <= getTriangularNumber(num);i++){
                data = data +i;
                System.out.print(data + " ");
                flag++;
            if (flag == 5)
            {
                System.out.print("\n");
                flag = 0;
            }
            } 
            
            
       }
    }