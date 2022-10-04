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
    
    Item searchByTitle(String theTitle){
    Pattern pattern = Pattern.compile(theTitle, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(Item.getTitle());
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
    }
}
