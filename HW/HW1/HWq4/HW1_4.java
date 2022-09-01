import java.util.*;
public class HW1_4 {
    public static int daysInMonth(int month){
        int days = 0;
        String Months = " ";
        switch(month){
            case 1 :
                Months = "January";
                days = 31;
                break;
            case 2 :
                Months = "February";
                days = 28;
                break;
            case 3 :
                Months = "March";
                days = 31;
                break;
            case 4 :
                Months = "April";
                days = 30;
                break;
            case 5 :
                Months = "May";
                days = 31;
                break;
            case 6 :
                Months = "June";
                days = 30;
                break;
            case 7 :
                Months = "July";
                days = 31;
                break;
            case 8 :
                Months = "August";
                days = 31;
                break;
            case 9 :
                Months = "September";
                days = 30;
                break;
            case 10 :
                Months = "October";
                days = 31;
                break;
            case 11 :
                Months = "November";
                days = 30;
                break;
            case 12 :
                Months = "December";
                days = 31;
                break;  
        }   
        System.out.print(Months);
        return days;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month (January = 1): ");
        int tem = input.nextInt();
        System.out.print(" has " + daysInMonth(tem) + " days");
    }
}