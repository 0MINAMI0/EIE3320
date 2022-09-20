//LYU Hao 20042543d
import java.util.ArrayList;
import java.util.Iterator;

public class Database
{
    private ArrayList cds;
    private ArrayList videos;
    private ArrayList videoGames;

    public Database()
    {
        cds = new ArrayList();
        videos = new ArrayList();
    }
    
    /**
     * Add a CD to the database.
     */
    public void addCD(CD theCD)
    {
        cds.add(theCD);
    }

    /**
     * Add a video to the database.
     */
    public void addVideo(Video theVideo)
    {
        videos.add(theVideo);
    }

    public void addVideoGame(VideoGame theVideoGame)
    {
        videoGames.add(theVideoGame);
    }
    
    /**
     * Print a list of all currently stored CDs and videos to the
     * text terminal.
     */
    public void list()
    {
        // print list of CDs
        for(Iterator iter = cds.iterator(); iter.hasNext(); ) {
            CD cd = (CD)iter.next();
            cd.print();
            System.out.println();   // empty line between items
        }

        // print list of videos
        for(Iterator iter = videos.iterator(); iter.hasNext(); ) {
            Video video = (Video)iter.next();
            video.print();
            System.out.println();   // empty line between items
        }   
        
        for(Iterator iter = videoGames.iterator(); iter.hasNext(); ) {
            VideoGame videoGame = (VideoGame)iter.next();
            videoGame.print();
            System.out.println(); 
        } 
    }
}
