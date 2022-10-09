public class CD extends Item
{
    private String artist;
    private int numberOfTracks;
    
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
        super.setArtist(theArtist);
    }

    public String getArtist()
    {
        return super.getArtist();
    }

    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }
    
    
    public void print(){
        System.out.println("CD");
        super.print();
        System.out.println("Artisit: "+artist);
        System.out.println("No. of tracks: "+numberOfTracks);
    }
}
