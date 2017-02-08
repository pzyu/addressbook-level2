package seedu.addressbook.data.tag;

import java.util.ArrayList;
import java.util.List;

/**
 * Taggings class maintains the list of all the tags added/deleted during the session
 */
public class Taggings {
    private List<String> tagList;
    
    public Taggings() {
        tagList = new ArrayList<String>();
    }
    
    /**
     * Adds a new tag into the array list 
     * @param isAdded       Whether the tag was added or removed
     * @param personName    Name of the person associated with tag
     * @param tagName       Name of the tag
     */
    public void addTag(boolean isAdded, String personName, String tagName) {
        tagList.add(String.format("%b %s [%s]", isAdded, personName, tagName));
    }
    
    /**
     * Formats all taggings as text
     */
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        
        for(String s: tagList) {
            builder.append(s);
        }
        
        return builder.toString();
    }
}
