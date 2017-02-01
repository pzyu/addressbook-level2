package seedu.addressbook.data.person;

/**
 * Represents a Unit in a Person's Address
 */

public class Unit {
    private String value;
    
    public Unit(String value) {
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
