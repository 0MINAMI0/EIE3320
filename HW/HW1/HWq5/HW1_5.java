import java.util.*;
public class HW1_5
{
    public static void main(String[] args) {
        System.out.print("Java Candy: ");
        Scanner input = new Scanner(System.in);
        int[] inputs = new int[2];
        for(int i = 0; i < 2; i++)
        {
            inputs[i] = input.nextInt();
        }
        int n = inputs[0];
        int m = inputs[1];
        int candies = 0;
        int tem = n;
        //System.out.println(m);
        //System.out.println(n);
        while (tem/m != 0){
            n = n + tem/m;
            candies = n;
            tem = tem/m;
            //System.out.println("tem/m: " + tem/m);
            //System.out.println("candies: " + candies);
        }
        System.out.println("n=" + inputs[0] + "; m=" + m + "; No. of candies=" + candies);
    }
}
