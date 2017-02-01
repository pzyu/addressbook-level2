package seedu.addressbook.data.person;

/**
 * Represents a Block in a Person's Address
 */

public class Block {
    private String value;
    
    public Block(String value) {
        this.value = value;
    }
    
    public boolean setValue(String newValue) {
        this.value = newValue;
        return true;
    }
    
    public String getValue() {
        return this.value;
    }
}
