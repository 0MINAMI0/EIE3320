public class Item
{
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    private String artist;
    public Item(String theTitle, int time)
    {
        title = theTitle;
        playingTime = time;
        gotIt = true;
        comment = "";
    }

    public String getTitle() {
        return title;
    }
    
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * Return the comment for this item.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this item.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * Return information whether we own a copy of this item.
     */
    public boolean getOwn()
    {
        return gotIt;
    }
    
    public void setArtist(String in)
    {
        artist = in;
    }
    
    public String getArtist()
    {
        return artist;
    }

    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        System.out.println("Title: " + title);
        if(gotIt) {
            System.out.println("Got it: Yes");
        } else {
            System.out.println("Got it: No");
        }
        System.out.println("Playing time: " + playingTime);
        System.out.println("Comment: " + comment);
    }
    
}

