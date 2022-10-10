
public class VideoGame
{
    private String title;
    private String platform;
    private int numberOfPlayers;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    
    public VideoGame(String theTitle, String thePlatform, int num, int time)
    {
        title = theTitle;
        platform = thePlatform;
        playingTime = time;
        numberOfPlayers = num;
        gotIt = false;
        comment = "<no comment>";
    }
    
    /**
     * Enter a comment for this CD.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * Return the comment for this CD.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this CD.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * Return information whether we own a copy of this CD.
     */
    public boolean getOwn()
    {
        return gotIt;
    }
    
    public void print()
    {
        System.out.println("VideoGame");
        System.out.println("Title: " + title);
        if(gotIt) {
            System.out.println("Got it: Yes");
        } else {
            System.out.println("Got it: No");
        }
        System.out.println("Playing time: " + playingTime);
        System.out.println("Comment: " + comment);
        System.out.println("Platform: " + platform);
        System.out.println("No. of players: " + numberOfPlayers);
    }
}
