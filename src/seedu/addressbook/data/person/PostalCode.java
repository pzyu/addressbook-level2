package seedu.addressbook.data.person;

/**
 * Represents a Postal Code in a Person's Address
 */

public class PostalCode {
    private String value;
    
    public PostalCode(String value) {
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
