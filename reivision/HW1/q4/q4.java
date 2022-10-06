import java.util.*;
public class q4
{
     public static int daysInMonth(int month){
         int number=0;
         return number;
     }
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int months = input.nextInt();
         int days=0;
         String[] month = {"Jan","2","3","4","5","6","7","8","9","10","11","12"};
         if(months<8 && months!=2){
             if(months%2==0){
                 days = 30;
             }
             else if(months%2!=0){
                 days = 31;
             }
         }
         if (months == 2){
             days = 29;
         }
         if (months>=8){
             if(months%2==0){
                 days = 31;
             }
             else if(months%2!=0){
                 days = 30;
             }
         }
         System.out.println(month[months-1]+" has "+days+" days.");
}
}
