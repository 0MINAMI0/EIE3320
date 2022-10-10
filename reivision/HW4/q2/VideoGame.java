
public class VideoGame extends Item
{
    private String platform;
    private int numberOfPlayers;
    private boolean gotIt;
    
    public VideoGame(String theTitle, String thePlatform, int num, int time)
    {
        super(theTitle, time);
        platform = thePlatform;
        numberOfPlayers = num;
        gotIt = false;
    }
    
    public void print()
    {
        System.out.println("VideoGame");
        super.print();
        System.out.println("Platform: " + platform);
        System.out.println("No. of players: " + numberOfPlayers);
    }
}
