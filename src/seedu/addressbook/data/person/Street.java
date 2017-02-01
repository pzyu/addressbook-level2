package seedu.addressbook.data.person;

/**
 * Represents a Street in a Person's Address
 */

public class Street {
    private String value;
    
    public Street(String value) {
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
