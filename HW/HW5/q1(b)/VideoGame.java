//LYU Hao 20042543d
public class VideoGame extends Item
{
    private String title;
    private String platform;
    private int numberOfPlayers;
    private int playingTime;
    public VideoGame(String theTitle, String theplatform, int thenumberOfPlayers, int theplayingTime)
    {
        super(theTitle,theplayingTime);
        platform = theplatform;
        numberOfPlayers = thenumberOfPlayers;
    }
    
    public void print()
    {
        System.out.println("VideoGame");
        super.print();
        System.out.println("Platform: " + platform);
        System.out.println("No. of players: " + numberOfPlayers);
    }
}
