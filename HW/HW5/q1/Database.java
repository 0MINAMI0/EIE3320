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
            System.out.println();   // empty line between items
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
            Matcher matcher1 = pattern.matcher(item.getTitle());
            Matcher matcher2 = pattern.matcher(item.getComment());
            boolean matchFound1 = matcher1.find();
            boolean matchFound2 = matcher2.find();
            if(matchFound1==true || matchFound2==true){
                itemlist.add(item);
            }
        }
        return itemlist.get(0);
    }
    }

