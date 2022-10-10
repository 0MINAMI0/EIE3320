/**
 * The Video class represents a video object. Information about the 
 * video is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2002-05-02
 */
public class Video extends Item
{
    private String title;
    private String director;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Constructor for objects of class Video
     */
    public Video(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }

    /**
     * Print details about this Video to the text terminal.
     */
    public void print()
    {
        System.out.println("Video");
        super.print();
        System.out.println("Director: " + director);
    }
}
