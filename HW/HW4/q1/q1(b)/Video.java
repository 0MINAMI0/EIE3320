//LYU Hao 20042543d
public class Video extends Item
{
    private String director;

    public Video(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }
    public String getDirector()
    {
        return director;
    }
    public void print()
    {
        System.out.println("Video");
        super.print();
        System.out.println("Director: " + director);
    }
}
