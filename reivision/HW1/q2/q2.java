import java.util.*;
public class q2
{
    static public void cal(int in){
        int hours, mins, secs;
        hours = in/3600;
        mins = (in/60-hours*60);
        secs = in-hours*3600-mins*60;
        System.out.print(hours+" "+mins+" "+secs);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter");
        int in = input.nextInt();
        cal(in);
    }

}
