import java.util.*;
public class HW1q1
{
    public static void main(String[] args){
        int column;
        int i;
        int space;
        Scanner input = new Scanner(System.in);
        System.out.print("number:");
        int rows = input.nextInt();
        int j = 2; 
        for (i = 1; i<rows+1;i++){
            for (space = rows-i+1;space>0;space--){
                if (space>7)
                {
                    System.out.print("  ");
                }
                else{System.out.print("   ");}
            } 
            for (j = i;j>1;j--){
            System.out.print(j);
            System.out.print(" ");
            }
            
            for (j = 1; j <= i; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }    
}

