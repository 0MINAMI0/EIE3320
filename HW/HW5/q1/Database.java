import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.*;
public class Database
{
    private ArrayList<Item> items;
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored CDs and videos to the
     * text terminal.
     */
    public void list()
    {
        for(Iterator iter = items.iterator(); iter.hasNext(); )
        {
            Item item = (Item)iter.next();
            item.print();
            System.out.println();   
        }
    }

    public Item searchByTitle(String theTitle){
        ArrayList<Item> itemlist=new ArrayList<Item>();
        for(Iterator iter = items.iterator(); iter.hasNext(); )
        {
            Item item = (Item)iter.next();
            if(item.getTitle().equals(theTitle)){
                itemlist.add(item);
            }
        }
        return itemlist.get(0);
    }

    public Item searchByTilePattern(String Pat){
        ArrayList<Item> itemlist=new ArrayList<Item>();
        for(Iterator iter = items.iterator(); iter.hasNext();)
        {
            Pattern pattern = Pattern.compile(Pat, Pattern.CASE_INSENSITIVE);
            Item item = (Item)iter.next();
            Matcher matcher = pattern.matcher(item.getTitle());
            boolean matchFound = matcher.find();
            if(matchFound){
                itemlist.add(item);
            }
        }
        return itemlist.get(0);
    }

    public Item searchByPattern(String Pat){
        ArrayList<Item> itemlist=new ArrayList<Item>();
        for(Iterator iter = items.iterator(); iter.hasNext();)
        {
            Pattern pattern = Pattern.compile(Pat, Pattern.CASE_INSENSITIVE);
            Item item = (Item)iter.next();
            String str = item.getClass().getName();
            switch(str)
            {
                case "CD":
                    boolean CDFound1 = (pattern.matcher(item.getTitle())).find();
                    boolean CDFound2 = (pattern.matcher(item.getArtist())).find();
                    if(CDFound1|| CDFound2){
                        itemlist.add(item);  
                    }
                    break;

                case "Video":
                    boolean VideoFound1 = (pattern.matcher(item.getTitle())).find();
                    boolean VideoFound2 = (pattern.matcher(item.getComment())).find();
                    if(VideoFound1|| VideoFound2){
                        itemlist.add(item);  
                    }
                    break;

                case "VideoGame":
                    boolean VG1 = (pattern.matcher(item.getTitle())).find();
                    boolean VG2 = (pattern.matcher(item.getComment())).find();
                    if(VG1||VG2){
                        itemlist.add(item);
                    }
                break;
            }
        }
        return itemlist.get(0);
    }
    
    
    // public Item searchByPattern(String Pat){
        // ArrayList<Item> itemlist=new ArrayList<Item>();
        // for(Iterator iter = items.iterator(); iter.hasNext(); )
        // {
            // Pattern pattern = Pattern.compile(Pat, Pattern.CASE_INSENSITIVE);
            // Item item = (Item)iter.next();
            // String classname= item.getClass().getName();
            // switch(classname){
                // case "CD":
                    // boolean CD1 = (pattern.matcher(item.getTitle())).find();
                    // boolean CD2 = (pattern.matcher(item.getArtist())).find();
                    // if(CD1||CD2){
                        // itemlist.add(item);
                    // }
                // break;
                // case "VideoGame":
                    // boolean VG1 = (pattern.matcher(item.getTitle())).find();
                    // boolean VG2 = (pattern.matcher(item.getComment())).find();
                    // if(VG1||VG2){
                        // itemlist.add(item);
                    // }
                // break;
            // }
            
        // }
        // return itemlist.get(0);
    // }
    
    
}
