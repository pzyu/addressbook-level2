package seedu.addressbook.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class Formatter {
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    private final Scanner in;
    private final PrintStream out;
    
    public Formatter(Scanner in, PrintStream out) {
        this.in = in;
        this.out = out;
    }
    
    public void showWithPrefix(String message) {
        out.print(LS + message);
    }
    
    public void showWelcomeMessage(String message, String version, String launchArgs, String storageFileInfo) {
        showToUser(DIVIDER,
                   DIVIDER,
                   message,
                   version,
                   launchArgs,
                   storageFileInfo,
                   DIVIDER);
    }
    
    public void showStatusMessage(String message) {
        showToUser(message,
                   DIVIDER,
                   DIVIDER);
    }
    
    public void showResultMessage(String message) {
        showToUser(message,
                   DIVIDER);
    }
    
    public void showToUser(String... message) {
        for (String m : message) {
            out.println(LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX));
        }
    }
    
}
