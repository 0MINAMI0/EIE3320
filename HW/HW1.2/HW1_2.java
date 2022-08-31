import java.util.*;
public class HW1_2 {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in); 
            System.out.print("Enter the number of seconds: "); 
            int times = input.nextInt();
            int hours = times/3600;
            int minutes = (times%3600/60);
            int seconds = times%60;
            System.out.print(times + " seconds is " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
        }
    }