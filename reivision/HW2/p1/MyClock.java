public class MyClock
{
    public static void main(String[] args) {
        ClockDisplay hkTime = new ClockDisplay(24,30);
        ClockDisplay londonTime = new ClockDisplay(13,30);
        hkTime.timeTick();
        londonTime.timeTick();
        ClockDisplay londonTime1 = new ClockDisplay(11,30);
        londonTime1.timeTick();
        System.out.println(londonTime1.getTime());
        System.out.println(londonTime.getTime());
        System.out.println(hkTime.getTime());
    }
}
