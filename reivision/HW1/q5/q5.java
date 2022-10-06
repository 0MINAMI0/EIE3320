import java.util.*;
public class q5
{
    public static void main(String[] args){ 
        System.out.print("Java Candy: ");
        Scanner input = new Scanner(System.in);
        int[] inputs = new int[2];
        for(int i = 0; i < 2; i++)
        {
            inputs[i] = input.nextInt();
        }
        int n = inputs[0];
        int m = inputs[1];
        int tem = n;
        
        for(int i=n; i<1;){
            i = i/m;
            tem += i;
            
        }
        System.out.print("candies"+tem);
        }
    }

